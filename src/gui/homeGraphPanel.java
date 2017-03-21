/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import graph.DataSetCallB;
import graph.MySensorPanel;
import myMqtt.MqttSubscriber;

/**
 *
 * @author winkste
 */
public class homeGraphPanel extends javax.swing.JPanel {
    
    private MySensorPanel panel;
    private DataSetCallB tempCallBack;
    private DataSetCallB humCallBack;

    /**
     * Creates new form homeTempPanel
     * @param room
     */
    public homeGraphPanel(String room) {
        initComponents();
        
        panel = new MySensorPanel(room);
        //panel.setSize(graphPanel_sjp.getSize());
        tempCallBack = panel.getTempSetCallback();
        humCallBack = panel.getHumSetCallback();
        
       
        graphPanel_sjp.add(panel.getPanel());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphPanel_sjp = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1006, 455));

        graphPanel_sjp.setBackground(new java.awt.Color(255, 255, 255));
        graphPanel_sjp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graphPanel_sjp.setPreferredSize(new java.awt.Dimension(1012, 455));
        graphPanel_sjp.setRequestFocusEnabled(false);
        graphPanel_sjp.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(graphPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel graphPanel_sjp;
    // End of variables declaration//GEN-END:variables

    public MqttSubscriber getMqttSubscriberTemperature(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                tempCallBack.setData(Float.parseFloat(msg));
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberHumidity(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                humCallBack.setData(Float.parseFloat(msg));
            }
        });
    }

}
