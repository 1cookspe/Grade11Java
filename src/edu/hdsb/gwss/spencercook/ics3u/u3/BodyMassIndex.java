/* Name: Spencer Cook
 * Date: October 8, 2014
 * Version: v0
 * Description:
 This program asks the user to enter their weight and height in either imperial or metric form and then calculates their Body Mass Index (BMI). 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double STARVATION = 15;
        final double UNDERWEIGHT = 18.6;
        final double IDEAL = 25;
        final double OVERWEIGHT = 30;
        final double OBESE = 30;

        // Variables
        double weight;
        double height;
        double bodyMassIndex = -1;
        int typeOfSystem;
        boolean doNotCalculateBMI = false;

        // Objects
        Scanner bmiInput = new Scanner(System.in);

        //USER INPUT; GET, SET
        //Introduce program
        System.out.println("Welcome to the Body Mass (BMI) Calculator!");
        System.out.println("BMI is the measure of the weight of a person in relation to their height. There are six categories you may fall under: starvation, underweight, ideal, overweight, obese, or morbidly obese.");
        //Get type of measuring system user wants to use
        System.out.println("Choose type of measuring system");
        System.out.format("%-10s %6s", "Type \"1\" for:", "Imperial\n");
        System.out.format("%-10s %7s", "Type \"2\" for:", "Metric\n");
        typeOfSystem = bmiInput.nextInt();

        // SWITCH STATEMENT
        // - If user pressed 1, they use the imperial system
        // - If user pressed 2, they use the metric system
        switch (typeOfSystem) {
            case 1:
                //Get weight
                System.out.print("Please enter your weight in pounds: ");
                weight = bmiInput.nextDouble();
                //Get height
                System.out.print("Please enter your height in inches: ");
                height = bmiInput.nextDouble();

                if (height <= 0 || weight <= 0) {
                    System.out.println("Please input a height or weight above zero.");
                    doNotCalculateBMI = true;
                } else {
                    //CALCULATIONS
                    // - Find BMI by using the formula
                    bodyMassIndex = (weight * 703) / (height * height);
                }
                break;
            case 2:
                //Get weight
                System.out.print("Please enter your weight in kilograms: ");
                weight = bmiInput.nextDouble();
                //Get height
                System.out.print("Please enter your height in meters: ");
                height = bmiInput.nextDouble();

                if (height <= 0 || weight <= 0) {
                    System.out.println("Please input a height or weight above zero.");
                    doNotCalculateBMI = true;
                } else {
                    //CALCULATIONS
                    // - Find BMI by using the formula
                    bodyMassIndex = weight / (height * height);
                }
                break;
            default:
                System.out.println("You did not input valid information.");
                doNotCalculateBMI = true;
                break;
        }

        //IF STATEMENT
        // - Check to see which category the user falls into
        if (doNotCalculateBMI) {
            System.out.println("Your BMI cannot be calculated with invalid information.");
        } else if (bodyMassIndex < STARVATION) {
            System.out.println("Your BMI of " + Math.round(bodyMassIndex) + " puts you in the Starvation category. This is extremely unhealthy, so be sure to eat more foods and see a doctor if neccesary to ensure a healthy BMI.");
        } else if (bodyMassIndex < UNDERWEIGHT) {
            System.out.println("Your BMI of " + Math.round(bodyMassIndex) + " puts you in the Underweight category. Be sure to eat more foods to ensure a healthy BMI. You're almost at the ideal BMI!");
        } else if (bodyMassIndex < IDEAL) {
            System.out.println("Congratulations! Your BMI of " + Math.round(bodyMassIndex) + " puts you in the Ideal BMI category. Keep on eating healthy and exercising!");
        } else if (bodyMassIndex < OVERWEIGHT) {
            System.out.println("Your BMI of " + Math.round(bodyMassIndex) + "puts you in the Overweight category. Be sure to exercise more and eat more hearty foods to lose more weight. You're almost at an ideal BMI!");
        } else if (bodyMassIndex < OBESE) {
            System.out.println("Your BMI of " + Math.round(bodyMassIndex) + "puts you in the Obese category. Be sure to exercise more and eat healthy foods to try to lose weight and work your BMI down.");
        } else {
            System.out.println("Your BMI of " + Math.round(bodyMassIndex) + " makes you morbidly obese. This is extremely unhealthy, so be sure to see a doctor and exercise excessively.");
        }
        System.out.println("Thank you for using the BMI calculator!");
    }

}
