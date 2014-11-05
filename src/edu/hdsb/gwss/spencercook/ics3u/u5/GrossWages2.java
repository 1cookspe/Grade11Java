/* Name: Spencer Cook
 * Date: November 5, 2014
 * Version: v0
 * Description:
 This program calculates the wages of a worker, based on hourly pay, hours worked, overtime pay, and country of residence
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class GrossWages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double BANGLADESH_WAGE = 0.15;
        final double CHINA_WAGE = 0.48;
        final double DOMINICAN_WAGE = 1.60;
        final double HAITI_WAGE = 0.55;

        //Variables
        int hours;
        double payRate;

        //Objects
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Gross Wages Calculator!\nThis program calculates your total pay (including overtime pay) after you input your total hours worked and hourly wage.");

        //USER INPUT; GET, SET
        // - Get hours worked
        System.out.print("Please input the number of hours worked:");
        hours = input.nextInt();
        // - Get payRate
        System.out.print("Please input your hourly wage:");
        payRate = input.nextInt();

        //Create instances and print to user
        // - Print out Bangladesh's results
        System.out.println("In Bangladesh, you would earn " + money.format(hourlyWage(hours, BANGLADESH_WAGE, false)) + " after working " + hours + " hours.");
        // - Print out China's results
        System.out.println("In China, you would earn " + money.format(hourlyWage(hours, CHINA_WAGE, false)) + " after working " + hours + " hours.");
        // - Print out Dominican Republic's results
        System.out.println("In Dominican Republic, you would earn " + money.format(hourlyWage(hours, DOMINICAN_WAGE, false)) + " after working " + hours + " hours.");
        // - Print out Haiti's results
        System.out.println("In Haiti, you would earn " + money.format(hourlyWage(hours, HAITI_WAGE, false)) + " after working " + hours + " hours.");
        // - Print out Canada's wages
        System.out.println("In Canada, you would earn " + money.format(hourlyWage(hours, payRate, true)) + " after working " + hours + " hours at an hourly rate of " + money.format(payRate));
    }

    public static double hourlyWage(int hours, double payRate, boolean hasOvertimePay) {
        //Variables
        double pay;
        int overtimeHours = hours - 40;
        double overtimeRate = payRate * 1.5;

        if (hasOvertimePay) {
            if (hours > 40) {
                pay = (payRate * 40) + (overtimeRate * overtimeHours);
            } else {
                pay = payRate * hours;
            }
        } else {
            pay = payRate * hours;
        }

        return pay;
    }

}
