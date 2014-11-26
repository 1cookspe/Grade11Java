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

        //Objects
        Scanner sortInput = new Scanner(System.in);



        //USER INPUT; GET, SET
        while (choice <= 0 || choice > 6) {
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

        do {
            System.out.println("Press A to sort from Lowest to Highest.");
            System.out.println("Press B to sort from Highest to Lowest.");
            System.out.print("Your Choice: ");
            characterChoice = sortInput.next();
            characterChoice = characterChoice.toUpperCase();
        } while (!characterChoice.equals("A") && !characterChoice.equals("B"));

        switch (choice) {
            case 1:
                if (characterChoice.equalsIgnoreCase( "A") ) {
                    indicies = ArrayUtil.selectionSortAscendingTable(goals);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(goals);
                }
            case 2:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingTable(assists);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(assists);
                }
            case 3:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingTable(points);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingTable(points);
                }
            case 4:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortAscendingDoubleTable(shootingPercentage);
                } else {
                    indicies = ArrayUtil.selectionSortDescendingDouble(shootingPercentage);
                }
            case 5:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortStringsAscending(playersNames);
                } else {
                    indicies = ArrayUtil.selectionSortStringsDescending(playersNames);
                }
            case 6:
                if (characterChoice.equalsIgnoreCase("A")) {
                    indicies = ArrayUtil.selectionSortStringsAscending(playersTeams);
                } else {
                    indicies = ArrayUtil.selectionSortStringsDescending(playersTeams);
                }
            default:
        }
        
        //PRINT ARRAY
        System.out.format("%20s  | %15s  | %5s  | %7s  | %7s  | %15s", "Player Name", "Team", "Goals", "Assists", "Points", "Shooting Percentage (%)");
        for (int i = 0; i < playersNames.length; i++) {
            System.out.format("\n%20s  | %15s  | %5s  | %7s  | %7s  | %15s", playersNames[indicies[i]], playersTeams[indicies[i]], goals[indicies[i]], assists[indicies[i]], points[indicies[i]], shootingPercentage[indicies[i]]);
        }

    }
    
    public static void sortArray(int[] array, int[] secondArray) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(secondArray[array[i]] + " ");
        }
    }


}
