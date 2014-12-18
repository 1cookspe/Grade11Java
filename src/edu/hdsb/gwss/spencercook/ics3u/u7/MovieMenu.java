/* Name: Spencer Cook
 * Date: December 12, 2014
 * Version: v0
 * Description:
 This GUI presents the main menu for the user for the Movie Sort program
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

/**
 *
 * @author 1cookspe
 */
public class MovieMenu extends javax.swing.JFrame {

    /**
     * Creates new form MovieMenu
     */
    public MovieMenu() {
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

        movieMadnessLabel = new javax.swing.JLabel();
        addNewMovieButton = new javax.swing.JButton();
        seeSortedMoviesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movieMadnessLabel.setFont(new java.awt.Font("Swis721 Ex BT", 0, 18)); // NOI18N
        movieMadnessLabel.setText("Movie Madness Menu ");

        addNewMovieButton.setFont(new java.awt.Font("Stone Sans SC ITC TT-Semi", 0, 14)); // NOI18N
        addNewMovieButton.setText("Add New Movie");
        addNewMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMovieButtonActionPerformed(evt);
            }
        });

        seeSortedMoviesButton.setFont(new java.awt.Font("Stone Sans SC ITC TT-Semi", 0, 14)); // NOI18N
        seeSortedMoviesButton.setText("See Sorted Movies");
        seeSortedMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeSortedMoviesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(addNewMovieButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(seeSortedMoviesButton)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(movieMadnessLabel)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(movieMadnessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeSortedMoviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMovieButtonActionPerformed

        System.out.println("Add Movie");
        new AddMovie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewMovieButtonActionPerformed

    private void seeSortedMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeSortedMoviesButtonActionPerformed
        new SortedMovies().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_seeSortedMoviesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MovieMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewMovieButton;
    private javax.swing.JLabel movieMadnessLabel;
    private javax.swing.JButton seeSortedMoviesButton;
    // End of variables declaration//GEN-END:variables
}
