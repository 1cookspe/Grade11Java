/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import javax.print.attribute.standard.Media;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 *
 * @author spencercook
 */
public class Experimenting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, Exception {
        File sound = new File("bing.mp3");
        if (sound.exists()) {
            playSound(sound);
        } else {
            System.out.println("Doesn't exist!");
        }
    }
    
    static void playSound(File file) {
        try {
            String bip = "bing.mp3";
            Media hit = new Media(bip);
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
        } catch (Exception e) {
            System.out.println("Dammit");
            e.printStackTrace();
        }
    }
    
    public static void newFile() throws FileNotFoundException {
        File file = new File("hahaha.xml");
        if (!file.exists()) {
        PrintWriter print = new PrintWriter(file);
        print.write("Hello this is new!");
        print.close();
        } else {
            System.out.println("It already exists!");
        }
    }
    
}
