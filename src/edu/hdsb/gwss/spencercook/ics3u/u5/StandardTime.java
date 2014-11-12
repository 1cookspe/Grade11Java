/* Name: Spencer Cook
 * Date: November 3, 2014
 * Version: v0
 * Description:
 This program converts time from standard to traditional, and vice versa
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String time = "";
        char lastCharacter;

        //Objects
        Scanner input = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Time Converter!");
        System.out.println("Convert from standard time (13:12) to traditional time (1:12 PM), or vice versa!");

        //USER INPUT; GET, SET
            System.out.print("Please input your time:");
            time = input.nextLine();
            time = time.trim();
            String firstChar = time.substring(0);

           //Check which type of time the user has inputted
            lastCharacter = time.charAt(time.length() - 1);
            if (lastCharacter == 'M') {
                convertToTraditionalTime(time);
            } else {
                if (time.substring(0, 1).equals("0") || time.substring(0,1).equals("1") || time.substring(0, 1).equals("2")) {
                    convertToStandardTime(time);
                } else {
                    System.out.println("Please input a valid time like follows: 9:38AM (Traditional Time) or 09:38 (Standard Time).");
                }
            }
            System.out.println("Thank you for using the Time Converter!");
    }

    public static void convertToTraditionalTime(String time) {
        //Variables
        String hourString;
        String minuteString;
        int hour;
        char morningOrAfternoon;
        String standardTime = "";

        //Check how many digits have been inputted
        if (time.length() == 6) {
            hourString = time.substring(0, 1);
            minuteString = time.substring(2, 4);
        } else {
            hourString = time.substring(0, 2);
            minuteString = time.substring(3, 5);
        }
        
        //Find whether it is AM or PM
        morningOrAfternoon = time.charAt(time.length() - 2);
        if (morningOrAfternoon == 'A') {
            if (hourString.equals("12")) {
                standardTime = "0";
            } else {
                standardTime = "0" + hourString;
            }

        } else if (morningOrAfternoon == 'P') {
            if (hourString.equals("12")) {
                standardTime = hourString;
            } else {
                hour = Integer.parseInt(hourString);
                hour = hour + 12;
                standardTime = "" + hour;
            }
        }
        
        //Print out time
        standardTime = standardTime + ":" + minuteString;
        System.out.println(time + " in Traditional Time is " + standardTime);
    }

    public static void convertToStandardTime(String time) {
        //Variables
        String hourString;
        String minuteString;
        String standardTime;
        int hours;
        int standardHours;
        String amOrPm = "AM";

        //Divide into hours and minutes
        hourString = time.substring(0, 2);
        hours = Integer.parseInt(hourString);
        minuteString = time.substring(3, 5);

        //Find hour conversion
        if (hours > 12) {
            standardHours = hours - 12;
            amOrPm = "PM";
        } else if (hours == 0) {
            standardHours = 0;
        } else {
            standardHours = Integer.parseInt(hourString.substring(1));
        }
        
        //Print out time
        standardTime = "" + standardHours + ":" + "" + minuteString + amOrPm;
        System.out.println(time + " in Standard Time is " + standardTime);
    }

}
