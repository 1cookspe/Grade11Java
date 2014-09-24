/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
        This program creates different variables and performs basic mathematical functions with them.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 42;
        int b = -786;
        
        //Calculate sum
        double sum = a + b;
        System.out.print("The sum of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + sum);
        
        //Calculate difference
        double difference = a - b;
        System.out.print("\nThe difference of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + difference);
        
        //Calculate product
        double product = a * b;
        System.out.print("\nThe product of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + product);
        
        //Calculate Modulus
        double modulus = a % b;
        System.out.print("\nThe modulus of " + a);
        System.out.print(" and " + b);
        System.out.print(" is " + modulus);
        System.out.print("\n");
    }
    
}
