/* Name: Spencer Cook
 * Date: October 30, 2014
 * Version: v0
 * Description:
 This program checks if a SIN inputted by the user is valid
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String socialInsuranceNumber = new String();
        String individualNumber;
        int individualInt;
        int evenSIN = 0;
        int oddSIN = 0;
        int sum;
        double nextTen;
        int finalNumber;
        String finalString;

        //Objects
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Social Insurance Number (SIN) checker!");
        System.out.println("A social insurance number is the number that the government or other programs use to identify a citizen. It is composed of nine digits. After asking you for a SIN, this program checks if it is a valid SIN.");
        
        //USER INPUT; GET, SET
        // - Ask for social insurance number
        System.out.print("Please input the Social Insurance Number:");
        socialInsuranceNumber = input.nextLine();
        socialInsuranceNumber = socialInsuranceNumber.trim();

        //CALCULATIONS
        // - Check if SIN is 9 digits
        if (socialInsuranceNumber.length() == 9) {
            // - Multiply every digit in an even position by two, then add them together, including odd, only don't double odd values
            for (int position = 0; position < 8; position++) {
                individualNumber = socialInsuranceNumber.substring(position, position + 1);
                individualInt = Integer.parseInt(individualNumber);
                if (position % 2 != 0) {
                    individualInt *= 2;
                }
                individualNumber = ("" + individualInt);
                if (individualNumber.length() == 1) {
                    if (position % 2 == 0) {
                        oddSIN += individualInt;
                    } else {
                        evenSIN += individualInt;
                    }
                } else {
                    String firstString = individualNumber.substring(0, 1);
                    String secondString = individualNumber.substring(1, 2);
                    int firstInt = Integer.parseInt(firstString);
                    int secondInt = Integer.parseInt(secondString);
                    if (position % 2 == 0) {
                        oddSIN += firstInt + secondInt;
                    } else {
                        evenSIN += firstInt + secondInt;
                    }
                }

            }
            // - Add together even and odd sums, and get next ten
            sum = evenSIN + oddSIN;
            nextTen = (double) sum / 10;
            nextTen = Math.ceil(nextTen);
            nextTen *= 10;
            finalNumber = (int) (nextTen - sum);
            finalString = "" + finalNumber;
            if (finalString.equals(socialInsuranceNumber.substring(8))) {
                System.out.println(socialInsuranceNumber + " is a valid SIN!");
            } else {
                System.out.println(socialInsuranceNumber + " is not a valid SIN!");
            }

        } else {
            System.out.println("A SIN must be 9 digits long.");
        }
        System.out.println("Thank you for using the SIN Checker!");
    }

}
