/* Name: Spencer Cook
 * Date: October 9, 2014
 * Version: v0
 * Description:
 This program prints out two words on 30 lines.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final int THIRTY_SPACES = 30;

        //Variables
        String firstWord;
        String secondWord;
        int lines;
        int firstLength;
        int secondLength;
        int counter = 0;
        
        // Objects
        Scanner input = new Scanner(System.in);

        //USER-INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the Length30 Generator!");
        System.out.println("After you input two words, the program automatically formats them into 30 spaces.");
        // - Get firstWord
        System.out.print("What is your first word? ");
        firstWord = input.nextLine();
        // - Get secondWord
        System.out.print("What is your second word? ");
        secondWord = input.nextLine();
        
        //LOOP
        // - Calculate lines used
        // - Add in extra lines to equal 30
        // - Check for valid information
        firstLength = firstWord.length();
        secondLength = secondWord.length();
        if ((firstLength > 0 && firstLength <= 15) && (secondLength > 0 && secondLength <= 15)) {
            lines = firstLength + secondLength;
            System.out.print(firstWord);
            while (lines < THIRTY_SPACES) {
                lines++;
                System.out.print(".");
            }
            System.out.print(secondWord);
        } else {
            System.out.println("Invalid information. Please input a word with more than one characters and less than 15 characters");
        }   
    }

}
