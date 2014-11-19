/* Name: Spencer Cook
 * Date: November 11, 2014
 * Version: v0
 * Description:
 This program uses Bubble Sort to sort an array of 10 random integers with values between 1 and 1000
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int[] values = new int[10];
        int randomNumber = 0;
        int searchValue = -1;

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }
        System.out.print("The unsorted array is ");
        ArrayUtil.printArray(values);
        
        ArrayUtil.performLinearSearch(values);

        ArrayUtil.bubbleSortAscending(values);
        System.out.print("\nThe array from lowest to highest is: ");
        ArrayUtil.printArray(values);
        ArrayUtil.performLinearSearch(values);
        
        ArrayUtil.bubbleSortDescending(values);
        System.out.print("\nThe array from highest to lowest is: ");
        ArrayUtil.printArray(values);
        ArrayUtil.performLinearSearch(values);
        
    }

}
