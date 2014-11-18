/* Name: Spencer Cook
 * Date: November 18, 2014
 * Version: v0
 * Description:
 This program uses Binary Search to search for a value within an array
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

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

        //Create for loop to generate 10 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }

        //Print out original array
        System.out.print("The original array is ");
        ArrayUtil.printArray(values);

        //Print out sorted array
        ArrayUtil.selectionSort(values);
        System.out.print("\nThe array sorted with Selection Sort is ");
        ArrayUtil.printArray(values);

        //Use binary search to search for a specific value
//        int randomValue;
//        randomValue = (int) (Math.random() * 1000) + 1);
        if (ArrayUtil.binarySearch(values, 100) > 0) {
            System.out.println("\n" + "The data is found at the index " + ArrayUtil.binarySearch(values, 66) + " in the array.");
        } else {
            System.out.println("\nData not found in the array.");
        }
    }

}
