/* Name: Spencer Cook
 * Date: December 17, 2014
 * Version: v0
 * Description:
 This program adds movies to the XML file
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import nu.xom.Builder; 
import nu.xom.Document;
import nu.xom.Element;

/**
 *
 * @author 1cookspe
 */
public class AddMovie extends javax.swing.JFrame {

    //GLOBAL VARIABLES
    int stars;
    File movieFile;
    Element movieRoot;
    Document movieDocument;

    /**
     * Creates new form AddMovie
     */
    public AddMovie() {
        initComponents();
        importData();
    }

    public void exportData() {
        try {
            BufferedWriter writer = new BufferedWriter(new PrintWriter(movieFile));
            writer.write(movieDocument.toXML());
            writer.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void importData() {
        movieFile = new File("movieMadness.xml");

        if (movieFile.exists()) {
            System.out.println("EXISTS");
            Builder b = new Builder();
            try {
                movieDocument = b.build(movieFile);
                movieRoot = movieDocument.getRootElement();
                
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            System.out.println("DNE");
            movieRoot = new Element("movies");
            movieDocument = new Document(movieRoot);

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

        addNewMovieLabel = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();
        sortedMoviesButton = new javax.swing.JButton();
        movieTitleLabel = new javax.swing.JLabel();
        movieTitleTextField = new javax.swing.JTextField();
        genreLabel = new javax.swing.JLabel();
        genreComboBox = new javax.swing.JComboBox();
        ratingLabel = new javax.swing.JLabel();
        addMovieButton = new javax.swing.JButton();
        oneStar = new javax.swing.JButton();
        twoStars = new javax.swing.JButton();
        threeStars = new javax.swing.JButton();
        fourStars = new javax.swing.JButton();
        fiveStars = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        addNewMovieLabel.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        addNewMovieLabel.setText("Add New Movie");

        mainMenuButton.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        sortedMoviesButton.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        sortedMoviesButton.setText("Sorted Movies");
        sortedMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortedMoviesButtonActionPerformed(evt);
            }
        });

        movieTitleLabel.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        movieTitleLabel.setText("Movie Title:");

        genreLabel.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        genreLabel.setText("Genre:");

        genreComboBox.setFont(new java.awt.Font("Stone Sans SC ITC TT-Semi", 0, 12)); // NOI18N
        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Action", "Mystery", "Comedy", "Drama", "Thriller", "Horror", "Romantic", "Classic", "Animated", "Sci-Fi" }));

        ratingLabel.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        ratingLabel.setText("Rating (Stars):");

        addMovieButton.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        addMovieButton.setText("Add Movie To List");
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });

        oneStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u7/AnimatedStar.gif"))); // NOI18N
        oneStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneStarActionPerformed(evt);
            }
        });

        twoStars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u7/AnimatedStar.gif"))); // NOI18N
        twoStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoStarsActionPerformed(evt);
            }
        });

        threeStars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u7/AnimatedStar.gif"))); // NOI18N
        threeStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeStarsActionPerformed(evt);
            }
        });

        fourStars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u7/AnimatedStar.gif"))); // NOI18N
        fourStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourStarsActionPerformed(evt);
            }
        });

        fiveStars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/spencercook/ics3u/u7/AnimatedStar.gif"))); // NOI18N
        fiveStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveStarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ratingLabel)
                            .addComponent(genreLabel)
                            .addComponent(movieTitleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortedMoviesButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oneStar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoStars, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeStars, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fourStars, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveStars, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(movieTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewMovieLabel)
                            .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(addMovieButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewMovieLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieTitleLabel)
                    .addComponent(movieTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreLabel)
                    .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(twoStars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourStars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveStars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeStars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneStar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ratingLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(addMovieButton)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuButton)
                    .addComponent(sortedMoviesButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneStarActionPerformed
        stars = 1;
    }//GEN-LAST:event_oneStarActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        new MovieMenu().setVisible(true);
        this.setVisible(false);
        exportData();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void sortedMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortedMoviesButtonActionPerformed
        new SortedMovies().setVisible(true);
        this.setVisible(false);
        exportData();
        
        //new SortedMovies().importData();
    }//GEN-LAST:event_sortedMoviesButtonActionPerformed

    private void twoStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoStarsActionPerformed
        stars = 2;
    }//GEN-LAST:event_twoStarsActionPerformed

    private void threeStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeStarsActionPerformed
        stars = 3;
    }//GEN-LAST:event_threeStarsActionPerformed

    private void fourStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourStarsActionPerformed
        stars = 4;
    }//GEN-LAST:event_fourStarsActionPerformed

    private void fiveStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveStarsActionPerformed
        stars = 5;
    }//GEN-LAST:event_fiveStarsActionPerformed

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed

        // CHILDREN
        Element movieName = new Element("movieName");
        Element movieRating = new Element("movieRating");
        Element movieGenre = new Element("movieGenre");

        movieName.appendChild(movieTitleTextField.getText());
        movieRating.appendChild("" + stars);
        movieGenre.appendChild(genreComboBox.getSelectedItem().toString());

        // PARENT
        Element movie = new Element("movie");
        movie.appendChild(movieName);
        movie.appendChild(movieRating);
        movie.appendChild(movieGenre);

        // ADD PARENT TO ROOT
        movieRoot.appendChild(movie);
        

    }//GEN-LAST:event_addMovieButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        exportData();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieButton;
    private javax.swing.JLabel addNewMovieLabel;
    private javax.swing.JButton fiveStars;
    private javax.swing.JButton fourStars;
    private javax.swing.JComboBox genreComboBox;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel movieTitleLabel;
    private javax.swing.JTextField movieTitleTextField;
    private javax.swing.JButton oneStar;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JButton sortedMoviesButton;
    private javax.swing.JButton threeStars;
    private javax.swing.JButton twoStars;
    // End of variables declaration//GEN-END:variables
}
