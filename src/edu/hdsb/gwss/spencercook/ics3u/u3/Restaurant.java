/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates a bill at a restaurant
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 1cookspe
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constants        
        final double TAX = 1.13;

        // Initialize and declare variables
        double steakCost;
        double drinkCost;
        double dessertCost;
        double totalCost;
        double roundedCost;
        int numberOfMeals;
        
        //Objects
        Scanner mealInput = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //Create user-input for meal costs
        System.out.println("Welcome to Burger King\n");
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

        //Print table
        System.out.format("\n%-15s | %-6s", "Product", "Cost");
        System.out.format("\n%-15s | %-6s", "Main Course", "" + money.format(steakCost));
        System.out.format("\n%-15s | %-6s", "Drink", "" + money.format(drinkCost));
        System.out.format("\n%-15s | %-6s", "Dessert", "" + money.format(dessertCost));
        System.out.format("\n%-15s | %-6s", "Tax", "13%");
        System.out.format("\n%-15s | %-6s", "Total", ""  + money.format(totalCost));
        System.out.println("\nThank you for choosing Burger King\n");
    }

}
