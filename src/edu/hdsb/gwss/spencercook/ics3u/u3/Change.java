/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the minimum amount of coins needed to pay for the amount inputted by the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create variables
        int numberOfCents;
        int numberOfQuarters;
        int numberOfDimes;
        int numberOfNickles;
        int numberOfPennies;
        int remainingCents;
        
        //Objects
        Scanner centsInput = new Scanner(System.in);
        
        //Create user-input for the numberOfCents
        System.out.print("Please input a value less than $1 in cents");
        numberOfCents = centsInput.nextInt();
       
        //Checks to see if the change is under $1.00
        if (numberOfCents < 100) {
            System.out.println("Change in Cents = " + numberOfCents);
        } else {
            System.out.println("That value is too high. Please input change that is less than $1.00.");
            Scanner centsInputRedo = new Scanner(System.in);
        System.out.print("Please input a value less than $1 in cents");
        numberOfCents = centsInputRedo.nextInt();
        }
        
        //Create table and output
        System.out.print("\nBelow is a list of the minimum amount of coins to make " + numberOfCents);
        System.out.print(" coins.\n");
        System.out.format("%-8s | %3s", "Coins", "Number of Coins");
        
        //Find and print the number of quarters and remaining coins
        numberOfQuarters = numberOfCents / 25;
        remainingCents = numberOfCents - (numberOfQuarters * 25);
        System.out.format("\n%-8s | %8s", "Quarters", "" + numberOfQuarters);
        
        //Find and print the number of dimes
        numberOfDimes = remainingCents / 10;
        remainingCents = remainingCents - (numberOfDimes * 10);
        System.out.format("\n%-8s | %8s", "Dimes", "" + numberOfDimes);
        
        //Find and print number of nickels
        numberOfNickles = remainingCents / 5;
        remainingCents = remainingCents - (numberOfNickles * 5);
        System.out.format("\n%-8s | %8s", "Nickles", "" + numberOfNickles);
        
        //Find and print the number of pennies
        numberOfPennies = remainingCents / 1;
        System.out.format("\n%-8s | %8s", "Pennies", "" + numberOfPennies);
        System.out.print("\n");
    }
    
    
}
