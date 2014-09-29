/*
 * Name: Spencer Cook
 * Date: September 23, 2012
 * Version: v0
 * Description: 
 *      This program examines the variable and prints it out
 */ 
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;
import static javax.management.Query.value;

/**
 *
 * @author 1cookspe
 */
public class Shortfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int value1;
        int value2;
        
        //Objects
        Scanner one = new Scanner(System.in);
        
        System.out.print("Insert Input 1: ");
        value1 = one.nextInt();
        System.out.print(value1);
        
        System.out.print("\nInsert Input 2: ");
        value2 = one.nextInt();
        System.out.print(value2);
        System.out.print("\n");
    
        //Print the value
        //System.out.println("A short: " +  value);2
    //35000 is too big for a short value
    //Int, however, is able to store the 35000 value
    }
    
}
