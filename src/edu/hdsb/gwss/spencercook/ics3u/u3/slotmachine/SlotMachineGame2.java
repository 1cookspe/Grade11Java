/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3.slotmachine;

import java.text.NumberFormat;

/**
 *
 * @author spencercook
 */
public class SlotMachineGame2 extends javax.swing.JFrame {

    /**
     * Creates new form SlotMachineGame
     */
    //Variables
    int randomNumber;
    //private Object JOptionPage;
    int googleNumber = 0;
    int appleNumber = 0;
    int microsoftNumber = 0;
    int ibmNumber = 0;
    int money = 50;
    String bet;
    int addedMoney;
    String stockString;

    //Objects
    NumberFormat dollars = NumberFormat.getCurrencyInstance();

    public SlotMachineGame2() {
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

        titleLabel = new javax.swing.JLabel();
        yourCoins = new javax.swing.JLabel();
        enterStockLabel = new javax.swing.JLabel();
        picture1 = new javax.swing.JLabel();
        picture2 = new javax.swing.JLabel();
        picture3 = new javax.swing.JLabel();
        picture4 = new javax.swing.JLabel();
        enterStock = new javax.swing.JTextField();
        spinWheel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        betMoney = new javax.swing.JLabel();
        wager = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setText("STOCK MARKET SLOT MACHINE!");

        yourCoins.setFont(new java.awt.Font("Kefa", 0, 14)); // NOI18N
        yourCoins.setForeground(new java.awt.Color(255, 0, 0));
        yourCoins.setText("Your Money:$50,000,000");

        enterStockLabel.setText("Enter Stock Name:");

        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png"))); // NOI18N

        picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/a.png"))); // NOI18N

        picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/m.png"))); // NOI18N

        picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/i.png"))); // NOI18N

        spinWheel.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        spinWheel.setForeground(new java.awt.Color(255, 51, 51));
        spinWheel.setText("Spin!");
        spinWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinWheelActionPerformed(evt);
            }
        });

        jLabel1.setText("GOOG = Google");

        jLabel2.setText("APPL = Apple");

        jLabel3.setText("MSFT = Microsoft");

        jLabel4.setText("IBM = IBM");

        betMoney.setText("Bet Money (In Millions):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(picture3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(picture4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yourCoins)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(betMoney)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wager, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinWheel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enterStockLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterStock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(picture3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterStockLabel)
                    .addComponent(enterStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yourCoins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinWheel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(betMoney)
                        .addComponent(wager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spinWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinWheelActionPerformed
        //Generate and show random number
        //alertView.showMessageDialog(null, "Thank you for using Java", "Yay, java");

        if (bet != null && stockString != null) {
            money -= 1;
            bet = wager.getText();
            stockString = enterStock.getText();
            addedMoney = Integer.parseInt(bet);
            for (int timesRun = 1; timesRun < 5; timesRun++) {

            //System.out.println("RUNNING" + picture2);
                //System.out.println("RUNNING" + picture3);
                //System.out.println("RUNNING" + picture4);
                //System.out.println( "RUNNING" + new javax.swing.ImageIcon(getClass().getResource("edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png") ) );
                randomNumber = (int) ((Math.random() * 4) + 1);
                switch (randomNumber) {
                    case 1:
                        if (timesRun == 1) {
                            picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png")));
                            googleNumber += 1;
                        } else if (timesRun == 2) {
                            picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png")));
                            googleNumber += 1;
                        } else if (timesRun == 3) {
                            picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png"))); // NOI18N
                            googleNumber += 1;
                        } else {
                            picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/g.png"))); // NOI18N
                            googleNumber += 1;
                        }

                        break;
                    case 2:
                        if (timesRun == 1) {
                            picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/a.png"))); // NOI18N
                            appleNumber += 1;
                        } else if (timesRun == 2) {
                            picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/a.png"))); // NOI18N
                            appleNumber += 1;
                        } else if (timesRun == 3) {
                            picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/a.png"))); // NOI18N
                            appleNumber += 1;
                        } else {
                            picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/a.png"))); // NOI18N
                            appleNumber += 1;

                        }
                        break;
                    case 3:
                        if (timesRun == 1) {
                            picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/m.png"))); // NOI18N
                            microsoftNumber += 1;
                        } else if (timesRun == 2) {
                            picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/m.png"))); // NOI18N
                            microsoftNumber += 1;
                        } else if (timesRun == 3) {
                            picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/m.png"))); // NOI18N
                            microsoftNumber += 1;
                        } else {
                            picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/m.png"))); // NOI18N
                            microsoftNumber += 1;
                        }
                        break;
                    default:
                        if (timesRun == 1) {
                            picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/i.png"))); // NOI18N
                            ibmNumber += 1;
                        } else if (timesRun == 2) {
                            picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/i.png"))); // NOI18N
                            ibmNumber += 1;
                        } else if (timesRun == 3) {
                            picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/i.png"))); // NOI18N
                            ibmNumber += 1;
                        } else {
                            picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u3/imageDirectory/i.png"))); // NOI18N
                            ibmNumber += 1;

                        }
                        break;
//                default:
//                    if (timesRun == 1) {
//                        picture1.setIcon(null);
//                    } else if (timesRun == 2) {
//                        picture2.setIcon(null);
//                    } else if (timesRun == 3) {
//                        picture3.setIcon(null);
//                    } else {
//                        picture4.setIcon(null);
//                    }
                }

            }
            this.update(this.getGraphics());

//GIVE USER MONEY IF THEY ARE CORRECT
            if (stockString == "GOOG" || stockString == "Google" || stockString == "google") {
                if (googleNumber == 4) {
                    money += addedMoney;
                } else if (googleNumber == 3) {
                    money += (addedMoney * 0.75);
                } else if (googleNumber == 2) {
                    money += (addedMoney / 2);
                } else if (googleNumber == 1) {
                    money += (addedMoney * 0.25);
                } else {
                    money -= addedMoney;
                }
            } else if (stockString == "AAPL" || stockString == "Apple" || stockString == "apple") {
                if (appleNumber == 4) {
                    money += addedMoney;
                } else if (appleNumber == 3) {
                    money += (addedMoney * 0.75);
                } else if (appleNumber == 2) {
                    money += (addedMoney / 2);
                } else if (appleNumber == 1) {
                    money += (addedMoney * 0.25);
                } else {
                    money -= addedMoney;
                }
            } else if (stockString == "MSFT" || stockString == "Microsoft" || stockString == "microsoft") {
                if (microsoftNumber == 4) {
                    money += addedMoney;
                } else if (microsoftNumber == 3) {
                    money += (addedMoney * 0.75);
                } else if (microsoftNumber == 2) {
                    money += (addedMoney / 2);
                } else if (microsoftNumber == 1) {
                    money += (addedMoney * 0.25);
                } else {
                    money -= addedMoney;
                }
            } else if (stockString == "IBM" || stockString == "ibm") {
                if (ibmNumber == 4) {
                    money += addedMoney;
                } else if (ibmNumber == 3) {
                    money += (addedMoney * 0.75);
                } else if (ibmNumber == 2) {
                    money += (addedMoney / 2);
                } else if (ibmNumber == 1) {
                    money += (addedMoney * 0.25);
                } else {
                    money -= addedMoney;
                }
            } else {
                //betMoney.setText( "Invalid" );
            }
            yourCoins.setText("Your Money: " + dollars.format(money * 1000000));
        } else {
            
                yourCoins.setText("Please input values");
           
        }


    }//GEN-LAST:event_spinWheelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachineGame2().setVisible(true);
            }
        });
    }

        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel betMoney;
    private javax.swing.JTextField enterStock;
    private javax.swing.JLabel enterStockLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    private javax.swing.JLabel picture3;
    private javax.swing.JLabel picture4;
    private javax.swing.JButton spinWheel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField wager;
    private javax.swing.JLabel yourCoins;
    // End of variables declaration//GEN-END:variables
}
