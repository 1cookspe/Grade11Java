/* Name: Spencer Cook
 * Date: October 18, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the first 20 terms of the Fibonacci Sequence 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final int TWENTY_DIGITS = 20;

        //Variables
        int firstNumber = 1;
        int secondNumber = 1;
        int sum;

        //Introduce program
        System.out.println("Welcome to the Fibanocci Series!");
        System.out.println("The program prints the first 20 digits of the Fibonacci Sequence.");

        // CALCULATIONS
        // - First, print out a and b in their original forms
        // - Next, calculate the next eighteen numbers by adding a and b to make c and setting a to b and b to c after
        System.out.print(firstNumber + ", ");
        System.out.print(secondNumber + ", ");

        for (int digits = 2; digits < TWENTY_DIGITS; digits++) {
            sum = firstNumber + secondNumber;
            System.out.print(sum + ", ");
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        System.out.print("...\n");

    }

}
