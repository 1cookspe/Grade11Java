/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
 This program converts hours into days
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class DaysToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        int hours = 64;
        int days;
        int remainingHours;
        
        //Calculate days in hours
        days = hours / 24;
        remainingHours = hours - (days * 24);
        
        //Print result to user
        System.out.format("%-12s | %5s | %6s", "Total Hours", "Days", "Hours");
        System.out.format("\n%-12s | %5s | %4s", "" + hours, "" + days, "" + remainingHours);
        System.out.print("\n");
    }
    
}
