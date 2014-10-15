/* Name: Spencer Cook
 * Date: October 9, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the range of two numbers using a for loop
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class StartEndFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Variables
        int start = 1;
        int end = 1;

        //Objects
        Scanner input = new Scanner(System.in);

        //USER-INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the StartEnd Calculator!");
        System.out.println("This program takes your start number and end number and prints the values in between the numbers.");
        //Get start
        System.out.print("Please input the number you would like to start with: ");
        start = input.nextInt();
        //Get end
        System.out.print("Please input the number you would like to end with: ");
        end = input.nextInt();
        
        //LOOP + IF STATEMENT
        // - Print the values in between the start and end
        // - Check to see if end is less than start
        if (start < end) {
        System.out.println(start);
            while (start < end) {
            start++;
            System.out.println(start);
        }
    }

    
        else {
            System.out.println(start);
            while (end < start) {
            start--;
            System.out.println(start);
        }

    }

    }
    
}
