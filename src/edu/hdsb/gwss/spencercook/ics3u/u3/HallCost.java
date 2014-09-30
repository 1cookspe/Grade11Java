/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the cost of renting a dining hall based on the number of guests
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 1cookspe
 */
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constants
        final double HALL_RENTAL = 350.00;
        final double HST = 1.13;
        
        //Variables
        String name;
        int numberOfGuests;
        double costPerGuest;
        double totalCost;
        
        //Objects
        Scanner hallInput = new Scanner(System.in);
        NumberFormat cost = NumberFormat.getCurrencyInstance();
        
        //User input
        System.out.println("Welcome to the Banquet Hall!");
        
        //Get name
        System.out.print("What is your name? ");
        name = hallInput.next();
        
        //Get number of guests
        System.out.print("How many guests will you be having? ");
        numberOfGuests = hallInput.nextInt();
        
        //Get cost of each guest
        System.out.print("How much will it cost for the meals for each person? ");
        costPerGuest = hallInput.nextDouble();
        
        totalCost = (numberOfGuests * costPerGuest * HST) + HALL_RENTAL;

        System.out.println("For " + numberOfGuests + " people it will cost " +  cost.format(totalCost));
    }
    
}
