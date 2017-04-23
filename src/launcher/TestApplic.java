/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import gui.homeGraphPanel;
import gui.startFrame;
import myMqtt.MyMqttClient;

/**
 *
 * @author winkste
 */
public class TestApplic {
  
  public static gui.buttonPanel buttonPanel;
  public static gui.weatherPanel weatherPanel;
  public static gui.homeTempPanel tempPanelLivingRoom;
  public static gui.valvePanel valvePanel;
  public static gui.homeGraphPanel graphLivingRoom;
  public static gui.startFrame myStartFrame;
  public static gui.homeTempPanel carportTempPanel;
  public static gui.homeGraphPanel graphCarport;
  public static gui.homeAreaPanel areaGraph;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                buttonPanel = new gui.buttonPanel();
                weatherPanel = new gui.weatherPanel(); 
                tempPanelLivingRoom = new gui.homeTempPanel("Wohnzimmer");
                valvePanel = new gui.valvePanel();
                graphLivingRoom = new gui.homeGraphPanel("Wohnzimmer");
                myStartFrame = new startFrame();
                carportTempPanel = new gui.homeTempPanel("Carport");
                graphCarport = new gui.homeGraphPanel("Carport");
                areaGraph = new gui.homeAreaPanel();
               
                MyMqttClient client = MyMqttClient.getInstance();
                client.setAddress("tcp://192.168.178.43:1883");
                client.setIdentifier("macBook_pro");
                client.connectClient();

                client.setSubscriber(tempPanelLivingRoom.getMqttSubscriberTemperature("/fhem/esp/1/Temperature"));
                client.setSubscriber(tempPanelLivingRoom.getMqttSubscriberHumidity("/fhem/esp/1/Humidity"));
                tempPanelLivingRoom.SetHumidityThreshold(50.0);
                client.setSubscriber(graphLivingRoom.getMqttSubscriberTemperature("/fhem/esp/1/Temperature"));
                client.setSubscriber(graphLivingRoom.getMqttSubscriberHumidity("/fhem/esp/1/Humidity"));
                
                client.setSubscriber(carportTempPanel.getMqttSubscriberTemperature("/fhem/esp/7/Temperature"));
                client.setSubscriber(carportTempPanel.getMqttSubscriberHumidity("/fhem/esp/7/Humidity"));
                carportTempPanel.SetHumidityThreshold(50.0);
                client.setSubscriber(graphCarport.getMqttSubscriberTemperature("/fhem/esp/7/Temperature"));
                client.setSubscriber(graphCarport.getMqttSubscriberHumidity("/fhem/esp/7/Humidity"));
                
                client.setSubscriber(areaGraph.getMqttSubscriberCarportTemperature("/fhem/esp/7/Temperature"));
                client.setSubscriber(areaGraph.getMqttSubscriberCarportHumidity("/fhem/esp/7/Humidity"));
                client.setSubscriber(areaGraph.getMqttSubscriberLivingTemperature("/fhem/esp/1/Temperature"));
                client.setSubscriber(areaGraph.getMqttSubscriberLivingHumidity("/fhem/esp/1/Humidity"));
                client.setSubscriber(areaGraph.getMqttSubscriberHallTemperature("/fhem/esp/4/Temperature"));
                client.setSubscriber(areaGraph.getMqttSubscriberHallHumidity("/fhem/esp/4/Humidity"));
                client.setSubscriber(areaGraph.getMqttSubscriberKitchenTemperature("/fhem/esp/2/Temperature"));
                client.setSubscriber(areaGraph.getMqttSubscriberKitchenHumidity("/fhem/esp/2/Humidity"));
                
                //myStartFrame.addPanel(buttonPanel);
                myStartFrame.addPanel(weatherPanel);
                myStartFrame.addPanel(tempPanelLivingRoom);
                myStartFrame.addPanel(graphLivingRoom);
                myStartFrame.addPanel(carportTempPanel);
                myStartFrame.addPanel(graphCarport);
                
                myStartFrame.addPanel(areaGraph);
                //myStartFrame.addPanel(valvePanel);
                
                myStartFrame.setVisible(true);
                //new startFrame().setVisible(true);
            }
        });
    }
    
}
