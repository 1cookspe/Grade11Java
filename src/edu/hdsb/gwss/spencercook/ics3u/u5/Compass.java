/* Name: Spencer Cook
 * Date: October 28, 2014
 * Version: v0
 * Description:
 This program gives users directions based on the compass values that are given
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String compass = new String("S45W");
        char northOrSouth;
        String degrees;
        int numberOfDegrees;
        char eastOrWest;
        String startDirection = "";
        String faceDirection = "";
        String degreesTurned = "";
        boolean invalidData = false;
        
        // Objects
        Scanner input = new Scanner(System.in);
        
        //Introduce program
        System.out.println("Welcome to the Compass Direction Calculator!");
        System.out.println("Compass directions are written like this: S45W. North (N) or South (S) comes first, followed by the angle relative to North or South (eg. 45), followed by the direction facing West (W) or East (E).");
        
        //USER INPUT; GET, SET
        // - Get directions
        System.out.print("Please input the directions using the above instructions:");
        compass = input.nextLine();
        compass = compass.toUpperCase();
        
        //CALCULATIONS
        // - Get north or south
        northOrSouth = compass.charAt(0);
        switch (northOrSouth) {
            case 'N':
                startDirection = "Start facing North. ";
                break;
            case 'S':
                startDirection = "Start facing South. ";
                break;
            default:
                invalidData = true;
        }  
        
        // - Get degrees
        if (compass.length() == 3) {
        degrees = compass.substring(1, 2);
        } else {
            degrees = compass.substring(1, 3);
        }
        
        numberOfDegrees = Integer.parseInt(degrees);
        if (numberOfDegrees < 90) {
            degreesTurned = "Turn " + degrees + " toward the";
        } else {    
            invalidData = true;
        }    
        
        // - Get east or west
        eastOrWest = compass.charAt(3);
        switch (eastOrWest) {
            case 'E':
                faceDirection = " towards the East.";
                break;
            case 'W':
                faceDirection = " towards the West.";
                break;
            default:
                invalidData = true;
        } 
        
        // - Check if input is valid
        if (invalidData) {
            System.out.println("Please input the directions like the above example. Do not input any angles above 90 degrees.");
        } else {   
            System.out.println(startDirection + degreesTurned + faceDirection);
        }    
    }
    
}
