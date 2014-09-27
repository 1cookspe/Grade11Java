/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates a bill at a restaurant
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize and declare variables
        double steakCost = 63.2;
        double drinkCost = 63.4;
        double dessertCost = 37.4;
        final double TAX = 1.13;
        double totalCost;
        double roundedCost;
        int numberOfMeals;

        //Create user-input for meal costs
        Scanner mealInput = new Scanner(System.in);
        System.out.print("How many items have you purchased?");
        numberOfMeals = mealInput.nextInt();
        
        if (numberOfMeals == 1) {
            System.out.print("\nPlease input the price of your item:");
            steakCost = mealInput.nextDouble();
            dessertCost = 0;
            drinkCost = 0;
        } else if (numberOfMeals == 2) {
            System.out.print("\nPlease input the price of your first item:");
            steakCost = mealInput.nextDouble();
            System.out.print("\nPlease input the price of your drink:");
            drinkCost = mealInput.nextDouble();
            dessertCost = 0;
        } else {
            System.out.print("\nPlease input the price of your first item:");
            steakCost = mealInput.nextDouble();
            System.out.print("\nPlease input the price of your drink:");
            drinkCost = mealInput.nextDouble();
            System.out.print("\nPlease input the price of your dessert");
            dessertCost = mealInput.nextDouble();
        }
       
        //Calculate total bill
        totalCost = (steakCost + drinkCost + dessertCost) * TAX;
        totalCost = Math.round(totalCost);

        //Print table
        System.out.format("%-15s | %-6s", "Product", "Cost");
        System.out.format("\n%-15s | %-6s", "Main Course", "" + steakCost);
        System.out.format("\n%-15s | %-6s", "Drink", "" + drinkCost);
        System.out.format("\n%-15s | %-6s", "Dessert", "" + dessertCost);
        System.out.format("\n%-15s | %-6s", "Tax", "13%");
        System.out.format("\n%-15s | %-6s", "Total", "$" + totalCost); 
        System.out.print("\n");
    }

}
