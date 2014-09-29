/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the pay of an employee
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 1cookspe
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constants
        final double TAX_RATE = 0.20;

        // Variables
        long hoursWorked;
        double payRate;
        double payAmount;
        double payWithTax;
        
        //Objects
        Scanner inputPay = new Scanner(System.in);
        NumberFormat payDollars = NumberFormat.getCurrencyInstance();
        
        //Get user-input
        System.out.println("Welcome to the Payroll Calculator");
        //Get value of hoursWorked
        System.out.print("Please input your total hours worked: ");
        hoursWorked = inputPay.nextLong();
        //Get value of payRate
        System.out.print("Input your hourly pay: ");
        payRate = inputPay.nextDouble();
        
        //Calculate total pay
        System.out.println("Hours Worked: " + hoursWorked);
        payAmount = hoursWorked * payRate;
        payDollars.format(payAmount);
        System.out.println("pay Amount  : " + payAmount);
        payWithTax = hoursWorked * payRate * TAX_RATE;
        payDollars.format(payWithTax);
        System.out.println("tax Amount  : " + payWithTax);

        /*
         * Presents error with no initializers because the compiler does not know what to print in the prinln() statements
         * It does not compile with a deleted variable because the compiler now doesn't know what "hoursWorked" means in the println() statements
         * A problem is also detected with no intializers because the compiler needs to know the values to print them
         */
    }

}
