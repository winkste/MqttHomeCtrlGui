/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myMqtt;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author stephan_wink
 */
public class MyMqttClient implements MqttCallback 
{
    private MqttClient client = null;
    private List<MqttSubscriber> subsList = new ArrayList<MqttSubscriber>();
    private String address;
    private String identifier;
    
    private static final class InstanceHolder {
        static final MyMqttClient INSTANCE = new MyMqttClient();
    }
    
    private MyMqttClient(){}
    
    public static MyMqttClient getInstance () {
        return InstanceHolder.INSTANCE;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public void connectClient()
    {        
        if(null == client)
        {
            try{
                client = new MqttClient(address, identifier);
                client.setCallback(this);
                client.connect();
            } catch (MqttException ex) {
                Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            if(client.isConnected() == true)
            {
                try {
                    client.disconnect();
                    client = null;
                    client = new MqttClient(address, identifier);
                    client.setCallback(this);
                    client.connect();
                } catch (MqttException ex) {
                    Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    
    public void setSubscriber(MqttSubscriber subs)
    {
        subsList.add(subs);
        try {
            client.subscribe(subs.getFilter());
        } catch (MqttException ex) {
            Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void connectionLost(Throwable thrwbl) {
         System.out.println("TODO: handle connection lost exception");
    }

    @Override
    public void messageArrived(String filter, MqttMessage mm) throws Exception 
    {
        //System.out.println("Filter: " + filter + "Msg: " + new String(mm.getPayload()));
        for(int idx = 0; idx < subsList.size(); idx++)
        {
            if(subsList.get(idx).getFilter().equals(filter))
            {
                subsList.get(idx).notify(new String(mm.getPayload()));
            }
        }      
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MqttPublisher createPublisher(String filter)
    {
        return(new MqttPublisher(){
            @Override
            public String getFilter() {
                return filter;
            }

            @Override
            public void publish(String msg) {
                try {
                    System.out.println("mqtt publisher -> " + this.getFilter() + msg);
                    MqttMessage message = new MqttMessage(msg.getBytes());
                    client.publish(this.getFilter(), message);
                } catch (MqttException ex) {
                    Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void publish(String filter, String msg)
    {
        try {
            MqttMessage message = new MqttMessage(msg.getBytes());
            client.publish("javaprog/button", message);
        } catch (MqttException ex) {
            Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
