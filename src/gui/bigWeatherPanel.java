/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author stephan_wink
 */
public class bigWeatherPanel extends javax.swing.JPanel {

    /**
     * Creates new form smallWeatherPanel
     */
    public bigWeatherPanel() {
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

    day_sjl = new javax.swing.JLabel();
    picture_sjl = new javax.swing.JLabel();
    temp_sjl = new javax.swing.JLabel();

    setBackground(new java.awt.Color(0, 51, 102));

    day_sjl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    day_sjl.setForeground(new java.awt.Color(255, 255, 255));
    day_sjl.setText("Today");

    picture_sjl.setBackground(new java.awt.Color(204, 255, 204));
    picture_sjl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-set/GIF/150x150/blizzard.gif"))); // NOI18N
    picture_sjl.setText("picture");

    temp_sjl.setBackground(new java.awt.Color(255, 255, 255));
    temp_sjl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    temp_sjl.setForeground(new java.awt.Color(255, 255, 255));
    temp_sjl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    temp_sjl.setText("10°C/-05°C");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(14, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(day_sjl)
            .addGap(18, 18, 18)
            .addComponent(picture_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(temp_sjl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(day_sjl)
          .addComponent(picture_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(temp_sjl, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel day_sjl;
  private javax.swing.JLabel picture_sjl;
  private javax.swing.JLabel temp_sjl;
  // End of variables declaration//GEN-END:variables
}
