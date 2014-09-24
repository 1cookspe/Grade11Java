/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
        This program creates a quadratic equation with different values of x
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int x = 4;
        //int x = 75;
        int x = -3483;
        double y;
        
        y = 3*x*x - 8*x + 4;
        System.out.print("The value of y is " + y);
        System.out.print(" when x = " + x);
        System.out.print("\n");
    }
    
    /*
    It printed the value of y, which varied as I changed the value of x
    */
}
