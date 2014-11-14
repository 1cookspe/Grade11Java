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
        //Variables
        int randomNumber = 0;

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length - 3; i++) {
            randomNumber = (int) (Math.random() * 9) + 1;
            System.out.println(randomNumber);
            values[i] = randomNumber;
        }
        System.out.println(values);
    }

    public static int[] generateRandomArray(int[] values) {
        //Variables
        int randomNumber = 0;

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length - 2; i++) {
            randomNumber = (int) (Math.random() * 10) + 1;
            System.out.println(randomNumber);
            values[i] = randomNumber;
        }
        //System.out.println(values);

        return ArrayUtil.bubbleSort(values);
    }

}
