/* Name: Spencer Cook
 * Date: October 6, 2014
 * Version: v0
 * Description:
 This program asks the user to enter three sides of a figure and determines whether or not the figure is a triangle. 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double firstSideLength;
        double secondSideLength;
        double thirdSideLength;

        // Objects
        Scanner sideInput = new Scanner(System.in);

        //USER-INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the \"Is it a Triangle\" Generator!");
        System.out.println("A triangle is only valid if the sum of two sides are greater than that of the remaining side.");
        //Get firstSideLength
        System.out.print("Please input the length of the first side: ");
        firstSideLength = sideInput.nextDouble();
        //Get secondSideLength
        System.out.print("Please input the length of the second side: ");
        secondSideLength = sideInput.nextDouble();
        //Get thirdSideLength
        System.out.print("Please input the length of the third side: ");
        thirdSideLength = sideInput.nextDouble();

        //LOGICAL CALCULATIONS
        // - Find the longest sides by comparing their values in an if statement
        // - Get the sum of the two smaller sides and check if they are greater than the length of the third side
        // - Check to see if value is valid
        if (firstSideLength > 0 && secondSideLength > 0 && thirdSideLength > 0) {
            if (firstSideLength > thirdSideLength) {
                double temporary = firstSideLength;
                firstSideLength = thirdSideLength;
                thirdSideLength = temporary;
            }
            if (secondSideLength > thirdSideLength) {
                double temporarySecond = secondSideLength;
                secondSideLength = thirdSideLength;
                thirdSideLength = temporarySecond;
            }
            if (firstSideLength > secondSideLength) {
                double temporaryFirst = firstSideLength;
                firstSideLength = secondSideLength;
                secondSideLength = temporaryFirst;
            }

        //PERFORM CALCULATIONS
            // - Check if it is a triangle by adding the lowest sides to see if it is greater than longest side
            if (firstSideLength + secondSideLength > thirdSideLength) {
                System.out.println("The sides " + firstSideLength + ", " + secondSideLength + " and " + thirdSideLength + " make up a triangle!");
            } else {
                System.out.println("The sides " + firstSideLength + ", " + secondSideLength + " and " + thirdSideLength + " do not make up a triangle.");
            }
        } else {
            System.out.println("Invalid information. Please make sure you have input values over 0.");
        }
        System.out.println("Thank you for using the \"Is it a Triangle?\" generator!");
    }
}
