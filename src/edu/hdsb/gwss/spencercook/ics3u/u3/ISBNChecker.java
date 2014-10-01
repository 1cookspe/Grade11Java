/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program checks if an ISBN is valid
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1cookspe
 */
public class ISBNChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        int originalDigits = 9*1 + 7*3 + 8*1 + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3;
        
        // Variables
        int eleventhDigit;
        int twelfthDigit;
        int thirteenthDigit;
        int finalTotal;
        
        //Objects
        Scanner ISBNScanner = new Scanner(System.in);
        
        //Get eleventhDigit and multiply by 1
        System.out.print("Input the 11th digit in the ISBN: ");
        eleventhDigit = ISBNScanner.nextInt();
        
        //Get twelfthDigit and multiply by 3
        System.out.print("Input the 12th digit in the ISBN: ");
        twelfthDigit = ISBNScanner.nextInt();
        twelfthDigit = twelfthDigit * 3;
        
        //Get thirteenthDigit and multiply by 1
        System.out.print("Input the 13th digit in the ISBN: ");
        thirteenthDigit = ISBNScanner.nextInt();
        
        //Add up all digits to see if it is valid
        finalTotal = originalDigits + eleventhDigit + twelfthDigit + thirteenthDigit;
        
        //Check to see if ISBN is valid
        if (finalTotal % 10 == 0) {
            System.out.print("9780921418" + eleventhDigit + "" + twelfthDigit + "" + thirteenthDigit + " is a valid ISBN.\n");
        } else {
            System.out.print("9780921418" + eleventhDigit + "" + twelfthDigit + "" + thirteenthDigit + " is not a valid ISBN.\n");
        }
    }
    
}
