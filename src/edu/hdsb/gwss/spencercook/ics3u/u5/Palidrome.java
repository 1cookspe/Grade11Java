/* Name: Spencer Cook
 * Date: October 29, 2014
 * Version: v0
 * Description:
 This program checks if the word inputted by the user is a palindrome
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

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
        String word = new String("yall");
        String leftWord = "";
        String rightWord = "";
        String finalWord = "";
        
        //Introduce program
        System.out.println("Welcome to the Palidrome Calculator!");
        System.out.println("A palindrome is a word that is spelt the same backwards as it is forwards. After you input a word, this program checks if the word is a palindrome.");
        
        //CALCULATIONS
        for (int letters = 0; letters <= word.length(); letters++) {
            leftWord = word.substring(letters, word.length());
            rightWord = word.substring(0, letters);
            finalWord = leftWord + rightWord;
            //System.out.println(finalWord);
        }
        //System.out.println(finalWord);
    }
    
}
