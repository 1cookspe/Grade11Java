/* Name: Spencer Cook
 * Date: October 7, 2014
 * Version: v0
 * Description:
 This program asks the user to enter three sides of a triangle and determines whether or not the triangle is a right triangle. 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        // Variables
        double firstSideLength;
        double secondSideLength;
        double thirdSideLength;
        double squaredValue;
        
        // Objects
        Scanner rightTriangleInput = new Scanner(System.in);
        
        //USER INPUT; GET, SET
        System.out.println("Welcome to the \"Is it a Right Triangle\" Calculator!");
        //Get length of firstSide
        System.out.print("Please input the length of the first side: ");
        firstSideLength = rightTriangleInput.nextDouble();
        //Get length of secondSide
        System.out.print("Please input the length of second side: ");
        secondSideLength = rightTriangleInput.nextDouble();
        //Get length of thirdSide
        System.out.print("Please input the length of the third side: ");
        thirdSideLength = rightTriangleInput.nextDouble();
        
         //LOGICAL CALCULATIONS
        // - Find the longest sides by comparing their values in an if statement
        // - Get the sum of the two smaller sides and check if they are greater than the length of the third side
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
        // - Check if it is a right triangle by adding the squares of the lowest sides to see if it equals the square of the longest side
        if (firstSideLength * firstSideLength + secondSideLength * secondSideLength == thirdSideLength * thirdSideLength) {
            System.out.println("This is a right triangle!");
        }    
    
    }
}
