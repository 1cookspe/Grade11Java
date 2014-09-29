/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program that calculates the third side of a triangle after the user inputs two sides
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare and initialize variables
        double sideA;
        double sideB;
        double angleC;
        double thirdSide;
        
        //Objects
        Scanner triangleInput = new Scanner(System.in);
        
        //Get user input
        System.out.println("Welcome to the Triangle Calculator!");
        System.out.print("Please input the value of the first side on the triangle: ");
        sideA = triangleInput.nextDouble();
        System.out.print("Input the value of the second side: ");
        sideB = triangleInput.nextDouble();
        System.out.print("Input the value of the angle C: ");
        angleC = triangleInput.nextDouble();
        
        thirdSide = Math.sqrt((sideA * sideA) + (sideB * sideB) - (2 * sideA * sideB * Math.cos(angleC)));
        System.out.println("The value of the third side is " + thirdSide);
        
    }
    
}
