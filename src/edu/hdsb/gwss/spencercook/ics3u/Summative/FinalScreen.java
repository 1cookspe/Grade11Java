/* Name: Spencer Cook
 * Date: January 12, 2014
 * Version: v0
 * Description:
 This program displays the final screen to the quiz
 */
package edu.hdsb.gwss.spencercook.ics3u.Summative;

import javax.swing.JOptionPane;

/**
 * This program displays the final screen of the multiple choice quiz application, and shows the user their score
 * @author 1cookspe
 */
public class FinalScreen extends javax.swing.JFrame {
int score;
    /**
     * Creates new form FinalScreen
     * Displays user's score and their grade, and how they can improve
     */
    public FinalScreen( int s ) {
        initComponents();
        score = s;
        finalScoreLabel.setText(score + " / 10");
        
        if (score < 5) {
            gradeLabel.setText("F");
            resultsLabel.setText("You need to study more! Better luck next time!");
        } else if (score < 6) {
            gradeLabel.setText("D");
            resultsLabel.setText("There's always room for improvement!");
        } else if (score < 7) {
            gradeLabel.setText("C");
            resultsLabel.setText("Good effort! You're getting there!");
        } else if (score < 8) {
            gradeLabel.setText("B");
            resultsLabel.setText("You'll be a computer expert in no time!");
        } else if (score < 9) {
            gradeLabel.setText("A");
            resultsLabel.setText("Great job! You're great with computers!");
        } else {
            gradeLabel.setText("A+");
            resultsLabel.setText("Perfect! You're a computer genius!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yourScoreLabel = new javax.swing.JLabel();
        finalScoreLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        resultsLabel = new javax.swing.JLabel();
        playAgainButton = new javax.swing.JButton();
        endGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        yourScoreLabel.setFont(new java.awt.Font("RomanD", 1, 18)); // NOI18N
        yourScoreLabel.setText("Your Score:");

        finalScoreLabel.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        finalScoreLabel.setText("9 / 10");

        gradeLabel.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        gradeLabel.setText("A");

        resultsLabel.setFont(new java.awt.Font("ScholBleeker-Regular", 1, 14)); // NOI18N
        resultsLabel.setText("Great work! Keep on working hard!");

        playAgainButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        playAgainButton.setText("PLAY AGAIN?");
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });

        endGameButton.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        endGameButton.setText("END GAME");
        endGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gradeLabel)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultsLabel)
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(yourScoreLabel)
                .addGap(26, 26, 26)
                .addComponent(finalScoreLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(playAgainButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(endGameButton)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalScoreLabel)
                    .addComponent(yourScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeLabel)
                .addGap(18, 18, 18)
                .addComponent(resultsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgainButton)
                    .addComponent(endGameButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Moves from Final Screen to Quiz Screen to allow the user to play again
     * @param evt 
     */
    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        new MultipleChoiceQuiz().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playAgainButtonActionPerformed

    /**
     * Ends game by presenting user with JOptionPane that thanks them for playing
     * @param evt 
     */
    private void endGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Thank you for playing!");
        System.exit(-1);
    }//GEN-LAST:event_endGameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FinalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalScreen(5).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endGameButton;
    private javax.swing.JLabel finalScoreLabel;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JButton playAgainButton;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JLabel yourScoreLabel;
    // End of variables declaration//GEN-END:variables
}
