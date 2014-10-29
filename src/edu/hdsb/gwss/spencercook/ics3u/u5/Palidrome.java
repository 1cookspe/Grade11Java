/* Name: Spencer Cook
 * Date: October 29, 2014
 * Version: v0
 * Description:
 This program checks if the word inputted by the user is a palindrome
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Palidrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String word = new String("hey");
        String leftWord = "";
        String rightWord = "";
        String finalWord = "";
        
        //Objects
        Scanner input = new Scanner(System.in);
        
        //Introduce program
        System.out.println("Welcome to the Palidrome Calculator!");
        System.out.println("A palindrome is a word that is spelt the same backwards as it is forwards. After you input a word, this program checks if the word is a palindrome.");
        
        //USER INPUT; GET, SET
        // - Ask for word
        System.out.print("Please input a word:");
        word = input.nextLine();
        word = word.toUpperCase();
        word = word.trim();
        
        //CALCULATIONS
        // - Take length of word and one less of length and then decrease each value to get the substring of each character, then add them together
        int wordLength = word.length();
        int firstLetter = wordLength - 1;
        while (firstLetter >= 0) {
            leftWord = word.substring(firstLetter, wordLength);
            finalWord = finalWord + leftWord;
            firstLetter--;
            wordLength--;
        }
        System.out.println(finalWord);
        
        //Check if finalWord is the same as the initial word
        if (finalWord.equals(word)) {
            System.out.println(word + "is a palindrome!");
        } else {
            System.out.println(word + "is not a palindrome!");
        }    
        System.out.println("Thank you for using the Palindrom Calculator!");
    }
       
    
}
