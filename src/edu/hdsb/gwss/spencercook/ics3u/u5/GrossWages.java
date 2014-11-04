/* Name: Spencer Cook
 * Date: November 4, 2014
 * Version: v0
 * Description:
 This program calculates the wages of a worker, based on hourly pay, hours worked, and overtime pay
 */
package edu.hdsb.gwss.spencercook.ics3u.u5;

/**
 *
 * @author 1cookspe
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double hours = 50;
        double payRate = 10;
        double overtimeRate = hours * 1.5;
        
        
    }
    
    public static int hourlyWage(int hours, int payRate) {
        if (hours > 40) {
            overtimePay(hours);
        }
        return 3;
    }
    
    public static int overtimePay(int hours) {
        return 5;
        int overtimeHours;
    }
    
}
