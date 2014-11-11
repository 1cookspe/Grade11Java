/* Name: Spencer Cook
 * Date: November 4, 2014
 * Version: v0
 * Description:
 This program calculates the wages of a worker, based on hourly pay, hours worked, and overtime pay
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        //Print results
        System.out.println("You earned " + money.format(calculateHourlyWage(hours, payRate)) + " at an hourly rate of " + money.format(payRate) + " after working " + hours + " hours.");
    }
    
    public static double calculateHourlyWage(int hours, double payRate) {
        //Variables
        double pay;
        int overtimeHours = hours - 40;
        double overtimeRate = payRate * 1.5;
        
        //- Check if user gets overtime pay
        // - If not, print out pay by multiplying the hours by the hourly wage
        if (hours > 40) {
            pay = (payRate * 40) + (overtimeRate * overtimeHours);
        } else {
            pay = payRate * hours;
        }
        
        //Return pay to print out results in main method
        return pay;
    }
    
    
}
