/* Name: Spencer Cook
 * Date: October 1, 2014
 * Version: v0
 * Description:
 This program calculates if the user has purchased the correct number of washers, nuts, and bolts at a tool shop.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author spencercook
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;
        
        // Variables
        int numberOfBolts;
        int numberOfNuts;
        int numberOfWashers;
        int totalBoltPurchase;
        int totalNutPurchase;
        int totalWasherPurchase;
        int totalPartsPurchased;
        double moneySpent;
        
        // Objects
        Scanner boltsInput = new Scanner(System.in);
        
        /* Get user-input */
        System.out.println("Welcome to Bob's Discount Bolts!");
        //Ask for number of bolts and calculate cost
        System.out.print("How many bolts have you purchased? ");
        numberOfBolts = boltsInput.nextInt();
        totalBoltPurchase = numberOfBolts * BOLT_PRICE;
        //Ask for number of nuts and calculate cost
        System.out.print("How many nuts have you purchased? ");
        numberOfNuts = boltsInput.nextInt();
        totalNutPurchase = numberOfBolts * NUT_PRICE;
        //Ask for number of washers and calculate cost
        System.out.print("How many washers have you purchased? ");
        numberOfWashers = boltsInput.nextInt();
        totalWasherPurchase = numberOfWashers * WASHER_PRICE;
        //Find total parts purchased
        totalPartsPurchased = numberOfWashers + numberOfNuts + numberOfBolts;
        //Calculate total money spent
        moneySpent = totalWasherPurchase + totalNutPurchase + totalBoltPurchase;
        
        // Print out bill
        System.out.format("\n%60s", "Bob's Discount Bolts");
        System.out.format("\n%70s", "1 Infinite Loop, Cupertino, California");
        System.out.format("\n%-9s|%10s|%7s", " Product ", " Quantity ", " Price ");
        System.out.format("\n%-9s|%10s|%7s", " Bolts ", "" + numberOfBolts, "" + totalBoltPurchase + "¢");
        System.out.format("\n%-9s|%10s|%7s", " Nuts ", "" + numberOfNuts, "" + totalNutPurchase + "¢");
        System.out.format("\n%-9s|%10s|%7s", " Washer ", "" + numberOfWashers, "" + totalWasherPurchase + "¢");
        System.out.format("\n%-9s|%10s|%7s", " Total ", "" + totalPartsPurchased,  "" + moneySpent + "¢");
        
        //Checks to see if purchase is valid
        if (numberOfNuts >= numberOfBolts && (numberOfBolts * 2) <= numberOfWashers) {
            System.out.println("\nOrder is valid");
        } else {
            System.out.println("\nOrder is invalid. You need at least as many bolts as nuts and you need at least twice as many washers as bolts. Please try again.");
        }
        System.out.println("Thank you for shopping with us!");
    }
}
