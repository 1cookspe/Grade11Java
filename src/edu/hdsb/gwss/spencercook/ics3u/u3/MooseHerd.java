/* Name: Spencer Cook
 * Date: October 15, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the range of two numbers using a for loop
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class MooseHerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        double numberOfMoose = 0;
        double year = 1;
        int counter = 0;
        
        //CALCULATIONS
        // - Write out numberOfMouse every year for 25 years
        for ( ; year <= 25; year++) {
            numberOfMoose = 220 / (1.0 + 10.0 * Math.pow(0.83, year));
            if (numberOfMoose <= 80) {
                counter++;
                System.out.println((int)numberOfMoose);
          
            }
           
        }    
         System.out.println("The moose need to be supervised for " + counter + " years.");
    }
    
}
