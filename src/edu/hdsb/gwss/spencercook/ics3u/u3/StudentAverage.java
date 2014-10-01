/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program calculates the average a student based on their four courses
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author 1cookspe
 */
public class StudentAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        
        // Variables
        String name;
        String firstSubject;
        String secondSubject;
        String thirdSubject;
        String fourthSubject;
        double firstMark;
        double secondMark;
        double thirdMark;
        double fourthMark;
        double average;
        
        // Objects
        Scanner markInput = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        /*Get user-input*/
        System.out.println("Welcome to the MarkBook!");
        
        //Ask for name
        System.out.print("What is the student's name? ");
        name = markInput.next();
        
        //Ask for firstSubject and obtain mark
        System.out.print("What is " + name + "'s" + " first subject? ");
        firstSubject = markInput.nextLine();
        System.out.print("What mark did " + name + " earn in " + firstSubject + "? ");
        firstMark = markInput.nextDouble();
        
        //Ask for secondSubject and obtain mark
        System.out.print("What is " + name + "'s" + " second subject? ");
        secondSubject = markInput.nextLine();
        System.out.print("What mark did " + name + " earn in " + secondSubject + "? ");
        secondMark = markInput.nextDouble();
        
        //Ask for thirdSubject and obtain mark
        System.out.print("What is " + name + "'s" + " third subject? ");
        thirdSubject = markInput.nextLine();
        System.out.print("What mark did " + name + " earn in " + thirdSubject + "? ");
        thirdMark = markInput.nextDouble();
        
        //Ask for fourthSubject and obtain mark
        System.out.print("What is " + name + "'s" + " foruth subject? ");
        fourthSubject = markInput.nextLine();
        System.out.print("What mark did " + name + " earn in " + fourthSubject + "? ");
        fourthMark = markInput.nextDouble();
        
        //Calculate average
        average = (firstMark + secondMark + thirdMark + fourthMark) / 2;
        
        //Print results to user
        System.out.println("\nStudent name: " + name);
        System.out.format("%-7s | %-4s", "Subject", "Mark");
        System.out.format("\n%-7s | %-4s", "" + firstSubject, "" + percent.format(firstMark/100));
        System.out.format("\n%-7s | %-4s", "" + secondSubject, "" + percent.format(secondMark/100));
        System.out.format("\n%-7s | %-4s", "" + thirdSubject, "" + percent.format(thirdMark/100));
        System.out.format("\n%-7s | %-4s", "" + fourthSubject, "" + percent.format(fourthMark/100));
        System.out.format("\n%-7s | %-4s", "Average", "" + percent.format(average/100));
    }
    
}
