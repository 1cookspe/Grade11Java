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
        double steakCost = 63.2;
        double drinkCost = 63.4;
        double dessertCost = 37.4;
        final double TAX = 1.13;
        double totalCost;
        double roundedCost;

        
        
        //Calculate total bill
        totalCost = (steakCost + drinkCost + dessertCost) * TAX;
        roundedCost = totalCost * 100;
        Math.round(roundedCost * 100);
        Math.round((100*roundedCost)/(double)100);

        //Print table
        System.out.format("%-15s | %-6s", "Product", "Cost");
        System.out.format("\n%-15s | %-6s", "Steak", "$21.46");
        System.out.format("\n%-15s | %-6s", "Iced Tea", "$5.37");
        System.out.format("\n%-15s | %-6s", "Chocolate Cake", "$12.39");
        System.out.format("\n%-15s | %-6s", "Tax", "13%");
        System.out.format("\n%-15s | %-6s", "Total", "$" + roundedCost);
        System.out.print("\n");
    }

}
