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
        String time;
        int decision;
        
        //Objects
        Scanner input = new Scanner(System.in);
        
        //Introduce program
        System.out.println("Welcome to the Time Converter!");
        System.out.println("Convert from standard time (13:12) to traditional time (1:12 PM), or vice versa!");
        
        //USER INPUT; GET, SET
        System.out.print("Please input your time:");
        time = input.nextLine();
        time = time.trim();
        
        char hello = time.charAt(time.length() - 1);
        if (hello == 'M') {
            convertToTraditionalTime(time);
        } else {
            convertToStandardTime(time);
        }
        
        //Check what user has selected
//        switch (decision) {
//            case 1:
//                convertToTraditionalTime(time);
//                System.out.println("Go");
//            case 2:
//                convertToStandardTime(time);
//            default:
//                System.out.println("Please input either 1 or 2.");
//        }
    }
    
    public static void convertToTraditionalTime(String time) {
        //Variables
        String hourString;
        String minuteString;
        int hour;
        char morningOrAfternoon;
        String standardTime = "";
        
        if (time.length() == 6) {
            hourString = time.substring(0, 1);
            minuteString = time.substring(2,4);
            System.out.println(hourString);
            System.out.println(minuteString);
        } else {
            hourString = time.substring(0,2);
            minuteString = time.substring(3,5);
            System.out.println(hourString);
            System.out.println(minuteString);
        }
        hour = Integer.parseInt(hourString);
        morningOrAfternoon = time.charAt(time.length()-2);
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
                standardTime = "" + hour + "" + 12;
            }
        }
        standardTime = standardTime + ":" + minuteString;
        System.out.println("fianl time!!!     " + standardTime);
    }
    
    public static void convertToStandardTime(String time) {
        //System.out.println("Convert to stand");
    }
    
}
