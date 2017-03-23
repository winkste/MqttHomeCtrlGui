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
  public static gui.homeTempPanel tempPanel;
  public static gui.valvePanel valvePanel;
  public static homeGraphPanel homeGraph;
  public static gui.startFrame myStartFrame;
  public static gui.homeTempPanel hallTempPanel;

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
                tempPanel = new gui.homeTempPanel("Wohnzimmer");
                valvePanel = new gui.valvePanel();
                homeGraph = new gui.homeGraphPanel("Wohnzimmer");
                myStartFrame = new startFrame();
                hallTempPanel = new gui.homeTempPanel("Flur");
              
                MyMqttClient client = new MyMqttClient();      
                client.connectClient("tcp://192.168.178.43:1883", "macBook_pro");  
                client.setSubscriber(tempPanel.getMqttSubscriberTemperature("/fhem/esp/1/Temperature"));
                client.setSubscriber(tempPanel.getMqttSubscriberHumidity("/fhem/esp/1/Humidity"));
                client.setSubscriber(homeGraph.getMqttSubscriberTemperature("/fhem/esp/1/Temperature"));
                client.setSubscriber(homeGraph.getMqttSubscriberHumidity("/fhem/esp/1/Humidity"));
                tempPanel.SetHumidityThreshold(50.0);
                
                client.setSubscriber(hallTempPanel.getMqttSubscriberTemperature("/fhem/esp/4/Temperature"));
                client.setSubscriber(hallTempPanel.getMqttSubscriberHumidity("/fhem/esp/4/Humidity"));
                hallTempPanel.SetHumidityThreshold(50.0);
                
                myStartFrame.addPanel(buttonPanel);
                myStartFrame.addPanel(weatherPanel);
                myStartFrame.addPanel(tempPanel);
                myStartFrame.addPanel(hallTempPanel);
                myStartFrame.addPanel(valvePanel);
                myStartFrame.addPanel(homeGraph);
              
                myStartFrame.setVisible(true);
                //new startFrame().setVisible(true);
            }
        });
    }
    
}
