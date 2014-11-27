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

        
        testBubbleSortAscending();
        testBubbleSortDescending();
        testSelectionSortDescending();
        testSelectionSortAscending();
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

    public static void testBubbleSortAscending() {
        //Variables
        int randomNumber;
        int data[] = {1, 3, 4, 88, -99, 3, -2};
        
        System.out.println("\n------------------------------------");
        System.out.println("TEST CASE #5: Bubble Sort Ascending");
        System.out.println("PRE  CONDITION : an array with a sum of -2");
        System.out.println("POST CONDITION : returns an ordered array");
        System.out.println("TEST RESULTS   : ");
        
        ArrayUtil.bubbleSortAscending(data);

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] <= data[i + 1]) {
                System.out.println(data[i] + " < " + data[i + 1] + " PASSED");
            } else {
                System.out.println(data[i] + " < " + data[i + 1] + " FAILED");
            }
        }
    }
    
    public static void testBubbleSortDescending() {
        //Variables
        int randomNumber;
        int data[] = {1, 3, 4, 88, -99, 3, -2};
        
        System.out.println("\n------------------------------------");
        System.out.println("TEST CASE #6: Bubble Sort Descending");
        System.out.println("PRE  CONDITION : an array of 1, 3, 4, 88, -99, 3, -2");
        System.out.println("POST CONDITION : returns an ordered array");
        System.out.println("TEST RESULTS   : ");
        
        ArrayUtil.bubbleSortDescending(data);

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] >= data[i + 1]) {
                System.out.println(data[i] + " < " + data[i + 1] + " PASSED");
            } else {
                System.out.println(data[i] + " < " + data[i + 1] + " FAILED");
            }
        }
    }

    public static void testSelectionSortDescending() {
        int data[] = {1, 3, 4, 88, -99, 3, -2};
        
        System.out.println("\n------------------------------------");
        System.out.println("TEST CASE #7: Selection Sort Descending");
        System.out.println("PRE  CONDITION : an array of 1, 3, 4, 88, -99, 3, -2");
        System.out.println("POST CONDITION : returns an ordered array");
        System.out.println("TEST RESULTS   : ");
        
        ArrayUtil.selectionSortDescending(data);

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] >= data[i + 1]) {
                System.out.println(data[i] + " > " + data[i + 1] + " PASSED");
            } else {
                System.out.println(data[i] + " > " + data[i + 1] + " FAILED");
            }
        }
    }
    
    public static void testSelectionSortAscending() {
        int data[] = {1, 3, 4, 88, -99, 3, -2};
        
        System.out.println("\n------------------------------------");
        System.out.println("TEST CASE #8: Selection Sort Ascending");
        System.out.println("PRE  CONDITION : an array of 1, 3, 4, 88, -99, 3, -2");
        System.out.println("POST CONDITION : returns an ordered array");
        System.out.println("TEST RESULTS   : ");
        
        ArrayUtil.selectionSortAscending(data);

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] <= data[i + 1]) {
                System.out.println(data[i] + " < " + data[i + 1] + " PASSED");
            } else {
                System.out.println(data[i] + " < " + data[i + 1] + " FAILED");
            }
        }
    }

    public static void testLinearSearch(int[] data) {
        
    }

}
