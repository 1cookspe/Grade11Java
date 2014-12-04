/* Name: Spencer Cook
 * Date: December 2, 2014
 * Version: v0
 * Description:
 This program sorts a table of values from a file and prints it to the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1cookspe
 */
public class TableSortFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Variables
        String inputString = "";
        int numberOfValues = 0;
        int choice = 0;
        String characterChoice = "z";
        String sortBy = "";
        String yOrN = "";

        //Objects 
        File file = new File("NHL_Stats.txt");
        Scanner input = new Scanner(file);
        StringTokenizer stringTokenizer;
        Scanner sortInput = new Scanner(System.in);

        //Use while loop to get number of values from file
        while (input.hasNextLine()) {
            numberOfValues++;
            input.nextLine();
        }

        System.out.println(numberOfValues);

        //Create and initialize arrays
        String[] teamsNames = new String[numberOfValues];
        String[] playersNames = new String[numberOfValues];
        int[] goals = new int[numberOfValues];
        int[] assists = new int[numberOfValues];
        int[] points = new int[numberOfValues];
        double[] shootingPercentage = new double[numberOfValues];
        int[] indicies = ArrayUtil.generateIndicesArray(goals.length);

        input = new Scanner(file);
        int recordNumber = 0;
        while (input.hasNextLine()) {
            stringTokenizer = new StringTokenizer(input.nextLine(), ",");
            if (stringTokenizer.hasMoreTokens() && recordNumber < numberOfValues) {
                playersNames[recordNumber] = stringTokenizer.nextToken();
                teamsNames[recordNumber] = stringTokenizer.nextToken();
                goals[recordNumber] = Integer.parseInt(stringTokenizer.nextToken());
                assists[recordNumber] = Integer.parseInt(stringTokenizer.nextToken());
                points[recordNumber] = Integer.parseInt(stringTokenizer.nextToken());
                shootingPercentage[recordNumber] = Double.parseDouble(stringTokenizer.nextToken());
            }
            recordNumber++;
        }

        //Use do loop to allow user to sort new data everytime
        do {
            choice = 0;

            System.out.println("Welcome to the NHL Stats Sorter! Results as of November 24, 2014!");

//        //Print original stats to user
            printChart(playersNames, teamsNames, goals, assists, points, shootingPercentage, indicies);

        //USER INPUT; GET, SET
            //  - Ask user what they want to sort by
            // - Use while loop to ensure that user inputs valid information
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
                //Use if statement inside of switch statement to see if user wants descending or ascending
                case 1:
                    if (characterChoice.equalsIgnoreCase("A")) {
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
                        indicies = ArrayUtil.selectionSortStringsAscending(teamsNames);
                    } else {
                        indicies = ArrayUtil.selectionSortStringsDescending(teamsNames);
                    }
                    break;
                default:
                    break;
            }

            //Print chart to user
            printChart(playersNames, teamsNames, goals, assists, points, shootingPercentage, indicies);

//        for (int i = 0; i < goals.length; i++) {
////            String previousData = "";
////            String newData = "";
////            newData = "\n" + playersNames[indicies[i]] + "," + teamsNames[indicies[i]] + "," + goals[indicies[i]] + "," + assists[indicies[i]] + "," + points[indicies[i]] + "," + shootingPercentage[indicies[i]];
////            output.write(previousData + newData);
////            previousData = newData;
//        }
            //output.close();
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
