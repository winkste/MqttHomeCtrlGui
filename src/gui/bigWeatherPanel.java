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
        minMax_sjl = new javax.swing.JLabel();
        temp_sjl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hum_sjl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        day_sjl.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        day_sjl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        day_sjl.setText("Heute");
        day_sjl.setToolTipText("");

        picture_sjl.setBackground(new java.awt.Color(204, 255, 204));
        picture_sjl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-set/GIF/250x250/blizzard.gif"))); // NOI18N

        minMax_sjl.setBackground(new java.awt.Color(255, 255, 255));
        minMax_sjl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        minMax_sjl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        minMax_sjl.setText("(10°C/-05 °C)");

        temp_sjl.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        temp_sjl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        temp_sjl.setText("7");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("°C");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setText("Temperatur");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Luftfeuchtigkeit");
        jLabel4.setToolTipText("");

        hum_sjl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        hum_sjl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        hum_sjl.setText("81");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temp_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hum_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(minMax_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day_sjl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture_sjl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(day_sjl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minMax_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(temp_sjl)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(hum_sjl)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel day_sjl;
    private javax.swing.JLabel hum_sjl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel minMax_sjl;
    private javax.swing.JLabel picture_sjl;
    private javax.swing.JLabel temp_sjl;
    // End of variables declaration//GEN-END:variables

    private String day_str;
    private String tempMin_str = "0";
    private String tempMax_str = "0";
    private String temp_str = "0";
    private String hum_str = "50";
    private String iconPath_str;

    public String getDay_str() {
        return day_str;
    }

    public void setDay_str(String newDay_str) {
        this.day_str = newDay_str;
        this.day_sjl.setText(newDay_str);
    }

    public String getTempMin_str() {
        return tempMin_str;
    }

    public void setTempMin_str(String newTempMin_str) {
        this.tempMin_str = newTempMin_str;
        this.minMax_sjl.setText("(" + tempMin_str + "°C/" + tempMax_str + "°C)");
    }

    public String getTempMax_str() {
        return tempMax_str;
    }

    public void setTempMax_str(String newTempMax_str) {
        this.tempMax_str = newTempMax_str;
        this.minMax_sjl.setText("(" + tempMin_str + "°C/" + tempMax_str + "°C)");
    }

    public String getTemp_str() {
        return temp_str;
    }

    public void setTemp_str(String newTemp_str) {
        this.temp_str = newTemp_str;
        this.temp_sjl.setText(newTemp_str);
    }

    public String getHum_str() {
        return hum_str;
    }

    public void setHum_str(String newHum_str) {
        this.hum_str = newHum_str;
        this.hum_sjl.setText(newHum_str);
    }
    
    public String getIconPath_str() {
        return iconPath_str;
    }
        
    public void setIconPath_str(String iconPath_str) {
        this.iconPath_str = iconPath_str;
        this.picture_sjl.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath_str)));
    }
}
