/* Name: Spencer Cook
 * Date: November 10, 2014
 * Version: v0
 * Description:
 This program creates a random number game where the user tries to guess a randomly generated number
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import javax.swing.JOptionPane;

/**
 * This program allows the user to guess the number randomly generated by the computer.
 * @author 1cookspe
 */
public class GuessNumber extends javax.swing.JFrame {

    /**
     * This is the computer generated 'secret' number.
     */
    int secretNumber;
    int increment;

    /**
     * Creates new form GuessNumber
     */
    public GuessNumber() {
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

        welcomeLabel = new javax.swing.JLabel();
        instructionsLabel = new javax.swing.JLabel();
        minimumValue = new javax.swing.JLabel();
        lowestNumber = new javax.swing.JTextField();
        maximumValue = new javax.swing.JLabel();
        highestNumber = new javax.swing.JTextField();
        whatNumber = new javax.swing.JLabel();
        numberGuess = new javax.swing.JTextField();
        guess = new javax.swing.JButton();
        guessResults = new javax.swing.JLabel();
        numberOfGuesses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Stone Sans ITC TT-Semi", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 51, 255));
        welcomeLabel.setText("Guess the Number!");

        instructionsLabel.setText("You will guess a number after inputting its maximum and minimum values:");

        minimumValue.setText("Minimum Value:");

        maximumValue.setText("Maximum Value:");

        whatNumber.setText("What number do you guess?");

        guess.setText("Guess");
        guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessActionPerformed(evt);
            }
        });

        guessResults.setForeground(new java.awt.Color(255, 0, 0));
        guessResults.setText("Your guess is TOO LOW!");

        numberOfGuesses.setText("Number of Guesses: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guessResults, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(minimumValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lowestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(maximumValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(highestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(numberOfGuesses)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(guess)
                                            .addComponent(whatNumber))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(welcomeLabel)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instructionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimumValue)
                    .addComponent(lowestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumValue)
                    .addComponent(highestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guessResults)
                .addGap(18, 18, 18)
                .addComponent(numberOfGuesses)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessActionPerformed
        //Check if you can change the value of range
        if (lowestNumber.isEditable()) {
            int min = Integer.parseInt(lowestNumber.getText());
            int max = Integer.parseInt(highestNumber.getText());
            lowestNumber.setEditable(false);
            highestNumber.setEditable(false);
            secretNumber = generateRandomNumber(min, max);
            guess.setText("Guess!");
            welcomeLabel.setText("Guess The Number!");
        }

        //Get user's guess
        int userGuess = Integer.parseInt(getUserGuess());
        compareGuesses(userGuess);
        
        //Set text of numberOfGuesses
        increment++;
        numberOfGuesses.setText("Number of Guesses: " + increment);

    }//GEN-LAST:event_guessActionPerformed

    /**
     * This method generates the random number
     * @param min The set minimum value in the range that the number can be generated.
     * @param max The set maximum value in the range that the number can be generated.
     * @return Generated Number.
     */
    public int generateRandomNumber(int min, int max) {
        //Generate random number from computer
        return (int) (Math.random() * (max - min) - 1) + (min + 1);
    }

    /**
     * This method gets the user's guess from the text field.
     * @return Guess of User.
     */
    public String getUserGuess() {
        //Get guess of user
        return numberGuess.getText();
    }

    /**
     * This method compares the guesses of the user and the number generated by the computer, and prints out whether or not the user guessed correctly, or if their guess was too high or too low.
     * @param userGuess The integer value of the guess inputted by the user.
     */
    public void compareGuesses(int userGuess) {
        //Compare user's guess to the generated number to see if they are correct
        if (secretNumber == userGuess) {
            guessResults.setText("Congratulations! You guessed the right number!");
            playAgain();
        } else if (secretNumber < userGuess) {
            guessResults.setText("Your guess is TOO HIGH!");
        } else {
            guessResults.setText("Your guess is TOO LOW!");
        }
    }
    
    /**
     * This method triggers a JOptionPane if the user wins, and sets the text fields to be editable for a new game.
     */
    public void playAgain() {
        //Allows the user to start a new game
        JOptionPane.showMessageDialog(this, "You won! Play Again by inputting a new minimum and maximum value and keep on guessing!");
        lowestNumber.setEditable(true);
        highestNumber.setEditable(true);
        welcomeLabel.setText("Input new values to play again!");
        increment = -1;
    }

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
            java.util.logging.Logger.getLogger(GuessNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessNumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessNumber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guess;
    private javax.swing.JLabel guessResults;
    private javax.swing.JTextField highestNumber;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JTextField lowestNumber;
    private javax.swing.JLabel maximumValue;
    private javax.swing.JLabel minimumValue;
    private javax.swing.JTextField numberGuess;
    private javax.swing.JLabel numberOfGuesses;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel whatNumber;
    // End of variables declaration//GEN-END:variables
}
