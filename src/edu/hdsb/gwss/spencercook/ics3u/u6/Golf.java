/* Name: Spencer Cook
 * Date: November 11, 2014
 * Version: v0
 * Description:
 This program stores the golf scores of a user
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1cookspe
 */
public class Golf extends javax.swing.JFrame {

    int currentHole = 1;
    int[] scores = new int[18];

    /**
     * Creates new form Golf
     */
    public Golf() {
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

        golfCard = new javax.swing.JLabel();
        inputScoreText = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        addToScorecard = new javax.swing.JButton();
        holesInputted = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreCard = new javax.swing.JTextArea();
        highestScore = new javax.swing.JLabel();
        lowestScore = new javax.swing.JLabel();
        averageScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        golfCard.setText("Golf Card!");

        inputScoreText.setText("Input Score on Hole #1:");

        addToScorecard.setText("Add to Scorecard!");
        addToScorecard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToScorecardActionPerformed(evt);
            }
        });

        holesInputted.setText("Holes Inputted:");

        scoreCard.setColumns(20);
        scoreCard.setRows(5);
        jScrollPane1.setViewportView(scoreCard);

        highestScore.setForeground(new java.awt.Color(255, 0, 0));
        highestScore.setText("Highest Score:");

        lowestScore.setForeground(new java.awt.Color(255, 0, 0));
        lowestScore.setText("Lowest Score:");

        averageScore.setForeground(new java.awt.Color(255, 0, 0));
        averageScore.setText("Average Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(golfCard))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputScoreText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(addToScorecard))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(holesInputted)
                                    .addComponent(highestScore)
                                    .addComponent(lowestScore)
                                    .addComponent(averageScore))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(golfCard)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputScoreText)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToScorecard))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(holesInputted)
                        .addGap(36, 36, 36)
                        .addComponent(highestScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lowestScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(averageScore)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToScorecardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToScorecardActionPerformed
        if (!score.getText().equals("")) {
            //Add value to array
            scores[currentHole - 1] = Integer.parseInt(score.getText());
            scoreCard.setText(scoreCard.getText() + "Hole #" + currentHole + ":          " + scores[currentHole - 1] + "\n");
            scoreCard.setEditable(false);

            //Print out how many holes have be input 
            holesInputted.setText("Holes Entered: " + currentHole);
            currentHole++;

            score.setText("");
            inputScoreText.setText("Input Score on Hole #" + currentHole + ":");

            if (currentHole > 18) {
                JOptionPane.showMessageDialog(this, "You have inputted all 18 holes.");
                score.setEditable(false);
                score.setEnabled(false);
                inputScoreText.setText("All scores have been entered!");
                addToScorecard.setEnabled(false);
            }
            
            //Call methods from ArrayUtil
            highestScore.setText("Highest Score: " + ArrayUtil.getHighestValue(scores));
            lowestScore.setText("Lowest Score: " + ArrayUtil.getLowestValueAbove(scores, 0 ) );
            averageScore.setText("Average Score: " + ArrayUtil.calculateNonZeroAverage(scores));
        } else {
            JOptionPane.showMessageDialog(this, "Please input a valid score!");
        }
    }//GEN-LAST:event_addToScorecardActionPerformed

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
            java.util.logging.Logger.getLogger(Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Golf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Golf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToScorecard;
    private javax.swing.JLabel averageScore;
    private javax.swing.JLabel golfCard;
    private javax.swing.JLabel highestScore;
    private javax.swing.JLabel holesInputted;
    private javax.swing.JLabel inputScoreText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lowestScore;
    private javax.swing.JTextField score;
    private javax.swing.JTextArea scoreCard;
    // End of variables declaration//GEN-END:variables
}
