/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program prints the area of a triangle using Heron's Formula
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create and initialize variables
        double s;
        double a = 6.55;
        double b = 3.92;
        double c = 5.87;
        double area;
        s = (a + b + c) / 2;
        
        //Find area by inputting formula
        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        
        //Print to user
        System.out.print("The area of a triangle with sides " + a);
        System.out.print(", " + b);
        System.out.print(" and " + c);
        System.out.print(" is " + area);
    }
    
}
