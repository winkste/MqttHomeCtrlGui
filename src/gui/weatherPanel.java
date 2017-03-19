/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import control.MyWeather;
import javax.swing.SwingWorker;
import procExe.ExePython;

/**
 *
 * @author winkste
 */
public class weatherPanel extends javax.swing.JPanel {

    /**
     * Creates new form homeTempPanel
     */
    public weatherPanel() {
        initComponents();
        
        new DataCollector().execute();
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
        pos_sjl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstDayPanel_smp = new gui.smallWeatherPanel();
        secondDayPanel_smp = new gui.smallWeatherPanel();
        thirdDayPanel_smp = new gui.smallWeatherPanel();
        todayPanel_bwp = new gui.bigWeatherPanel();

        setPreferredSize(new java.awt.Dimension(1012, 455));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1012, 455));
        jPanel1.setMinimumSize(new java.awt.Dimension(1012, 455));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1012, 455));

        pos_sjl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        pos_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pos_sjl.setText("Hannover");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("16:05:33");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("extra info");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("27. Jan 2017");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("extra info");

        todayPanel_bwp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstDayPanel_smp, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1418, 1418, 1418)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(967, 967, 967)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondDayPanel_smp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(thirdDayPanel_smp, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(todayPanel_bwp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pos_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(todayPanel_bwp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstDayPanel_smp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(secondDayPanel_smp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdDayPanel_smp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.smallWeatherPanel firstDayPanel_smp;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pos_sjl;
    private gui.smallWeatherPanel secondDayPanel_smp;
    private gui.smallWeatherPanel thirdDayPanel_smp;
    private gui.bigWeatherPanel todayPanel_bwp;
    // End of variables declaration//GEN-END:variables

    private String lastWeatherSet_str;
    public static long counter = 1;
    
    class DataCollector extends SwingWorker<Long, Object>
    {       
        @Override public Long doInBackground()
        {
            try 
            { 
                // update cycle 1 minute
                Thread.sleep(10000); 
            } catch ( InterruptedException e ) { }
          new DataCollector().execute();
          return (counter++);
        }

        @Override protected void done()
        {
            try
            {
                lastWeatherSet_str = ExePython.execPython("requestWeather.py");
                System.out.println(lastWeatherSet_str);
                MyWeather weather = new MyWeather(lastWeatherSet_str);
                todayPanel_bwp.setDay_str(weather.getDay0_str());
                todayPanel_bwp.setTempMin_str(weather.getDay0MinTemp_str());
                todayPanel_bwp.setTempMax_str(weather.getDay0MaxTemp_str());
                todayPanel_bwp.setTemp_str(weather.getDay0ActTemp_str());
                todayPanel_bwp.setHum_str(weather.getDay0Hum_str());
                //todayPanel_bwp.setIconPath_str(weather.getDay0IconPath_str());
                
                firstDayPanel_smp.setDay_str(weather.getDay1_str());
                firstDayPanel_smp.setTempMax_str(weather.getDay1MaxTemp_str());
                firstDayPanel_smp.setTempMin_str(weather.getDay1MinTemp_str());
                //firstDayPanel_smp.setIconPath_str(weather.getDay1IconPath_str());
                
                secondDayPanel_smp.setDay_str(weather.getDay2_str());
                secondDayPanel_smp.setTempMax_str(weather.getDay2MaxTemp_str());
                secondDayPanel_smp.setTempMin_str(weather.getDay2MinTemp_str());
                //secondDayPanel_smp.setIconPath_str(weather.getDay2IconPath_str());
                
                thirdDayPanel_smp.setDay_str(weather.getDay3_str());
                thirdDayPanel_smp.setTempMax_str(weather.getDay3MaxTemp_str());
                thirdDayPanel_smp.setTempMin_str(weather.getDay3MinTemp_str());
                //thirdDayPanel_smp.setIconPath_str(weather.getDay3IconPath_str());
                
            }
            catch ( /* InterruptedException, ExecutionException */ Exception e ) { }
        }
    }

}
