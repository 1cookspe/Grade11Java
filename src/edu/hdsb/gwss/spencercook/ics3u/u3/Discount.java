/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the discounted price at a store
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author 1cookspe
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        // Variables
        double totalPurchases;
        double discountedPrice;
        
        //Objects
        Scanner checkDiscount = new Scanner(System.in);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        
        //Get totalPurchases
        System.out.println("Welcome to Home Depot!");
        System.out.print("What is the value of the products you bought today? $");
        totalPurchases = checkDiscount.nextDouble();
        
        //Check if purchases are over $10.00
        if (totalPurchases > 10) {
          discountedPrice = totalPurchases * 2;
          discountedPrice = totalPurchases - discountedPrice;
          System.out.println("Congratulations! You saved 10% off your total bill!");
          System.out.format("%-10s %10s", "Total Price:", "" + dollarFormat.format(totalPurchases));
          System.out.format("\n%-10s %10s", "You Pay:", "" + dollarFormat.format(discountedPrice));
        } else {
            System.out.println("Your total for today is " + dollarFormat.format(totalPurchases));
        }
        System.out.println("\nThank you for shopping with us.");
    }
    
}
