/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

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
        
        //buttonPanel = new gui.valvePanel();
        //weatherPanel = new gui.weatherPanel(); 
        //tempPanel = new gui.homeTempPanel();
        //panelVector = new javax.swing.JPanel[3];
        
        //panelVector[0] = buttonPanel;
        //panelVector[1] = tempPanel;
        //panelVector[2] = weatherPanel;
        
        panelList = new ArrayList<>();
        /*

        
        
        //userPanel_sjp.remove(tempPanel);        
        javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel_sjpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );*/
        
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
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));

        mainPanel_sjp.setPreferredSize(new java.awt.Dimension(800, 640));

        userPanel_sjp.setBackground(new java.awt.Color(0, 204, 204));
        userPanel_sjp.setPreferredSize(new java.awt.Dimension(1024, 458));

        javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanel_sjpLayout = new javax.swing.GroupLayout(mainPanel_sjp);
        mainPanel_sjp.setLayout(mainPanel_sjpLayout);
        mainPanel_sjpLayout.setHorizontalGroup(
            mainPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_sjpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel_sjp, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanel_sjpLayout.setVerticalGroup(
            mainPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_sjpLayout.createSequentialGroup()
                .addComponent(userPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        forward_sjb.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        forward_sjb.setText(">>");
        forward_sjb.setMaximumSize(new java.awt.Dimension(100, 50));
        forward_sjb.setMinimumSize(new java.awt.Dimension(100, 50));
        forward_sjb.setPreferredSize(new java.awt.Dimension(100, 50));
        forward_sjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward_sjbActionPerformed(evt);
            }
        });

        backward_sjw.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        backward_sjw.setText("<<");
        backward_sjw.setMaximumSize(new java.awt.Dimension(100, 50));
        backward_sjw.setMinimumSize(new java.awt.Dimension(100, 50));
        backward_sjw.setPreferredSize(new java.awt.Dimension(100, 50));
        backward_sjw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backward_sjwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backward_sjw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                .addComponent(forward_sjb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(mainPanel_sjp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel_sjp, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backward_sjw, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(forward_sjb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backward_sjwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backward_sjwActionPerformed
        userPanel_sjp.remove(panelList.get(panelIdx_i));
        if(0 == panelIdx_i)
        {
            panelIdx_i = panelList.size() - 1;
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
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        
    }//GEN-LAST:event_backward_sjwActionPerformed

    private void forward_sjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward_sjbActionPerformed
        userPanel_sjp.remove(panelList.get(panelIdx_i));
        if(panelIdx_i == panelList.size() - 1)
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
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }//GEN-LAST:event_forward_sjbActionPerformed

    public void addPanel(JPanel newPanel)
    {
      panelList.add(newPanel);
      
      userPanel_sjp.remove(panelList.get(panelIdx_i));
      panelIdx_i = panelList.size() - 1;
      javax.swing.GroupLayout userPanel_sjpLayout = new javax.swing.GroupLayout(userPanel_sjp);
        userPanel_sjp.setLayout(userPanel_sjpLayout);
        userPanel_sjpLayout.setHorizontalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel_sjpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel_sjpLayout.setVerticalGroup(
            userPanel_sjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel_sjpLayout.createSequentialGroup()
                .addComponent(panelList.get(panelIdx_i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backward_sjw;
    public javax.swing.JButton forward_sjb;
    private javax.swing.JPanel mainPanel_sjp;
    public javax.swing.JPanel userPanel_sjp;
    // End of variables declaration//GEN-END:variables

    //public gui.valvePanel buttonPanel;
    //public gui.weatherPanel weatherPanel;
    //public gui.homeTempPanel tempPanel;
    //public javax.swing.JPanel[] panelVector;
    public int panelIdx_i = 0;
    private final List<JPanel> panelList;
    
}
