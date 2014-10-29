/* Name: Spencer Cook
 * Date: October 28, 2014
 * Version: v0
 * Description:
 This program prints a square out of letters in a word inputted by the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String word = new String();
        String leftLetter;
        String rightLetter;
        String finalString;
        
        //Objects
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Word Square Generator!");
        System.out.println("This program prints out a square of a word entered by the user.");
        
        //USER INPUT; GET, SET
        // - Ask for word
        System.out.print("Please enter your word: ");
        word = input.nextLine();
        word = word.toUpperCase();
        word = word.trim();

        //CALCULATIONS
        // - Use loop to go through all letters and move them one space
        for (int letter = 0; letter < word.length(); letter++) {
            leftLetter = word.substring(letter, word.length());
            //System.out.println(leftLetter);
            rightLetter = word.substring(0, letter);
            //System.out.println(rightLetter);
            finalString = leftLetter + rightLetter;
            System.out.println(finalString);
        }
    }

}
