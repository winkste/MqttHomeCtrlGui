/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import myMqtt.MqttPublisher;
import myMqtt.MqttSubscriber;

/**
 *
 * @author winkste
 */
public class gardenControl extends javax.swing.JPanel { 
    private boolean genData = false;
    private boolean relay1Active_bol = false;
    private boolean relay2Active_bol = false;
    private boolean relay3Active_bol = false;
    private boolean relay4Active_bol = false;
    private boolean relay5Active_bol = false;
    private boolean relay6Active_bol = false;
    private boolean relay7Active_bol = false;
    private boolean relay8Active_bol = false;

    private MqttPublisher pub1 = null;
    private MqttPublisher pub2 = null;
    private MqttPublisher pub3 = null;
    private MqttPublisher pub4 = null;
    private MqttPublisher pub5 = null;
    private MqttPublisher pub6 = null;
    private MqttPublisher pub7 = null;
    private MqttPublisher pub8 = null;
    
    /**
     * Creates new form homeTempPanel
     * @param room
     */
    public gardenControl(String room) {
        initComponents();
        room_sjl.setText(room);
        jPanel1.setBackground(new java.awt.Color(48,131,251));
        SetButtonInvisible();
    }
    
    public gardenControl(String room, boolean newGenData) {
        initComponents();
        room_sjl.setText(room);
        genData = newGenData;
        new DataCollector().execute();
        jPanel1.setBackground(new java.awt.Color(255,102,102));
        SetButtonInvisible();
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
        jPanel2 = new javax.swing.JPanel();
        relay1_jtb = new javax.swing.JToggleButton();
        relay2_jtb = new javax.swing.JToggleButton();
        relay3_jtb = new javax.swing.JToggleButton();
        relay4_jtb = new javax.swing.JToggleButton();
        relay5_jtb = new javax.swing.JToggleButton();
        relay6_jtb = new javax.swing.JToggleButton();
        relay7_jtb = new javax.swing.JToggleButton();
        relay8_jtb = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        room_sjl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        temp_sjl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        humidity_sjl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label4_jl = new javax.swing.JLabel();
        moisture_sjl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(788, 377));
        setMinimumSize(new java.awt.Dimension(788, 377));
        setPreferredSize(new java.awt.Dimension(788, 377));

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1012, 455));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2, 10, 5));

        relay1_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay1_jtb.setText("Button 1");
        relay1_jtb.setEnabled(false);
        relay1_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay1_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay1_jtb);

        relay2_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay2_jtb.setText("Button 2");
        relay2_jtb.setEnabled(false);
        relay2_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay2_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay2_jtb);

        relay3_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay3_jtb.setText("Button 3");
        relay3_jtb.setEnabled(false);
        relay3_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay3_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay3_jtb);

        relay4_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay4_jtb.setText("Steckdose 4");
        relay4_jtb.setEnabled(false);
        relay4_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay4_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay4_jtb);

        relay5_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay5_jtb.setText("Button 5");
        relay5_jtb.setEnabled(false);
        relay5_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay5_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay5_jtb);

        relay6_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay6_jtb.setText("Button 6");
        relay6_jtb.setEnabled(false);
        relay6_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay6_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay6_jtb);

        relay7_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay7_jtb.setText("Button 7");
        relay7_jtb.setEnabled(false);
        relay7_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay7_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay7_jtb);

        relay8_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relay8_jtb.setText("Button 8");
        relay8_jtb.setToolTipText("");
        relay8_jtb.setEnabled(false);
        relay8_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay8_jtbActionPerformed(evt);
            }
        });
        jPanel2.add(relay8_jtb);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        room_sjl.setFont(new java.awt.Font("LCD", 1, 60)); // NOI18N
        room_sjl.setForeground(new java.awt.Color(102, 102, 102));
        room_sjl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        room_sjl.setText("Garten");

        jLabel4.setFont(new java.awt.Font("LCD", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("°C");

        temp_sjl.setFont(new java.awt.Font("LCD", 1, 48)); // NOI18N
        temp_sjl.setForeground(new java.awt.Color(102, 102, 102));
        temp_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temp_sjl.setText("+00.0");

        jLabel3.setFont(new java.awt.Font("LCD", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Temperatur");

        jLabel5.setFont(new java.awt.Font("LCD", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Luftfeuchtigkeit");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        humidity_sjl.setFont(new java.awt.Font("LCD", 1, 48)); // NOI18N
        humidity_sjl.setForeground(new java.awt.Color(102, 102, 102));
        humidity_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        humidity_sjl.setText("+00.0");

        jLabel7.setFont(new java.awt.Font("LCD", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("%");

        label4_jl.setFont(new java.awt.Font("LCD", 0, 24)); // NOI18N
        label4_jl.setForeground(new java.awt.Color(102, 102, 102));
        label4_jl.setText("Bodenfeuchtigkeit");
        label4_jl.setToolTipText("");
        label4_jl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        moisture_sjl.setFont(new java.awt.Font("LCD", 1, 48)); // NOI18N
        moisture_sjl.setForeground(new java.awt.Color(102, 102, 102));
        moisture_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        moisture_sjl.setText("+00.0");

        jLabel8.setFont(new java.awt.Font("LCD", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(room_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4_jl)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moisture_sjl, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(humidity_sjl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(temp_sjl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(527, 527, 527))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(room_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(temp_sjl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(humidity_sjl)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4_jl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisture_sjl)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void relay1_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay1_jtbActionPerformed
        if(true == relay1_jtb.isSelected()) pub1.publish("ON");
        else pub1.publish("OFF");
    }//GEN-LAST:event_relay1_jtbActionPerformed

    private void relay5_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay5_jtbActionPerformed
        if(true == relay5_jtb.isSelected()) pub5.publish("ON");
        else pub5.publish("OFF");
    }//GEN-LAST:event_relay5_jtbActionPerformed

    private void relay2_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay2_jtbActionPerformed
        if(true == relay2_jtb.isSelected()) pub2.publish("ON");
        else pub2.publish("OFF");
    }//GEN-LAST:event_relay2_jtbActionPerformed

    private void relay3_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay3_jtbActionPerformed
        if(true == relay3_jtb.isSelected()) pub3.publish("ON");
        else pub3.publish("OFF");
    }//GEN-LAST:event_relay3_jtbActionPerformed

    private void relay4_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay4_jtbActionPerformed
        if(true == relay4_jtb.isSelected()) pub4.publish("ON");
        else pub4.publish("OFF");
    }//GEN-LAST:event_relay4_jtbActionPerformed

    private void relay6_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay6_jtbActionPerformed
        if(true == relay6_jtb.isSelected()) pub6.publish("ON");
        else pub6.publish("OFF");
    }//GEN-LAST:event_relay6_jtbActionPerformed

    private void relay7_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay7_jtbActionPerformed
        if(true == relay7_jtb.isSelected()) pub7.publish("ON");
        else pub7.publish("OFF");
    }//GEN-LAST:event_relay7_jtbActionPerformed

    private void relay8_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay8_jtbActionPerformed
        if(true == relay8_jtb.isSelected()) pub8.publish("ON");
        else pub8.publish("OFF");
    }//GEN-LAST:event_relay8_jtbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel humidity_sjl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label4_jl;
    private javax.swing.JLabel moisture_sjl;
    private javax.swing.JToggleButton relay1_jtb;
    private javax.swing.JToggleButton relay2_jtb;
    private javax.swing.JToggleButton relay3_jtb;
    private javax.swing.JToggleButton relay4_jtb;
    private javax.swing.JToggleButton relay5_jtb;
    private javax.swing.JToggleButton relay6_jtb;
    private javax.swing.JToggleButton relay7_jtb;
    private javax.swing.JToggleButton relay8_jtb;
    private javax.swing.JLabel room_sjl;
    private javax.swing.JLabel temp_sjl;
    // End of variables declaration//GEN-END:variables

    
    public MqttSubscriber getMqttSubscriberTemperature(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                if(genData != true)
                {
                    temp_sjl.setText(msg);
                }
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
                if(genData != true)
                {
                    humidity_sjl.setText(msg);
                }
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberMoisture(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                if(genData != true)
                {
                    moisture_sjl.setText(msg);
                }
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay1(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay1Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay2(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay2Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay3(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay3Active_bol = msg.contains("ON");
                UpdateButtonField();       
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay4(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay4Active_bol = msg.contains("ON");
                UpdateButtonField();       
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay5(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay5Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay6(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay6Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay7(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay7Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberRelay8(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                relay8Active_bol = msg.contains("ON");
                UpdateButtonField();       
            }
        });
    }
        
    
    private void UpdateButtonField()
    {
        this.relay1_jtb.setSelected(this.relay1Active_bol);
        this.relay2_jtb.setSelected(this.relay2Active_bol);
        this.relay3_jtb.setSelected(this.relay3Active_bol);
        this.relay4_jtb.setSelected(this.relay4Active_bol);
        this.relay5_jtb.setSelected(this.relay5Active_bol);
        this.relay6_jtb.setSelected(this.relay6Active_bol);
        this.relay7_jtb.setSelected(this.relay7Active_bol);
        this.relay8_jtb.setSelected(this.relay8Active_bol);
    }
    
    private void SetButtonInvisible()
    {
        this.relay1_jtb.setVisible(false);
        this.relay2_jtb.setVisible(false);
        this.relay3_jtb.setVisible(false);
        this.relay4_jtb.setVisible(false);
        this.relay5_jtb.setVisible(false);
        this.relay6_jtb.setVisible(false);
        this.relay7_jtb.setVisible(false);
        this.relay8_jtb.setVisible(false);
    }
    
    public void SetPublisher1(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub1 = pub;
            this.relay1_jtb.setText(buttonText);
            this.relay1_jtb.setVisible(true);
            this.relay1_jtb.setEnabled(true);          
        }           
    }
    
    public void SetPublisher2(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub2 = pub;
            this.relay2_jtb.setText(buttonText);
            this.relay2_jtb.setVisible(true);
            this.relay2_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher3(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub3 = pub;
            this.relay3_jtb.setText(buttonText);
            this.relay3_jtb.setVisible(true);
            this.relay3_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher4(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub4 = pub;
            this.relay4_jtb.setText(buttonText);
            this.relay4_jtb.setVisible(true);
            this.relay4_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher5(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub5 = pub;
            this.relay5_jtb.setText(buttonText);
            this.relay5_jtb.setVisible(true);
            this.relay5_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher6(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub6 = pub;
            this.relay6_jtb.setText(buttonText);
            this.relay6_jtb.setVisible(true);
            this.relay6_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher7(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub7 = pub;
            this.relay7_jtb.setText(buttonText);
            this.relay7_jtb.setVisible(true);
            this.relay7_jtb.setEnabled(true);
        }           
    }
    
    public void SetPublisher8(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub8 = pub;
            this.relay8_jtb.setText(buttonText);
            this.relay8_jtb.setVisible(true);
            this.relay8_jtb.setEnabled(true);
        }           
    }
     
    double temp = 25.0;
    double hum = 45.0;
        
    class DataCollector extends SwingWorker<Long, Object>
    {

        @Override
        protected Long doInBackground() throws Exception {
            try 
            { 
                Thread.sleep(1000);
            } catch ( InterruptedException e ) { }
            new DataCollector().execute();
            return (0L);
        }
        
        @Override protected void done()
        {
            try
            {
                temp_sjl.setText(String.format("%2.2f",temp));
                //System.out.println("" + String.format("%2.2f",temp));
                humidity_sjl.setText(String.format("%2.2f",hum));  
                temp += 0.1;
                hum += 0.1;
                if(temp > 30.0)
                    temp = 25.0;
                if(hum > 49.0)
                    hum = 45.0;
            }
            catch ( /* InterruptedException, ExecutionException */ Exception e ) { }
        }
    }
}
