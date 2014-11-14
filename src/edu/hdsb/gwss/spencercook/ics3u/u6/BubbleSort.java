/* Name: Spencer Cook
 * Date: November 11, 2014
 * Version: v0
 * Description:
 This program uses Bubble Sort to sort an array of 10 random integers with values between 1 and 10
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

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

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }
        System.out.print("The unsorted array is ");
        ArrayUtil.printArray(values);

        ArrayUtil.bubbleSort(values);
        System.out.print("\nThe Bubble Sorted array is ");
        ArrayUtil.printArray(values);
    }

}
