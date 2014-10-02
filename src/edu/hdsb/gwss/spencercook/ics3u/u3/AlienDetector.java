/* Name: Spencer Cook
 * Date: October 2, 2014
 * Version: v0
 * Description:
 This program finds an alien based on the number of antenna and number of eyes that the user inputs.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int numberOfAntenna;
        int numberOfEyes;
        
        //Objects 
        Scanner alienScanner = new Scanner(System.in);
        
        /*USER INPUT*/
        System.out.println("Welcome to the Canadian Cosmos Alien Tracker!");
        //Get number of antenna
        System.out.print("How many antenna did the alien have? ");
        numberOfAntenna = alienScanner.nextInt();
        //Get number of eyes
        System.out.print("How many eyes did the alien have? ");
        numberOfEyes = alienScanner.nextInt();
        
        //Check to see what alien it is
        if (!(numberOfAntenna >= 3 && numberOfEyes <= 4) && !(numberOfAntenna <= 6 && numberOfEyes >= 2) && !(numberOfAntenna <= 3 && numberOfEyes <= 2)) {
            System.out.println("We do not recognize your alien.");
        }
        if (numberOfAntenna >= 3 && numberOfEyes <= 4) {
            System.out.println("You have detected the TroyMartian!");
        }
        if (numberOfAntenna <= 6 && numberOfEyes >= 2) {
            System.out.println("You have detected the VladSaturnian!");
        }
        if (numberOfAntenna <= 3 && numberOfEyes <= 2) {
            System.out.println("You have detected the GraemeMercurian!");
        }
    
    }      

}
