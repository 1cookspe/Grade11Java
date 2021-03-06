/* Name: Spencer Cook
 * Date: January 8, 2014
 * Version: v0
 * Description:
 This program creates a multiple choice quiz that reads an XML file to randomly show the questions
 */
package edu.hdsb.gwss.spencercook.ics3u.Summative;

import edu.hdsb.gwss.spencercook.ics3u.u6.ArrayUtil;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 * This program displays multiple choice questions and answers to the user, as read from an xml file
 * @author spencercook
 */
public class MultipleChoiceQuiz extends javax.swing.JFrame {
//    JRadioButton[] options;

    /**
     * The global variables that will be used throughout the program
     */
    //GLOBAL VARIABLES
    Document document;
    Element questionRoot;
    Elements childQuestions;
    int questionNumber = 1;
    int score = 0;
    int[] questions;
    int random;
    Font wrongFont = new java.awt.Font("Rod", 0, 14);

    /**
     * Creates new form MultipleChoiceQuiz
     * and initializes display and user interface
     */
    public MultipleChoiceQuiz() {
//        this.options = new JRadioButton[]{optionA, optionB, optionC, optionD};
        initComponents();
        
        //Set question area to not be editable
        questionArea.setEditable(false);

        //READ FROM FILE
        File file = new File("QuizQuestions.xml");
        Builder builder = new Builder();
        try {
            document = builder.build(file);
            questionRoot = document.getRootElement();
            childQuestions = questionRoot.getChildElements();

        } catch (Exception e) {
            System.err.println(e);
        }

        //INITIALIZE VALUES OF QUESTIONS WITH -1
        questions = new int[childQuestions.size()];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = -1;
        }

        //Call methods to randomly generate question numbers, and display them to user
        getQuestions();
        displayQuestionAndOptions();

