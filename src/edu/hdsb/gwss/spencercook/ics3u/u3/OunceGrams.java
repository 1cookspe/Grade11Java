/* Name: Spencer Cook
 * Date: October 17, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out a conversion from grams to ounces for 25 ounces
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;


/**
 *
 * @author 1cookspe
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double MAX_OUNCES = 25;
        final double CONVERSION_RATE = 28.35;
        
        //PRINT TO USER
        // - Introduce program to user
        System.out.println("Welcome to the Ounces to Grams Converter!");
        System.out.println("This program prints out a table that converts ounces to grams, from 1 to 25. 1 ounce = 28.35 grams.");
        
        // MAKE LOOP
        // - Loop the values of ounces to grams up to 25 grams
        System.out.format("%-2s%6s\n" , "Ounces", "Grams"  );
        for (int ounces = 0; ounces <= MAX_OUNCES; ounces++) {
            double grams = ounces * CONVERSION_RATE;
            System.out.format("%-7s%5.2f\n" , "" + ounces,  grams);
            
        }   
    }
    
}
