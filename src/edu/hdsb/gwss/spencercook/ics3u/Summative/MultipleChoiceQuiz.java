/* Name: Spencer Cook
 * Date: January 8, 2014
 * Version: v0
 * Description:
 This program creates a multiple choice quiz that reads an XML file to randomly show the questions
 */
package edu.hdsb.gwss.spencercook.ics3u.Summative;

import edu.hdsb.gwss.spencercook.ics3u.u6.ArrayUtil;
import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author spencercook
 */
public class MultipleChoiceQuiz extends javax.swing.JFrame {
//    JRadioButton[] options;

    //GLOBAL VARIABLES
    Document document;
    Element questionRoot;
    Elements childQuestions;
    int questionNumber = 0;
    int score = 0;
    int[] questions;
    int random;

    /**
     * Creates new form MultipleChoiceQuiz
     */
    public MultipleChoiceQuiz() {
//        this.options = new JRadioButton[]{optionA, optionB, optionC, optionD};
        initComponents();

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

        getQuestions();
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
        playOrSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        titleLabel.setText("Multiple Choice Quiz");

        optionA.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionA.setText("Option A");
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });

        optionB.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionB.setText("Option B");

        optionC.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionC.setText("Option C");
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });

        optionD.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        optionD.setText("Option D");

        playOrSubmit.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        playOrSubmit.setText("Play");
        playOrSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playOrSubmitActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("You will be asked 10 multiple choice questions about computers.\nPlease select the option you feel best answers the question.\nClick Submit once you have made your selection. \nGood Luck!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(titleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playOrSubmit)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(optionB)
                                        .addComponent(optionA)
                                        .addComponent(optionC))
                                    .addComponent(optionD))))
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(optionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionC)
                .addGap(8, 8, 8)
                .addComponent(optionD)
                .addGap(18, 18, 18)
                .addComponent(playOrSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionAActionPerformed

    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionCActionPerformed

    private void playOrSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playOrSubmitActionPerformed

        incrementNumber(questionNumber);
        System.out.println("RUNNING submit" + questionNumber);


    }//GEN-LAST:event_playOrSubmitActionPerformed

    public void incrementNumber(int questionNumber) {
        questionNumber++;
        titleLabel.setText("Question " + questionNumber);
    }

    public void getQuestions() {
        for (int i = 0; i < 10; i++) {
            boolean filledIn = false;
            while (filledIn == false) {
                random = generateRandomNumber();
                if (ArrayUtil.sequentialSearch(questions, random) == -1) {
                    questions[i] = random;
                    filledIn = true;
                } else {
                    filledIn = false;
                }
            }
            System.out.println(childQuestions.get(random).getFirstChildElement("QuestionName").getValue());
            System.out.println(Math.floor(-6.4));
        }
    }
    
    public void printQuestions() {
        
    }

    public int generateRandomNumber() {
        int randomQuestion = (int) (Math.random() * 10) + 1;
        return randomQuestion;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton optionA;
    private javax.swing.JRadioButton optionB;
    private javax.swing.JRadioButton optionC;
    private javax.swing.JRadioButton optionD;
    private javax.swing.JButton playOrSubmit;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
