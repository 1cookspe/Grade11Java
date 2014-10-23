/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class SlotMachine extends javax.swing.JFrame {

    // Variables
    int coins;
    int randomNumber1;
    int selectedNumber;
    private Object images;
    /**
     * Creates new form SlotMachine
     */
    public SlotMachine() {
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

        bigMoneyJackpot = new javax.swing.JLabel();
        spin = new javax.swing.JButton();
        coinsLabel = new javax.swing.JLabel();
        yourOpponents = new javax.swing.JLabel();
        opponent1 = new javax.swing.JLabel();
        opponent3 = new javax.swing.JLabel();
        opponent2 = new javax.swing.JLabel();
        picture1 = new javax.swing.JLabel();
        picture2 = new javax.swing.JLabel();
        picture3 = new javax.swing.JLabel();
        picture4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bigMoneyJackpot.setFont(new java.awt.Font("Oriya MN", 0, 24)); // NOI18N
        bigMoneyJackpot.setForeground(new java.awt.Color(255, 0, 0));
        bigMoneyJackpot.setText("BIG MONEY JACKPOT!");

        spin.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        spin.setText("Spin the Wheel!");
        spin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinActionPerformed(evt);
            }
        });

        coinsLabel.setText("Your Coins:");

        yourOpponents.setText("Your Opponents:");

        opponent1.setText("Bob:");

        opponent3.setText("Joe:");

        opponent2.setText("Steve:");

        picture3.setText("jLabel1");

        picture4.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(picture1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bigMoneyJackpot))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yourOpponents)
                            .addComponent(picture3))))
                .addGap(20, 20, 20)
                .addComponent(picture4)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(coinsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opponent3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opponent1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opponent2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bigMoneyJackpot)
                        .addGap(42, 42, 42)
                        .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(picture1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(picture3)
                    .addComponent(picture4))
                .addGap(357, 357, 357)
                .addComponent(yourOpponents)
                .addGap(18, 18, 18)
                .addComponent(opponent1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(coinsLabel)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(opponent2)))
                .addComponent(opponent3)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void spinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinActionPerformed
        coinsLabel.setText("Your coins: " + coins);
        
        //Generate and show random number
 for (int timesRun = 0; timesRun < 4; timesRun++){
        randomNumber1 = (int) ((Math.random() * 4) + 1);
        switch (randomNumber1) {
            case 1:
                if (timesRun == 1) {
                    //pic1 = 1
                } else if (timesRun == 2) {
                    //pic2 = 1
                } else if (timesRun == 3) {  
                    //pic3 = 1
                } else {    
                    //pic4 = 1
                }        
                break;
            case 2:
                if (timesRun == 1) {
                    //picture1 = 2;
                } else if (timesRun == 2) {
                    //pic2 = 2
                } else if (timesRun == 3) {   
                    //pic3 = 2
                } else {   
                    //pic4 = 2
                }    
                break;
            case 3:
                if (timesRun == 1) {
                    //picture1 = 4
                } else if (timesRun == 2) {
                    //pic2 = 4
                } else if (timesRun == 3) {   
                    //pic3 = 4
                } else {   
                    //pic4 = 4
                } 
                break;
            case 4:
                if (timesRun == 1) {
                    //picture1 = 4
                } else if (timesRun == 2) {
                    //pic2 = 4
                } else if (timesRun == 3) {   
                    //pic3 = 4
                } else {   
                    picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/ibm-logo.png"))); 
                } 
                break;
            default:
                if (timesRun == 1) {
                    picture1.setIcon(null);
                } else if (timesRun == 2) {
                    picture2.setIcon(null);
                } else if (timesRun == 3) {   
                    picture3.setIcon(null);
                } else {   
                    picture4.setIcon(null);
                } 
        }
        

 }
    }//GEN-LAST:event_spinActionPerformed

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
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bigMoneyJackpot;
    private javax.swing.JLabel coinsLabel;
    private javax.swing.JLabel opponent1;
    private javax.swing.JLabel opponent2;
    private javax.swing.JLabel opponent3;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    private javax.swing.JLabel picture3;
    private javax.swing.JLabel picture4;
    private javax.swing.JButton spin;
    private javax.swing.JLabel yourOpponents;
    // End of variables declaration//GEN-END:variables
}
