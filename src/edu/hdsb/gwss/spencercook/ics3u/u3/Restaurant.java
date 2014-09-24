/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates a bill at a restaurant
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double steakCost = 21.46;
        double drinkCost = 5.87;
        double dessertCost = 12.39;
        final double TAX = 1.13;
        double totalCost;

        //Calculate total bill
        totalCost = (steakCost + drinkCost + dessertCost) * TAX;

        //Print table
        System.out.format("%-8s | %-6s", "Product", "Cost");
    }

}
