/* Name: Spencer Cook
 * Date: October 17, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the squared values of fractions whose sum is with the preceeding sum is less than 2.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants

        //Variables
        double sum = 0;
        double b = 1 / 1;
        long den = 1;

        //Introduce program
        System.out.println("Welcome to the CloserToTwo Calculator!");
        System.out.println("The program prints the calculations of adding the square roots of fractions to the preceding sum without getting a sum of 2 or greater.");

        //CALCULATIONS
        while (sum < 2) {
            System.out.print( sum + " + 1/" + den /*+ " = " + Math.round(sum)*/ );
            sum = sum + 1.0/den;
            den = den * 2;
            System.out.println( " = " + sum );

        }

    }

}
