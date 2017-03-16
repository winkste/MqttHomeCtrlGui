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
    private MqttClient client;
    private final int INIT = 0;
    private final int CONNECTED = 1;
    private int clientState = INIT;
    private List<MqttSubscriber> subsList = new ArrayList<MqttSubscriber>();
    
    public void connectClient(String address, String identifier)
    {
        try{
            /*client = new MqttClient("tcp://192.168.178.43:1883", "macBook_pro");*/
            client = new MqttClient(address, identifier);
            client.setCallback(this);
            client.connect();
            clientState = CONNECTED;
        } catch (MqttException ex) {
            Logger.getLogger(MyMqttClient.class.getName()).log(Level.SEVERE, null, ex);
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void messageArrived(String filter, MqttMessage mm) throws Exception 
    {
        System.out.println("Filter: " + filter + "Msg: " + new String(mm.getPayload()));
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
