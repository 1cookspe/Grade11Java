/* Name: Spencer Cook
 * Date: November 15, 2014
 * Version: v0
 * Description:
 This program uses Selection Sort to sort an array of 10 random integers with values between 1 and 1000
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

/**
 *
 * @author 1cookspe
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int[] values = new int[10];
        int randomNumber = 0;

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }
        
        //Print out original array
        System.out.print("The original array is ");
        ArrayUtil.printArray(values);
        
        ArrayUtil.performLinearSearch(values);
        
        //Print out sorted array
        ArrayUtil.selectionSort(values);
        System.out.print("\nThe array sorted with Selection Sort is ");
        ArrayUtil.printArray(values);
        
        ArrayUtil.performLinearSearch(values);
    }
    
}
