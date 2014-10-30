/* Name: Spencer Cook
 * Date: October 30, 2014
 * Version: v0
 * Description:
 This program converts a number to its word form
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

/**
 *
 * @author spencercook
 */
public class NumberToWords {
//Global Variables
    static int number = 87;
    static String numberString = "" + number;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        //Introduce program
        System.out.println("Welcome to the Numbers To Words Converter!");
        System.out.println("This program will convert a numerical value of its number to its word form.");
           
        
    }
    
    public static void tens(int tensValue) {
        
    }
    
    public static void teens(int teensValue) {
        String lastNumber = numberString.substring(1);
        
        if (numberString.equals("10")) {
            System.out.println(number + " = ten");
        } else if (numberString.equals("11")) {
            System.out.println(number + " = eleven");
        } else if (numberString.equals("12")) {
            System.out.println(number + " = twelve");
        }   
    }
    
    public static void ones(int onesValue) {
        
    }
    
}
