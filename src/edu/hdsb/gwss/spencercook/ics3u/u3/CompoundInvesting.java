/* Name: Spencer Cook
 * Date: October 17, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the a user's total revenue after investing for 15 years.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

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
        int numberOfYears = 3;
        double yearlyInvestment = 100.00;
        double interestRate = 2.5;
        //double amountInAccount = 1;
        double total = 0;
        double totalInterest;

        System.out.format("%1s%25s%15s%15s", "Year", "Amount In Account", "Interest", "Total");
        for (int years = 1; years <= numberOfYears; years++) {
            totalInterest = interestRate / 100 * yearlyInvestment;
            total = totalInterest + yearlyInvestment;
            System.out.format("\n%1s%25s%15s%15s", years, yearlyInvestment, totalInterest, total );
            yearlyInvestment = total + 100;

        }
        

    }

}
