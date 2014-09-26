/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program sorts the digits of a three-digit number into ones, ten, and hundreds
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create variables
        int number;
        int ones;
        int tens;
        int hundreds;
        
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Please enter a three digit number");
        number = numberInput.nextInt();
        
        //Create output
        System.out.println("You chose the three digit number " + number);
        System.out.format("%-8s | %-9s", "Place", "Value");
        
        //Find ones value
        ones = number % 10;
        System.out.print("\n");
        System.out.format("%-8s | %-9s", "Ones", "" + ones);
        
        //Find tens value
        tens = (number % 100 - ones) / 10;
        System.out.print("\n");
        System.out.format("%-8s | %-9s", "Tens", "" + tens);
        
        //Find hundreds value
        hundreds = (number % 1000 - (tens * 10) - ones)/ 100;
        System.out.print("\n");
        System.out.format("%-8s | %-9s", "Hundreds", "" + hundreds);
        System.out.print("\n");
        
    }
    
}
