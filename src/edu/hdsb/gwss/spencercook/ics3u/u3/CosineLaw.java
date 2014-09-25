/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program that calculates the third side of a triangle after the user inputs two sides
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

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
        double sideA = 5.65;
        double sideB = 3.56;
        double angleC = 65.0;
        double thirdSide;
        
        thirdSide = Math.sqrt((sideA * sideA) + (sideB * sideB) - (2 * sideA * sideB * Math.cos(angleC)));
        
    }
    
}