        //Disable next and enable submit button so user must input an answer before moving to next question
        nextButton.setEnabled(false);
        submitButton.setEnabled(true);
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
        optionA = new javax.swing.JRadioButton();
        optionB = new javax.swing.JRadioButton();
        optionC = new javax.swing.JRadioButton();
        optionD = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(575, 400));
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        titleLabel.setText("Question 1");

        optionA.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionA.setText("Option A");
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });

        optionB.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionB.setText("Option B");
        optionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });

        optionC.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionC.setText("Option C");
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });

        optionD.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionD.setText("Option D");
        optionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        questionArea.setColumns(20);
        questionArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        questionArea.setLineWrap(true);
        questionArea.setRows(5);
        questionArea.setText("You will be asked 10 multiple choice questions about computers.\nPlease select the option you feel best answers the question.\nClick Submit once you have made your selection. \nGood Luck!");
        jScrollPane1.setViewportView(questionArea);

        nextButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionA)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionD)
                            .addComponent(optionC)
                            .addComponent(optionB))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(nextButton)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(titleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(optionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionC)
                .addGap(8, 8, 8)
                .addComponent(optionD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(nextButton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    The following methods eliminates the user from selecting multiple options at once, if optionA is selected
    */
    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        //Set other options as not selected if they already are
        if (optionA.isSelected()) {
            optionB.setSelected(false);
            optionC.setSelected(false);
            optionD.setSelected(false);
        }
    }//GEN-LAST:event_optionAActionPerformed

    /*
    The following methods eliminates the user from selecting multiple options at once, if option C is selected
    */
    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        //Set other options as not selected if they already are
        if (optionC.isSelected()) {
            optionB.setSelected(false);
            optionA.setSelected(false);
            optionD.setSelected(false);
        }
    }//GEN-LAST:event_optionCActionPerformed

    /**
     * Called when the SUBMIT button is pressed, and calls setCorrectAnswer() to display correct and incorrect options
     * @param evt: The event (SUBMIT button pressed)
     */
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        if (!optionA.isSelected() && !optionB.isSelected() && !optionC.isSelected() && !optionD.isSelected()) {
            JOptionPane.showMessageDialog(this, "Oops! Please select an option before proceeding!");
        } else {
            nextButton.setEnabled(true);
            String answer = childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("answer").getValue();
            setCorrectAnswer(answer);
            
            submitButton.setEnabled(false);
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * Called when the NEXT button is pressed, and displays the next question 
     * @param evt: The event (NEXT button pressed)
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (questionNumber == 10) {
            new FinalScreen(score).setVisible(true);
            this.setVisible(false);
        } else {
            incrementNumber();
            displayQuestionAndOptions();
            nextButton.setEnabled(false);
            submitButton.setEnabled(true);
        }

        optionA.setForeground(Color.black);
        optionA.setSelected(false);
        optionB.setForeground(Color.black);
        optionB.setSelected(false);
        optionC.setForeground(Color.black);
        optionC.setSelected(false);
        optionD.setForeground(Color.black);
        optionD.setSelected(false);

    }//GEN-LAST:event_nextButtonActionPerformed

    /**
    The following methods eliminates the user from selecting multiple options at once, if option B is selected
    */
    private void optionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBActionPerformed
        //Set other options as not selected if they already are
        if (optionB.isSelected()) {
            optionA.setSelected(false);
            optionC.setSelected(false);
            optionD.setSelected(false);
        }
    }//GEN-LAST:event_optionBActionPerformed

    /**
    The following methods eliminates the user from selecting multiple options at once, if optionA is selected
    */
    private void optionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDActionPerformed
        //Set other options as not selected if they already are
        if (optionD.isSelected()) {
            optionB.setSelected(false);
            optionC.setSelected(false);
            optionA.setSelected(false);
        }
    }//GEN-LAST:event_optionDActionPerformed

    /**
     * This method increments the question number
     */
    public void incrementNumber() {
        //Increment question number, and set title as the current question number
        questionNumber++;
        titleLabel.setText("Question " + questionNumber);
    }

    /**
     * This method randomly generates an array that corresponds to the questions stored in the xml file
     */
    public void getQuestions() {
        //Use for loop to randomize random numbers, which are checked by linearSearch that they do not already exist in the array
        for (int i = 0; i < 10; i++) {
            boolean filledIn = false;
            while (filledIn == false) {
                random = generateRandomNumber();
                if (ArrayUtil.sequentialSearch(questions, random) == -1) {
                    questions[i] = random;
                    filledIn = true;
                }
            }
            System.out.println(childQuestions.get(random).getFirstChildElement("QuestionName").getValue());
        }
    }

    /**
     * Generates a random number
     * @return A randomly generated number
     */
    public int generateRandomNumber() {
        //Generates random number
        int randomQuestion = (int) (Math.random() * 12);
        System.out.println(randomQuestion);
        return randomQuestion;
    }

    /**
     * Displays question and options to user
     */
    public void displayQuestionAndOptions() {
        //Set text fields to questions and options from xml
        questionArea.setText(childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("QuestionName").getValue().trim());
        optionA.setText(childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("optionA").getValue());
        optionB.setText(childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("optionB").getValue());
        optionC.setText(childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("optionC").getValue());
        optionD.setText(childQuestions.get(questions[questionNumber - 1]).getFirstChildElement("optionD").getValue());
    }

    /**
     * Makes the correct answer green and checks if user is correct. If so, the score is incremented.
     * @param answer: The answer of the question according to the xml file
     */
    public void setCorrectAnswer(String answer) {
        //Check if user is correct and set correct option to green
        if (optionA.getText().equals(answer)) {
            optionA.setForeground(Color.green);
            if (optionA.isSelected()) {
                score++;
            }
            setIncorrectAnswers(optionB, optionC, optionD);
        } else if (optionB.getText().equals(answer)) {
            optionB.setForeground(Color.green);
            if (optionB.isSelected()) {
                score++;
            }
            setIncorrectAnswers(optionA, optionC, optionD);
        } else if (optionC.getText().equals(answer)) {
            optionC.setForeground(Color.green);
            if (optionC.isSelected()) {
                score++;
            }
            setIncorrectAnswers(optionA, optionB, optionD);
        } else {
            optionD.setForeground(Color.green);
            if (optionD.isSelected()) {
                score++;
            }
            setIncorrectAnswers(optionA, optionC, optionB);
        }

    }

    /**
     * Sets incorrect numbers as red, so the user is aware of the wrong answers
     * @param firstOption: The first option that is incorrect
     * @param secondOption: The second option that is incorrect
     * @param thirdOption: The third option that is incorrect
     */
    public void setIncorrectAnswers(JRadioButton firstOption, JRadioButton secondOption, JRadioButton thirdOption) {
        //Set incorrect options to red
        firstOption.setForeground(Color.red);
        secondOption.setForeground(Color.red);
        thirdOption.setForeground(Color.red);

        System.out.println("Score = " + score);
    }

    /**
     * Initializes display
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
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoiceQuiz().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton optionA;
    private javax.swing.JRadioButton optionB;
    private javax.swing.JRadioButton optionC;
    private javax.swing.JRadioButton optionD;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
