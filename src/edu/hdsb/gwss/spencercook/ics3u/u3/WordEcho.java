/* Name: Spencer Cook
 * Date: October 9, 2014
 * Version: v0
 * Description:
 This program prints out a word as many times as there are letters in it.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Variables
        String word;
        int length;
        int counter = 0;
        
        //Objects
        Scanner input = new Scanner(System.in);
        
        //USER-INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to Word Echo!");
        System.out.println("You can input a word and this program will print it out as many times as there are letters in the word!");
        //Get word
        System.out.print("Please input your word: ");
        word = input.nextLine();
        
        //LOOPS + IF STATEMENTS
        // - Check to see if user inputted no word
        // - Use loop to print out word as specified
        length = word.length();
        if (length > 0) {
            do {
            counter++;
            System.out.println(word);
            } while (counter < length);    
        } else {
            System.out.println("Please input a valid word.");
        }   
    }
    
}
