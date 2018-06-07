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
  
  //public static gui.buttonPanel buttonPanel;
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
                //buttonPanel = new gui.buttonPanel();
                weatherPanel = new gui.weatherPanel(); 
                tempPanelLivingRoom = new gui.homeTempPanel("Wohnzimmer");
                valvePanel = new gui.valvePanel();
                graphLivingRoom = new gui.homeGraphPanel("Wohnzimmer");
                myStartFrame = new startFrame();
                carportTempPanel = new gui.homeTempPanel("Carport");
                graphCarport = new gui.homeGraphPanel("Carport");
                areaGraph = new gui.homeAreaPanel();
               
                MyMqttClient client = MyMqttClient.getInstance();
                client.setAddress("tcp://192.168.178.45:1883");
                client.setIdentifier("macBook_pro");
                client.connectClient();

                client.setSubscriber(tempPanelLivingRoom.getMqttSubscriberTemperature("std/dev30/s/bme/temp"));
                client.setSubscriber(tempPanelLivingRoom.getMqttSubscriberHumidity("std/dev30/s/bme/hum"));
                tempPanelLivingRoom.SetHumidityThreshold(50.0);
                client.setSubscriber(graphLivingRoom.getMqttSubscriberTemperature("std/dev30/s/bme/temp"));
                client.setSubscriber(graphLivingRoom.getMqttSubscriberHumidity("std/dev30/s/bme/hum"));
                
                client.setSubscriber(carportTempPanel.getMqttSubscriberTemperature("std/dev22/s/temp_hum/temp"));
                client.setSubscriber(carportTempPanel.getMqttSubscriberHumidity("std/dev22/s/temp_hum/hum"));
                carportTempPanel.SetHumidityThreshold(50.0);
                client.setSubscriber(graphCarport.getMqttSubscriberTemperature("std/dev22/s/temp_hum/temp"));
                client.setSubscriber(graphCarport.getMqttSubscriberHumidity("std/dev22/s/temp_hum/hum"));
                
                client.setSubscriber(areaGraph.getMqttSubscriberCarportTemperature("std/dev22/s/temp_hum/temp"));
                client.setSubscriber(areaGraph.getMqttSubscriberCarportHumidity("std/dev22/s/temp_hum/hum"));
                client.setSubscriber(areaGraph.getMqttSubscriberKitchenTemperature("std/dev21/s/temp_hum/temp"));
                client.setSubscriber(areaGraph.getMqttSubscriberKitchenHumidity("std/dev21/s/temp_hum/hum"));
                client.setSubscriber(areaGraph.getMqttSubscriberHallTemperature("std/dev27/s/temp_hum/temp"));
                client.setSubscriber(areaGraph.getMqttSubscriberHallHumidity("std/dev27/s/temp_hum/hum"));
                client.setSubscriber(areaGraph.getMqttSubscriberLivingTemperature("std/dev30/s/bme/temp"));
                client.setSubscriber(areaGraph.getMqttSubscriberLivingHumidity("std/dev30/s/bme/hum"));
                
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
