/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author winkste
 */
public class startFrame extends javax.swing.JFrame {

    /**
     * Creates new form startFrame
     */
    public startFrame() {
        initComponents();
        
        buttonPanel = new gui.buttonPanel();
        weatherPanel = new gui.weatherPanel(); 
        tempPanel = new gui.homeTempPanel();
        panelVector = new javax.swing.JPanel[3];
        
        panelVector[0] = buttonPanel;
        panelVector[1] = tempPanel;
        panelVector[2] = weatherPanel;
        
        //userPanel_sjp.remove(tempPanel);        
        javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel_sjpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    mainPanel_sjp = new javax.swing.JPanel();
    userPanel_sjp = new javax.swing.JPanel();
    forward_sjb = new javax.swing.JButton();
    backward_sjw = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);

    mainPanel_sjp.setPreferredSize(new java.awt.Dimension(800, 640));

    userPanel_sjp.setBackground(new java.awt.Color(0, 204, 204));

    javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
    userPanel_sjp.setLayout(userPanel_sjpLayout);
    userPanel_sjpLayout.setHorizontalGroup(
      userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 800, Short.MAX_VALUE)
    );
    userPanel_sjpLayout.setVerticalGroup(
      userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 332, Short.MAX_VALUE)
    );

    forward_sjb.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
    forward_sjb.setText(">>");
    forward_sjb.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        forward_sjbActionPerformed(evt);
      }
    });

    backward_sjw.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
    backward_sjw.setText("<<");
    backward_sjw.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backward_sjwActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout mainPanel_sjpLayout = new javax.swing.GroupLayout(mainPanel_sjp);
    mainPanel_sjp.setLayout(mainPanel_sjpLayout);
    mainPanel_sjpLayout.setHorizontalGroup(
      mainPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(userPanel_sjp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(mainPanel_sjpLayout.createSequentialGroup()
        .addComponent(backward_sjw, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(forward_sjb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    mainPanel_sjpLayout.setVerticalGroup(
      mainPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPanel_sjpLayout.createSequentialGroup()
        .addComponent(userPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(mainPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(backward_sjw, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
          .addComponent(forward_sjb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void backward_sjwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backward_sjwActionPerformed
        userPanel_sjp.remove(panelVector[panelIdx_i]);
        if(0 == panelIdx_i)
        {
            panelIdx_i = 2;
        }
        else
        {
            panelIdx_i--;
        }
        
        javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel_sjpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        
    }//GEN-LAST:event_backward_sjwActionPerformed

    private void forward_sjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward_sjbActionPerformed
        userPanel_sjp.remove(panelVector[panelIdx_i]);
        if(2 == panelIdx_i)
        {
            panelIdx_i = 0;
        }
        else
        {
            panelIdx_i++;
        }
        
        javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel_sjpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelVector[panelIdx_i], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }//GEN-LAST:event_forward_sjbActionPerformed



  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton backward_sjw;
  public javax.swing.JButton forward_sjb;
  private javax.swing.JPanel mainPanel_sjp;
  public javax.swing.JPanel userPanel_sjp;
  // End of variables declaration//GEN-END:variables

    public gui.buttonPanel buttonPanel;
    public gui.weatherPanel weatherPanel;
    public gui.homeTempPanel tempPanel;
    public javax.swing.JPanel[] panelVector;
    public int panelIdx_i = 0;
    
}
