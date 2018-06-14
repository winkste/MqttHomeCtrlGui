/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import graph.DataSetCallB;
import graph.MySensorPanel;
import javax.swing.SwingWorker;
import myMqtt.MqttPublisher;
import myMqtt.MqttSubscriber;

/**
 *
 * @author winkste
 */
public class roomControl extends javax.swing.JPanel {
    
    private MySensorPanel panel;
    private DataSetCallB tempCallBack;
    private DataSetCallB humCallBack;
    private boolean genData = false;
    private boolean button1Active_bol = false;
    private boolean button2Active_bol = false;
    private boolean button3Active_bol = false;
    private boolean button4Active_bol = false;
    
    private MqttPublisher pub1 = null;
    private MqttPublisher pub2 = null;
    private MqttPublisher pub3 = null;
    private MqttPublisher pub4 = null;

    /**
     * Creates new form homeTempPanel
     * @param room
     */
    public roomControl(String room) {
        initComponents();
        
        panel = new MySensorPanel(room);
        room_sjl.setText(room);
        //panel.setSize(graphPanel_sjp.getSize());
        tempCallBack = panel.getTempSetCallback();
        humCallBack = panel.getHumSetCallback();     
        graphPanel_sjp.add(panel.getPanel());
        SetButtonInvisible();
        
    }
    
    public roomControl(String room, boolean newGenData) {
        initComponents();

        panel = new MySensorPanel(room);
        //panel.setSize(graphPanel_sjp.getSize());
        tempCallBack = panel.getTempSetCallback();
        humCallBack = panel.getHumSetCallback();   
        graphPanel_sjp.add(panel.getPanel());
        SetButtonInvisible();
        
        genData = newGenData;
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

        graphPanel_sjp = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        room_sjl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        temp_sjl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hum_sjl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        button1_jtb = new javax.swing.JToggleButton();
        button2_jtb = new javax.swing.JToggleButton();
        button3_jtb = new javax.swing.JToggleButton();
        button4_jtb = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(788, 388));

        graphPanel_sjp.setBackground(new java.awt.Color(255, 255, 255));
        graphPanel_sjp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graphPanel_sjp.setPreferredSize(new java.awt.Dimension(1012, 455));
        graphPanel_sjp.setRequestFocusEnabled(false);
        graphPanel_sjp.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        room_sjl.setFont(new java.awt.Font("LCD", 1, 50)); // NOI18N
        room_sjl.setForeground(new java.awt.Color(102, 102, 102));
        room_sjl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        room_sjl.setText("Room");

        jLabel4.setFont(new java.awt.Font("LCD", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("°C");

        temp_sjl.setFont(new java.awt.Font("LCD", 1, 36)); // NOI18N
        temp_sjl.setForeground(new java.awt.Color(102, 102, 102));
        temp_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temp_sjl.setText("+00.0");

        jLabel3.setFont(new java.awt.Font("LCD", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Temperatur");

        jLabel5.setFont(new java.awt.Font("LCD", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Humidity");

        hum_sjl.setFont(new java.awt.Font("LCD", 1, 36)); // NOI18N
        hum_sjl.setForeground(new java.awt.Color(102, 102, 102));
        hum_sjl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hum_sjl.setText("+00.0");

        jLabel6.setFont(new java.awt.Font("LCD", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(room_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(temp_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(hum_sjl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(room_sjl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(temp_sjl)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hum_sjl)
                    .addComponent(jLabel5)))
        );

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        button1_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        button1_jtb.setText("Button 1");
        button1_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1_jtbActionPerformed(evt);
            }
        });
        jPanel3.add(button1_jtb);

        button2_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        button2_jtb.setText("Button 2");
        button2_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2_jtbActionPerformed(evt);
            }
        });
        jPanel3.add(button2_jtb);

        button3_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        button3_jtb.setText("Button 3");
        button3_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3_jtbActionPerformed(evt);
            }
        });
        jPanel3.add(button3_jtb);

        button4_jtb.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        button4_jtb.setText("Button 4");
        button4_jtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4_jtbActionPerformed(evt);
            }
        });
        jPanel3.add(button4_jtb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphPanel_sjp, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphPanel_sjp, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1_jtbActionPerformed
        if(true == button1_jtb.isSelected()) pub1.publish("ON");
        else pub1.publish("OFF");
    }//GEN-LAST:event_button1_jtbActionPerformed

    private void button2_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2_jtbActionPerformed
        if(true == button2_jtb.isSelected()) pub2.publish("ON");
        else pub2.publish("OFF");
    }//GEN-LAST:event_button2_jtbActionPerformed

    private void button3_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3_jtbActionPerformed
        if(true == button3_jtb.isSelected()) pub3.publish("ON");
        else pub3.publish("OFF");
    }//GEN-LAST:event_button3_jtbActionPerformed

    private void button4_jtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4_jtbActionPerformed
        if(true == button4_jtb.isSelected()) pub4.publish("ON");
        else pub4.publish("OFF");
    }//GEN-LAST:event_button4_jtbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button1_jtb;
    private javax.swing.JToggleButton button2_jtb;
    private javax.swing.JToggleButton button3_jtb;
    private javax.swing.JToggleButton button4_jtb;
    private javax.swing.JPanel graphPanel_sjp;
    private javax.swing.JLabel hum_sjl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
                tempCallBack.setData(Float.parseFloat(msg));
                temp_sjl.setText(msg);
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
                hum_sjl.setText(msg);
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberButton1(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                button1Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberButton2(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                button2Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberButton3(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                button3Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    public MqttSubscriber getMqttSubscriberButton4(String filter) {
        return(new MqttSubscriber(){
            @Override
            public String getFilter() {
                return(filter);
            }

            @Override
            public void notify(String msg) {
                button4Active_bol = msg.contains("ON");
                UpdateButtonField();      
            }
        });
    }
    
    private void UpdateButtonField()
    {
        this.button1_jtb.setSelected(this.button1Active_bol);
        this.button2_jtb.setSelected(this.button2Active_bol);
        this.button3_jtb.setSelected(this.button3Active_bol);
        this.button4_jtb.setSelected(this.button4Active_bol);
    }
    
    private void SetButtonInvisible()
    {
        this.button1_jtb.setVisible(false);
        this.button2_jtb.setVisible(false);
        this.button3_jtb.setVisible(false);
        this.button4_jtb.setVisible(false);
    }

    public void SetPublisherForButton1(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub1 = pub;
            this.button1_jtb.setText(buttonText);
            this.button1_jtb.setVisible(true);
            this.button1_jtb.setEnabled(true);          
        }           
    }
    
    public void SetPublisherForButton2(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub2 = pub;
            this.button2_jtb.setText(buttonText);
            this.button2_jtb.setVisible(true);
            this.button2_jtb.setEnabled(true);          
        }           
    }
    
    public void SetPublisherForButton3(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub3 = pub;
            this.button3_jtb.setText(buttonText);
            this.button3_jtb.setVisible(true);
            this.button3_jtb.setEnabled(true);          
        }           
    }
    
    public void SetPublisherForButton4(MqttPublisher pub, String buttonText)
    {      
        if(null != pub)
        {
            this.pub4 = pub;
            this.button4_jtb.setText(buttonText);
            this.button4_jtb.setVisible(true);
            this.button4_jtb.setEnabled(true);          
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
                tempCallBack.setData(temp);
                humCallBack.setData(hum);  
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
