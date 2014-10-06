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
        // Constants

        // Variables
        double firstSideLength;
        double secondSideLength;
        double thirdSideLength;
        boolean isATriangle;
        boolean firstSideIsLongest;
        boolean secondSideIsLongest;
        boolean thirdSideIsLongest;

        // Objects
        Scanner sideInput = new Scanner(System.in);

        //USER-INPUT; GET, SET
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
        if (thirdSideLength > secondSideLength && thirdSideLength > firstSideLength) {
            thirdSideIsLongest = true;
        } else if (secondSideLength > thirdSideLength && secondSideLength > firstSideLength) {
            secondSideIsLongest = true;
        } else {
            firstSideIsLongest = true;
        }
    }

}
