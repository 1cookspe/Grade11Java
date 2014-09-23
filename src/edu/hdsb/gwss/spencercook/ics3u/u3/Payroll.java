/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long hoursWorked = 42;
        double payRate = 20;
        double taxRate = 0.20;
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("pay Amount  : " + (hoursWorked * payRate));
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate));

        /*
         * Presents error with no initializers because the compiler does not know what to print in the prinln() statements
         * It does not compile with a deleted variable because the compiler now doesn't know what "hoursWorked" means in the println() statements
         * A problem is also detected with no intializers because the compiler needs to know the values to print them
         */
    }

}
