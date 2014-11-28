/* Name: Spencer Cook
 * Date: November 19, 2014
 * Version: v0
 * Description:
 This program sorts a table of values and prints it to the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class TableSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables      
        String[] playersNames = {"Jakub Voracek", "Tyler Seguin", "Sidney Crosby", "Steven Stamkos", "Claude Giroux", "Vladimir Tarasenko", "Phil Kessel", "Patric Hornqvist", "Evgeni Malkin", "Ryan Johansen"};
        String[] playersTeams = {"Flyers", "Stars", "Penguins", "Lightning", "Flyers", "Blues", "Maple Leafs", "Penguins", "Penguins", "Blue Jackets"};
        int[] goals = {7, 15, 8, 14, 6, 12, 11, 10, 8, 7};
        int[] assists = {22, 11, 18, 10, 18, 11, 12, 13, 15, 16};
        int[] points = {29, 26, 26, 24, 24, 23, 23, 23, 23, 23};
        double[] shootingPercentage = {10.6, 18.8, 13.6, 18.2, 6.7, 15.0, 15.1, 14.1, 15.7, 13.7};
        int[] indicies = ArrayUtil.generateIndicesArray( goals.length );
        int choice = 0;
        String characterChoice = "z";
        String sortBy = "";
        String yOrN = "";

        //Objects
        Scanner sortInput = new Scanner(System.in);

        //Create do while loop so that user can constantly sort new data
        do {
        choice = 0;
        
        System.out.println("Welcome to the NHL Stats Sorter! Results as of November 24, 2014!");
        
        //Print original stats to user
        printChart(playersNames, playersTeams, goals, assists, points, shootingPercentage, indicies);        
        
        //USER INPUT; GET, SET
        //  - Ask user what they want to sort by
        // - Use while loop to ensure that user inputs valid information
        while (choice <= 0 || choice > 6) {
            System.out.println("Hello!");
            for (int i = 1; i < 7; i++) {
                switch (i) {
                    case 1:
                        sortBy = "Goals";
                        break;
                    case 2:
                        sortBy = "Assists";
                        break;
                    case 3:
                        sortBy = "Points";
                        break;
                    case 4:
                        sortBy = "Shooting Percentages";
                        break;
                    case 5:
                        sortBy = "Player Names";
                        break;
                    case 6:
                        sortBy = "Team Names";
                }
                System.out.format("\n%15s %15s", "Press " + i + " to Sort By: ", sortBy);

            }
            System.out.print("\nYour Choice: ");
            choice = sortInput.nextInt();
        }

        //Use do while loop to ensure that user inputs valid information
        do {
            System.out.println("Press A to sort from Lowest to Highest.");
            System.out.println("Press B to sort from Highest to Lowest.");
            System.out.print("Your Choice: ");
            characterChoice = sortInput.next();
            characterChoice = characterChoice.toUpperCase();
        } while (!characterChoice.equals("A") && !characterChoice.equals("B"));

        //Switch on choice to see if user wants an ascending or descending list
        switch (choice) {
            case 1:
                if (characterChoice.equalsIgnoreCase( "A") ) {
                    indicies = ArrayUtil.selectionSortAscendingTable(goals);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(goals);
                }
            break;
            case 2:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingTable(assists);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(assists);
                }
            break;
            case 3:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingTable(points);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(points);
                }
            break;
            case 4:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingDoubleTable(shootingPercentage);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingDoubleTable(shootingPercentage);
                }
            break;
            case 5:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortStringsAscending(playersNames);
                } else {
                    indicies = ArrayUtil.selectionSortStringsDescending(playersNames);
                }
            break;
            case 6:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortStringsAscending(playersTeams);
                } else {
                    indicies = ArrayUtil.selectionSortStringsDescending(playersTeams);
                }
            break;
            default:
                break;
        }
        
        //Print chart to user
        printChart(playersNames, playersTeams, goals, assists, points, shootingPercentage, indicies);
        
        //Create do loop to ask if user wants to sort more data
        do {
           System.out.println("\nWould you like to sort new data? (Y/N)"); 
           yOrN = sortInput.next();
        } while (!yOrN.equalsIgnoreCase("Y") && !yOrN.equalsIgnoreCase("N"));
        
        } while (!yOrN.equals("N"));
        System.out.println("Thank you for using the NHL Stats Sorter!");

    }
    
    public static void printChart(String[] playersNames, String[] playersTeams, int[] goals, int[] assists, int[] points, double[] shootingPercentage, int[] indicies) {
        //PRINT ARRAY
        System.out.format("\n%20s  | %15s  | %5s  | %7s  | %7s  | %15s", "Player Name", "Team", "Goals", "Assists", "Points", "Shooting Percentage (%)");
        for (int i = 0; i < playersNames.length; i++) {
            System.out.format("\n%20s  | %15s  | %5s  | %7s  | %7s  | %15s", playersNames[indicies[i]], playersTeams[indicies[i]], goals[indicies[i]], assists[indicies[i]], points[indicies[i]], shootingPercentage[indicies[i]]);
        }
    }
    


}
