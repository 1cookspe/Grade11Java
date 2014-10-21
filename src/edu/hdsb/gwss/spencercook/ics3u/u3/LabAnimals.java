/* Name: Spencer Cook
 * Date: October 18, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out population of animals in a lab based on the initial population, food supply, and food supplied each hour.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int population = 0;
        int foodSupply = 0;
        int foodAdded = 0;
        int foodAtEnd;
        int endPopulation;
        int hours = 1;

        //Objects
        Scanner input = new Scanner(System.in);

        //USER-INPUT; GET, SET
        // - Get initial population
        // - If user inputs invalid number, use loop to ask them for the value again
        while (population <= 0) {
            System.out.print("What is the intital population of the lab animals? ");
            population = input.nextInt();
        }
        // - Get initial food supply
        // - If user inputs invalid number, use loop to ask them for the value again
        while (foodSupply <= 0) {
            System.out.print("What is the intital food supply for the lab animals? ");
            foodSupply = input.nextInt();
        }
        // - Get food added hourly
        // - If user inputs invalid number, use loop to ask them for the value again
        while (foodAdded <= 0) {
            System.out.print("How much food will you add each hour? ");
            foodAdded = input.nextInt();
        }

        //CALCULATIONS
        // - Check to see if user inputted valid info
        // - Use for loop until population is greater than food supply
            if (foodSupply > population) {
                //PRINT TO USER
                System.out.format("\n%-5s%20s%20s%20s%20s", "Hour", "Animals At Start", "Food At Start", "Food At End", "Animals At End");
                //FOR LOOP
                for (; foodSupply > population; hours++) {
                    endPopulation = population * 2;
                    foodAtEnd = (foodSupply + foodAdded) - population;
                    System.out.format("\n%-5s%20s%20s%20s%20s", "" + hours, "" + population, "" + foodSupply, "" + foodAtEnd, "" + endPopulation);
                    population = endPopulation;
                    foodSupply = foodAtEnd;
                }
                System.out.println("\nThe population will outgrow the food supply after " + hours + " hours.");
            } else {
                System.out.println("\nThe food supply is less than the population, therefore it cannot survive.");
            }
    }

}
