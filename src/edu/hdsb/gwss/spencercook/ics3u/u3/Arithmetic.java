/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
        This program creates different variables and performs basic mathematical functions with them.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double a;
        double b;
        
        //Objects
        Scanner mathInput = new Scanner(System.in);
        
        //Get user-input
        System.out.print("Input the value of your first number: ");
        a = mathInput.nextDouble();
        System.out.print("Input value of second number: ");
        b = mathInput.nextDouble();
        
        //Calculate sum and display it
        double sum = a + b;
        System.out.print("The sum of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + sum);
        
        //Calculate difference and display it
        double difference = a - b;
        System.out.print("\nThe difference of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + difference);
        
        //Calculate product and display it
        double product = a * b;
        System.out.print("\nThe product of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + product);
        
        //Calculate Modulus and display it
        double modulus = a % b;
        System.out.print("\nThe modulus of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + modulus);
        System.out.print("\n");
    }
    
}
