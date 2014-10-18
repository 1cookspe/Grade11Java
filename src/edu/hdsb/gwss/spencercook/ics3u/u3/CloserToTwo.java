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
        double a = 0;
        double b = 1 / 1;
        double c = 0;

        //Introduce program
        System.out.println("Welcome to the CloserToTwo Calculator!");
        System.out.println("The program prints the calculations of adding the square roots of fractions to the preceding sum without getting a sum of 2 or greater.");

        //CALCULATIONS
        while (b > 0.5) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            b = b / 2;
            a = c;
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);

        }

        System.out.println(" A = " + a);
        System.out.println(" B = " + b);
        System.out.println(" C = " + c);
        while (c <= 2) {
            //System.out.println(c + ", ");
            a = c;
            b = b * b;
            c = a + b;
            System.out.println(Math.round(c) + ", ");
//
////        System.out.println(" A = " + a);
////        System.out.println(" B = " + b);
////        System.out.println(" C = " + c);
        }
        //System.out.print("...");

    }

}
