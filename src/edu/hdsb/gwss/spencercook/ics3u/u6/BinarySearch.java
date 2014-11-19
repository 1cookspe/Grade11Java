/* Name: Spencer Cook
 * Date: November 18, 2014
 * Version: v0
 * Description:
 This program uses Binary Search to search for a value within an array
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] values = new int[10];
        int randomNumber = 0;
        int randomValue = -1;
        
        //Objects
        Scanner input = new Scanner(System.in);

        //Create for loop to generate 10 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }

        //Print out original array
        System.out.print("The original array is ");
        ArrayUtil.printArray(values);

        //Print out sorted array
        ArrayUtil.selectionSortAscending(values);
        System.out.print("\nThe array sorted with Selection Sort is ");
        ArrayUtil.printArray(values);
        
        ArrayUtil.performBinarySearch(values);
        
    }

}
