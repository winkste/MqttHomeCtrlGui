/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.btnIntface;

/**
 *
 * @author winkste
 */
public class buttonPanel extends javax.swing.JPanel {

    /**
     * Creates new form homeTempPanel
     */
    public buttonPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    button2_sjtb = new javax.swing.JToggleButton();
    button1_sjtb = new javax.swing.JToggleButton();
    button3_sjtb = new javax.swing.JToggleButton();
    button4_sjtb = new javax.swing.JToggleButton();

    jPanel1.setBackground(new java.awt.Color(204, 255, 204));
    jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel1.setMaximumSize(new java.awt.Dimension(595, 333));
    jPanel1.setMinimumSize(new java.awt.Dimension(595, 333));
    jPanel1.setName(""); // NOI18N
    jPanel1.setPreferredSize(new java.awt.Dimension(595, 333));

    button2_sjtb.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
    button2_sjtb.setText("Button 2");

    button1_sjtb.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
    button1_sjtb.setText("Button 1");
    button1_sjtb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button1_sjtbActionPerformed(evt);
      }
    });

    button3_sjtb.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
    button3_sjtb.setText("Button 3");

    button4_sjtb.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
    button4_sjtb.setText("Button 4");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(button3_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
          .addComponent(button1_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(button2_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
          .addComponent(button4_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(button2_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
          .addComponent(button1_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(button3_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
          .addComponent(button4_sjtb, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        .addGap(14, 14, 14))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

    private void button1_sjtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_sjtbActionPerformed
        // TODO add your handling code here:
        btnIface_if.notifyButtonPressed(1);
    }//GEN-LAST:event_button1_sjtbActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JToggleButton button1_sjtb;
  private javax.swing.JToggleButton button2_sjtb;
  private javax.swing.JToggleButton button3_sjtb;
  private javax.swing.JToggleButton button4_sjtb;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
  public btnIntface btnIface_if;
  
  public void register (btnIntface btnIface_if)
  {
    this.btnIface_if = btnIface_if;
  }
}
