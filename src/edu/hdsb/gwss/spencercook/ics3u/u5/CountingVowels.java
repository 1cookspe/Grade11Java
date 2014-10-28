/* Name: Spencer Cook
 * Date: October 27, 2014
 * Version: v0
 * Description:
 This counts the vowels in a sentence from the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String word = new String();
        char letter = 'b';
        int numberOfVowels = 0;

        // Objects
        Scanner input = new Scanner(System.in);

        //INTRODUCE PROGRAM
        System.out.println("Welcome to the Count Vowels Calculator!");
        System.out.println("This program counts the number of vowels in a sentence.");
        
        //USER INPUT; GET, SET
        // - Ask for sentence
        System.out.print("Please enter a sentence or word: ");
        word = input.nextLine();
        word = word.toLowerCase();
        
        //CALCULATE NUMBER OF VOWELS
        // - Use loop to go through letters in word
        // - Use switch statement to find the value of each char
        for (int lettersInWord = 0; lettersInWord < word.length(); lettersInWord++) {
            letter = word.charAt(lettersInWord);
            switch (letter) {
                case 'a':
                    numberOfVowels++;
                    break;
                case 'e':
                    numberOfVowels++;
                    break;
                case 'i':
                    numberOfVowels++;
                    break;
                case 'o':
                    numberOfVowels++;
                    break;
                case 'u':
                    numberOfVowels++;
                    break;
                default:
                    break;
            }    
        }    
        System.out.println("There are " + numberOfVowels + " vowels in this sentence.");
    }
}
