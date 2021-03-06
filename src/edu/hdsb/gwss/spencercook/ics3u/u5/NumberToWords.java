/* Name: Spencer Cook
 * Date: October 30, 2014
 * Version: v0
 * Description:
 This program converts a number to its word form
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class NumberToWords {
//Global Variables

    static int number = 67;
    static String numberString;
    static int digit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Objects
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Numbers To Words Converter!");
        System.out.println("This program will convert a numerical value of its number to its word form.");

        //USER INPUT; GET, SET
        // - Get number
        System.out.print("Please input a number:");
        number = input.nextInt();
        numberString = number + "";
        numberString = numberString.trim();

        //Check if number is two digits or one digit
        if (numberString.length() == 1) {
            System.out.print(number + " = ");
            ones();
        } else if (numberString.length() == 2) {
            System.out.print(number + " = ");
            tens();
        } else {
            System.out.println("Please input a number between 1 and 99 (inclusively).");
        }    
        System.out.println("\nThank you for using the Number To Words Converter!");

    }

    public static void tens() {
        //Get tens value by dividing int by 10
        int tensValue = number / 10;
        switch (tensValue) {
            case 1:
                teens();
                break;
            case 2:
                System.out.print("Twenty ");
                ones();
                break;
            case 3:
                System.out.print("Thirty ");
                ones();
                break;
            case 4:
                System.out.print("Forty ");
                ones();
                break;
            case 5:
                System.out.print("Fifty ");
                ones();
                break;
            case 6:
                System.out.print("Sixty ");
                ones();
                break;
            case 7:
                System.out.print("Seventy ");
                ones();
                break;
            case 8:
                System.out.print("Eighty ");
                ones();
                break;
            case 9:
                System.out.print("Ninety ");
                ones();
                break;
        }

    }

    public static void teens() {
        //Check if number is fourteen, sixteen, seventeen, eightteen, or nineteen
        digit = number % 10;
        if (digit == 4 || digit == 6 || digit == 7 || digit == 8 || digit == 9) {
            ones();
            System.out.print("teen");
        } //If not, just print out special cases 
        else {
            switch (digit) {
                case 0:
                    System.out.print("Ten");
                    break;
                case 1:
                    System.out.print("Eleven");
                    break;
                case 2:
                    System.out.print("Twelve");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 5:
                    System.out.print("Fifteen");
                    break;

            }
        }
    }

    public static void ones() {
        //Add in ones digit to number
        int remainder = number % 10;
        switch (remainder) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
        }
        
    }
    

}
