/* Name: Spencer Cook
 * Date: October 30, 2014
 * Version: v0
 * Description:
 This program calculates the velocity of an object using methods
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author spencercook
 */
public class Velocity {

    // Variables

    static double velocity;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double displacement = 0;
        double time = 0;
        boolean invalid = true;

        //Objects
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Velocity Calculator!");
        System.out.println("Velocity is the displacement of an object over its time of travel.");

        //USER INPUT; GET, SET
        // - Get displacement
        while (invalid == true) {
            System.out.print("Please input the displacement of the object (in meters):");
            displacement = input.nextDouble();
            // - Get velocity
            System.out.print("Please input the time of travel of the object (in meters):");
            time = input.nextDouble();
            if (time >= 0) {
                invalid = false;
            }
        }

        //Calculate velocity by calling velocity method, with the inputted values from the user
        calculateVelocity(displacement, time);
       
    }

    public static void calculateVelocity(double displacement, double time) {
        //Calculate velocity, and print results to user
        velocity = displacement / time;
        System.out.println("∆d = " + displacement + "m");
        System.out.println("∆t = " + time + "s");
        System.out.println("∆v = " + velocity + "m/s");
        System.out.println("Thank you for using the Velocity Calculator!");
    }
    

}
