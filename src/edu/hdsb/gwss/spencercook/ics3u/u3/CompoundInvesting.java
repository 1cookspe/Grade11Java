/* Name: Spencer Cook
 * Date: October 17, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the a user's total revenue after investing for a set amount of years.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants

        //Variables
        int numberOfYears;
        double yearlyInvestment;
        double interestRate;
        double total;
        double totalInterest;
        
        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //USER INPUT; GET, SET
        //- Introduce program
        System.out.println("Welcome to the Compound Investor!");
        System.out.println("After asking for the number of years in your investment, your yearly investment rate, and your interest rate, this program calculates the total in your bank account after each year!");
        // - Ask for numberOfYears of the investment
        System.out.print("How many years will you be investing? ");
        numberOfYears = input.nextInt();
        // - Ask for yearlyInvestment
        System.out.print("How much will you be investing each year? ");
        yearlyInvestment = input.nextDouble();
        // - Ask for interest rate
        System.out.print("At what interest rate will you be investing at each year? ");
        interestRate = input.nextDouble();

        System.out.format("%1s%25s%15s%15s", "Year", "Amount In Account", "Interest", "Total");
        for (int years = 1; years <= numberOfYears; years++) {
            totalInterest = interestRate / 100 * yearlyInvestment;
            total = totalInterest + yearlyInvestment;
            System.out.format("\n%1s%25s%17s%17s", years, money.format(yearlyInvestment), money.format(totalInterest), money.format(total));
            yearlyInvestment = total + yearlyInvestment;

        }
        System.out.println();
        

    }

}
