/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class CellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        // Variables
        int daytimeMinutes;
        int eveningMinutes;
        int weekendMinutes;
        double planACost;
        double planBCost;
        int newDaytimeMinutes;
        
        // Objects
        Scanner cellMinutes = new Scanner(System.in);
        NumberFormat planDollars = NumberFormat.getCurrencyInstance();
        
        /* USER-INPUT */
        System.out.println("Welcome to Rogers Wireless!");
        //Get number of daytime minutes
        System.out.print("How many daytime minutes do you use? ");
        daytimeMinutes = cellMinutes.nextInt();
        //Get number of evening minutes
        System.out.print("How many evening minutes do you use? ");
        eveningMinutes = cellMinutes.nextInt();
        //Get weekend minutes
        System.out.print("How many weekend minutes do you use? ");
        weekendMinutes = cellMinutes.nextInt();
        
        /*CALCULATE COST OF PLAN A*/
        //Check if user exceeds the monthly free limit of 100 minutes, then calculate daytime cost
        newDaytimeMinutes = daytimeMinutes - 100;
//        newDaytimeMinutes = Math.abs(newDaytimeMinutes);
        planACost = 25 * newDaytimeMinutes;
        if (daytimeMinutes < 100) {
            planACost = 0;
        }
        //Calculate eveningCost
        planACost = planACost + (eveningMinutes * 15);
        //Calculate weekendCost
        planACost = planACost + (weekendMinutes * 20);
        //Convert to dollars 
        planACost = planACost / 100;
        
        /*CALCULATE COST OF PLAN B*/
        //Calculate daytime cost, first by checking if the usage is above the free limit of 250
        newDaytimeMinutes = 0;
        newDaytimeMinutes = daytimeMinutes - 250;
        planBCost = 45 * (newDaytimeMinutes);
        if (daytimeMinutes < 250) {
            planBCost = 0;
        }
        //Calculate evening cost
        planBCost = planBCost + (eveningMinutes * 35);
        //Calculate weekendCost
        planBCost = planBCost + (weekendMinutes * 25);
        //Convert to dollars
        planBCost = planBCost / 100;
        
        //Print to user
        System.out.format("\n%30s", "Rogers Wireless");
        System.out.format("\n%-5s %16s %16s %16s %8s", "Plan", "Daytime Minutes", "Evening Minutes", "Weekend Minutes", "Cost");
        System.out.format("\n%-5s %14s %14s %14s %14s", "Plan A", "" + daytimeMinutes, "" + eveningMinutes, "" + weekendMinutes, "" + planDollars.format(planACost));
        System.out.format("\n%-5s %14s %14s %14s %14s", "Plan B", "" + daytimeMinutes, "" + eveningMinutes, "" + weekendMinutes, "" + planDollars.format(planBCost));
        
        //Check to see which plan is cheaper
        if (planACost > planBCost) {
        System.out.println("\nChoose plan B. It is cheaper for your needs.");
        } else {
            System.out.println("\nChoose plan A. It is cheaper for your needs.");
        }
        System.out.println("Thank you for choosing Rogers Wireless!");
    }
    
}
