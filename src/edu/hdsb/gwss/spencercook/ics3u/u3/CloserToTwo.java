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
        double numberOne = 0;
        double numberTwo = 1/1;
        double sum = 0;
        
        //CALCULATIONS
        for (; sum <= 1; ) {
                sum = numberOne + numberTwo;
                System.out.println("" + numberOne + " + " + numberTwo + " = " + sum);
                numberOne = sum;
                numberTwo /= 2;
            } 
        while (sum < 2) {
            sum = 0;
            sum = numberOne + numberTwo; 
            System.out.println("" + numberOne + " + " + numberTwo + " = " + sum);
            numberOne = sum;
            numberTwo *= numberTwo;
            System.out.println("" + numberOne + " + " + numberTwo + " = " + sum);
        }    
    }
    
}
