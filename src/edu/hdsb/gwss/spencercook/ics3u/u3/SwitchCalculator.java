/* Name: Spencer Cook
 * Date: October 7, 2014
 * Version: v0
 * Description:
 This program asks the user to two values and then hits a number from 1-5 to add, subtract, multiply, or divide the numbers, or exit the program
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class SwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        // Variables
        double x;
        double y;
        int choice;
        double sum;
        double difference;
        double product;
        double quotient;
        
        // Objects
        Scanner switchInput = new Scanner(System.in);
        
        //USER INPUT; GET, SET
        System.out.println("Welcome to the6"
                + " Switch Calculator!");
        System.out.print("Enter value of the first number: ");
        x = switchInput.nextDouble();
        System.out.print("Enter value of second number: ");
        y = switchInput.nextDouble();
        System.out.format("\n%-10s %8s", "Press 1 for: ", "Addition");
        System.out.format("\n%-10s %8s", "Press 2 for: ", "Subtraction");
        System.out.format("\n%-10s %8s", "Press 3 for: ", "Multiplication");
        System.out.format("\n%-10s %8s", "Press 4 for: ", "Division");
        System.out.format("\n%-10s %5s", "Press 5 for: ", "Exit");
        System.out.print("\nPlease input your choice here based on the menu above: ");
        choice = switchInput.nextInt();
        
        //Switch statement
        switch (choice) {
            case 1:
                sum = x + y;
                System.out.println("The sum of " + x + " and " + y + " is " + sum);
                break;
            case 2:
                difference = x - y;
                System.out.println("The difference of " + x + " and " + y + " is " + difference);
                break;
            case 3:
                product = x * y;
                System.out.println("The difference of " + x + " and " + y + " is " + product);
                break;
            case 4:
                quotient = x / y;
                System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
                break;
            case 5:
                System.out.println("Exiting program...Please wait.");
                break;
            default:
                System.out.println("That is not a valid input. Please refer to the menu above and try again.");
        }
    }
    
}
