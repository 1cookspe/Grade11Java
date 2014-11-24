/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class NHLStats extends javax.swing.JFrame {

    /**
     * Creates new form NHLStats
     */
    public NHLStats() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        sortByPlayer = new javax.swing.JButton();
        sortByTeam = new javax.swing.JButton();
        sortByGoals = new javax.swing.JButton();
        sortByAssists = new javax.swing.JButton();
        sortByPoints = new javax.swing.JButton();
        sortBySP = new javax.swing.JButton();
        sortFrom = new javax.swing.JLabel();
        ascending = new javax.swing.JCheckBox();
        descending = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setColumns(20);
        table.setRows(5);
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NHL Stats- Point Leaders");

        sortByPlayer.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortByPlayer.setText("Player");

        sortByTeam.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortByTeam.setText("Team");

        sortByGoals.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortByGoals.setText("Goals");

        sortByAssists.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortByAssists.setText("Assists");

        sortByPoints.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortByPoints.setText("Points");

        sortBySP.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortBySP.setText("Shooting Percentage");

        sortFrom.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        sortFrom.setText("Sort From:");

        ascending.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        ascending.setText("Lowest to Highest");

        descending.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        descending.setText("Highest to Lowest");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sortByPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByGoals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByAssists)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortBySP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortFrom)
                            .addComponent(descending)
                            .addComponent(ascending))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortByPlayer)
                    .addComponent(sortByTeam)
                    .addComponent(sortByGoals)
                    .addComponent(sortByAssists)
                    .addComponent(sortByPoints)
                    .addComponent(sortBySP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sortFrom)
                .addGap(7, 7, 7)
                .addComponent(descending)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ascending)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NHLStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NHLStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NHLStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NHLStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Variables
        String[] playersNames = {"Jakub Voracek", "Tyler Seguin", "Sidney Crosby", "Steven Stamkos", "Claude Giroux", "Vladimir Tarasenko", "Phil Kessel", "Patric Hornqvist", "Evgeni Malkin", "Ryan Johansen"};
        String[] playersTeams = {"Flyers", "Stars", "Penguins", "Lightning", "Flyers", "Blues", "Maple Leafs", "Penguins", "Penguins", "Blue Jackets"};
        int[] goals = {7, 15, 8, 14, 6, 12, 11, 10, 8, 7};
        int[] assists = {22, 11, 18, 10, 18, 11, 12, 13, 15, 16};
        int[] points = {29, 26, 26, 24, 24, 23, 23, 23, 23, 23};
        double[] shootingPercentage = {10.6, 18.8, 13.6, 18.2, 6.7, 15.0, 15.1, 14.1, 15.7, 13.7};
        int[] indicies = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Objects
        Scanner sortInput = new Scanner(System.in);

        //PRINT ARRAY
        System.out.format("%20s  | %15s  | %5s  | %7s  | %7s  | %15s", "Player Name", "Team", "Goals", "Assists", "Points", "Shooting Percentage (%)");
        for (int i = 0; i < playersNames.length; i++) {
            System.out.format("\n%20s  | %15s  | %5s  | %7s  | %7s  | %15s", playersNames[i], playersTeams[i], goals[i], assists[i], points[i], shootingPercentage[i]);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NHLStats().setVisible(true);
            }
        });
    }

    public void setText(String[] teamsNames, String[] playersNames, int[] goals, int[] assists, int[] points, int[] shootingPercentage) {
        for (int i = 0; i < teamsNames.length; i++) {
            table.setText("" + playersNames[i]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ascending;
    private javax.swing.JCheckBox descending;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sortByAssists;
    private javax.swing.JButton sortByGoals;
    private javax.swing.JButton sortByPlayer;
    private javax.swing.JButton sortByPoints;
    private javax.swing.JButton sortBySP;
    private javax.swing.JButton sortByTeam;
    private javax.swing.JLabel sortFrom;
    private javax.swing.JTextArea table;
    // End of variables declaration//GEN-END:variables
}
