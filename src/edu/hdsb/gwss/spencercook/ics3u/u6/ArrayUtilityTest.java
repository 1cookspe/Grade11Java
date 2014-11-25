/* Name: Spencer Cook
 * Date: November 19, 2014
 * Version: v0
 * Description:
 This program tests the Array Util methods
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

/**
 *
 * @author 1cookspe
 */
public class ArrayUtilityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //Variables
        int[] values = new int[10];
        int randomNumber;

        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length; i++) {
            randomNumber = (int) (Math.random() * 1000) + 1;
            values[i] = randomNumber;
        }

        ArrayUtil.bubbleSortAscending(values);

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i + 1]) {
                System.out.println(values[i] + " < " + values[i + 1] + " PASSED");
            } else {
                System.out.println(values[i] + " < " + values[i + 1] + " FAILED");
            }
        }

        int data[] = {1, 3, 4, 88, -99, 3, -2};
        System.out.println("------------------------------------");
        System.out.println("TEST CASE #1: minimum");
        System.out.println("PRE  CONDITION : an array with a mimimum of -99");
        System.out.println("POST CONDITION : returns a minimum of -99");
        System.out.println("TEST RESULTS   : " + ArrayUtil.getLowestValue(data));

        System.out.println("------------------------------------");
        System.out.println("TEST CASE #2: maximum");
        System.out.println("PRE  CONDITION : an array with a maximum of 88");
        System.out.println("POST CONDITION : returns a maximum of 88");
        System.out.println("TEST RESULTS   : " + ArrayUtil.getHighestValue(data));

        System.out.println("------------------------------------");
        System.out.println("TEST CASE #3: average");
        System.out.println("PRE  CONDITION : an array with an average of -0.2");
        System.out.println("POST CONDITION : returns an average of -0.2");
        System.out.println("TEST RESULTS   : " + ArrayUtil.calculateAverage(data));

        System.out.println("------------------------------------");
        System.out.println("TEST CASE #4: sum");
        System.out.println("PRE  CONDITION : an array with a sum of -2");
        System.out.println("POST CONDITION : returns an average of -2");
        System.out.println("TEST RESULTS   : " + ArrayUtil.calculateSum(data));

        System.out.println("------------------------------------");
        System.out.println("TEST CASE #5: Selection Sort Ascending ");
        System.out.println("PRE  CONDITION : an array at 1 3 4 88 -99 3 -2 ");
        System.out.println("POST CONDITION : returns an array at -99, -2, 1, 3, 3, 4, 88");

        // DISPLAY ARRAY
        System.out.print("DATA BEFORE: ");
        ArrayUtil.printArray(data);

        // SORT DATA
        System.out.print("\nDATA AFTER: ");
        ArrayUtil.selectionSortAscending(data);
        ArrayUtil.printArray(data);

        // CONFIRM; the value at index i must be lest than the value at index i+1
        boolean passedTest = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < data[i + 1]) {
                passedTest = true;
            } else {
                passedTest = false;
                i = data.length + 1;
            }

        }

        System.out.print( "\nTEST CASE #1A RESULTS - passed = " + passedTest );
        
        
    }

    public static void testBinarySearch(int[] data) {

    }

    public static void testMaximum(int[] data) {
        // PRECONDITION

    }

    public static void testMinimum(int[] data) {

    }

    public static void testAverage(int[] data) {

    }

    public static void testBubbleSort(int[] data) {

    }

    public static void testSelectionSort(int[] data) {

    }

    public static void testLinearSearch(int[] data) {

    }

}
