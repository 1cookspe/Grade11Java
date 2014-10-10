/* Name: Spencer Cook
 * Date: October 8, 2014
 * Version: v0
 * Description:
 This program reads a mass of a letter and gives the cost of mailing a first or second cost letter having that mass. 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double FORTY_CENTS = 0.40;
        final double EIGHTY_CENTS = 0.80;
        final double THIRTY_CENTS = 0.30;
        final double SIXTY_CENTS = 0.60;
        final double FIFTY_CENTS = 0.50;
        final double FIFTY_GRAMS = 50;
        final double THIRTY_GRAMS = 30;
        final double HUNDRED_GRAMS = 100;
        final double ADDITIONAL_FIRST = 0.29;
        final double ADDITIONAL_SECOND = 0.19;

        // Variables
        int letterClass;
        double weight;
        double cost;
        int additionalTimes;

        // Objects
        Scanner letterInput = new Scanner(System.in);
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        //USER INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the Letter Cost Generator!");
        System.out.println("This program tells you the cost of shipping a letter based on the type of shipping you select (First Class or Second Class) and the weight of the letter.");
        // Get type of letter user wants to send (first class or second class)
        System.out.format("%-10s %4s", "Press 1 for:", "First Class Shipping");
        System.out.format("\n%-10s %4s", "Press 2 for:", "Second Class Shipping\n");
        letterClass = letterInput.nextInt();

        //SWITCH STATEMENT
        // - Checks to see which number user pressed
        switch (letterClass) {
            case 1:
                System.out.print("Please input the weight (in grams): ");
                weight = letterInput.nextDouble();
                if (weight > 0) {
                    if (weight < THIRTY_GRAMS) {
                        cost = FORTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + " using First Class shipping is " + dollar.format(cost));
                    } else if (weight < FIFTY_GRAMS) {
                        cost = SIXTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + " using First Class shipping is " + dollar.format(cost));
                    } else if (weight < HUNDRED_GRAMS) {
                        cost = EIGHTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + " using First Class shipping is " + dollar.format(cost));
                    } else {
                        additionalTimes = (int) (((int) weight - HUNDRED_GRAMS) / FIFTY_GRAMS);
                        cost = EIGHTY_CENTS + (additionalTimes * ADDITIONAL_FIRST);
                        System.out.println("The cost for sending a letter at " + weight + " using First Class shipping is " + dollar.format(cost));

                    }
                } else {
                    System.out.println("Invalid value. Please input a weight more than 0.");
                }
                break;
            case 2:
                System.out.print("Please input the weight (in grams): ");
                weight = letterInput.nextDouble();
                if (weight > 0) {
                    if (weight < THIRTY_GRAMS) {
                        cost = THIRTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + "g using Second Class shipping is " + dollar.format(cost));
                    } else if (weight < FIFTY_GRAMS) {
                        cost = FIFTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + " using Second Class shipping is " + dollar.format(cost));
                    } else if (weight < HUNDRED_GRAMS) {
                        cost = SIXTY_CENTS;
                        System.out.println("The cost for sending a letter at " + weight + " using Second Class shipping is " + dollar.format(cost));
                    } else {
                        additionalTimes = (int) (((int) weight - HUNDRED_GRAMS) / FIFTY_GRAMS);
                        cost = SIXTY_CENTS + (additionalTimes * ADDITIONAL_SECOND);
                        System.out.println("The cost for sending a letter at " + weight + " using Second Class shipping is " + dollar.format(cost));

                    }
                } else {
                    System.out.println("Invalid value. Please input a weight more than 0.");
                }
                break;
            default:
                System.out.println("Invalid information. Please input a 1 for First Class Shipping, and a 2 for Second Class Shipping.");
        }
        System.out.println("Thank you for using the Letter Cost Calculator!");
    }
}
