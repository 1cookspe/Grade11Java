/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the minimum amount of coins needed to pay for the amount inputted by the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class ChangeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cents = 221, pennies, nickles, dimes, quarters, remaining; 
        quarters = cents / 25; 
        remaining = cents - (quarters * 25); 
        dimes = remaining / 10; 
        remaining = remaining - (dimes * 10); 
        nickles = remaining / 5;
        remaining = remaining - (nickles * 5); 
        pennies = remaining/ 1; 
        remaining= remaining - (pennies * 1); 
        System.out.format("%-8s | %6s", "Coin", "Number"); 
        System.out.format("\n%-8s | %6s", "Quarters", "" + quarters); 
        System.out.format("\n%-8s | %6s", "Dimes", "" + dimes); 
        System.out.format("\n%-8s | %6s", "Nickles", "" + nickles); 
        System.out.format("\n%-8s | %6s", "Pennies", "" + pennies);
        System.out.print("\n");
    }
    
}
