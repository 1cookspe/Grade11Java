/* Name: Spencer Cook
 * Date: October 6, 2014
 * Version: v0
 * Description:
 This program asks the user for the pH level of a body of water and returns if the water is too acidic or alkaline for the fish to survive 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double ACIDIC_BENCHMARK = 6.5;
        final double ALKALINE_BENCHMARK = 7.5;

        // Variables
        double pHLevel;

        // Objects
        Scanner pHInput = new Scanner(System.in);

        //USER INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the Acid Rain Calculator!");
        System.out.println("Acid rain is a serious problem. This program allows you to test whether or not the environment is truly safe for marine animals");
        //Get pH Level
        System.out.print("What is the pH level of the body of water? ");
        pHLevel = pHInput.nextDouble();

        //LOGICAL CALCULATIONS
        // - If pHLevel is less than 6.5, the water is too acidic for fish to survive
        // - If pHLevel is more than 7.5, the water is too alkaline for fish to survive
        // - If pHLevel is between 6.5 and 7.5 (including 6.5, 7.5), the water is safe for fish
        // - If pHLevel is greater than 14 or less than 0, then the user inputted an invalid pH value
        if (pHLevel >= 0 && pHLevel <= 14) {
            if (pHLevel < ACIDIC_BENCHMARK) {
                System.out.println("The water is too acidic for the fish to survive. Please try to clean up their environment or move them to another habitat until the pH level ranges from 6.5 to 7.5.");
            } else if (pHLevel > ALKALINE_BENCHMARK) {
                System.out.println("The water is too alkaline for the fish to survive. Please try to clean up their environment or move them to another habitat until the pH level ranges from 6.5 to 7.5.");
            } else {
                System.out.println("The water is neutral, therefore it is safe for the marine animals. Please keep up these good environmental habits!");
            }
        } else {
            System.out.println("That is not a valid pH value. Please try again with a pH value ranging from 0 to 14.");
        }
    }

}
