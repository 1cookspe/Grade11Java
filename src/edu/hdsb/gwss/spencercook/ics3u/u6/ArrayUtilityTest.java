/* Name: Spencer Cook
 * Date: November 19, 2014
 * Version: v0
 * Description:
 This program uses Binary Search to search for a value within an array
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
        
        for( int i = 0; i < values.length-1; i++ ) {
            if( values[i] < values[i+1] ) {
                System.out.println( values[i] + " < " + values[i+1] + " PASSED" );
            }
            else {
                System.out.println( values[i] + " < " + values[i+1] + " FAILED" );
            }
        }
        
        
        int data[] = { 1, 3, 4, 88, -99, 3, -2 };
        System.out.println( "------------------------------------" );
        System.out.println( "TEST CASE #1: minimum" );
        System.out.println( "PRE  CONDITION : an array with a mimimum of -99" );
        System.out.println( "POST CONDITION : returns a minimum of -99" );
        System.out.println( "TEST RESULTS   : " + ArrayUtil.getLowestValue(data) );
        
        System.out.println( "------------------------------------" );
        System.out.println( "TEST CASE #2: maximum" );
        System.out.println( "PRE  CONDITION : an array with a maximum of 88" );
        System.out.println( "POST CONDITION : returns a maximum of 88" );
        System.out.println( "TEST RESULTS   : " + ArrayUtil.getHighestValue(data) );
        
        System.out.println( "------------------------------------" );
        System.out.println( "TEST CASE #2: average" );
        System.out.println( "PRE  CONDITION : an array with an average of -0.2" );
        System.out.println( "POST CONDITION : returns an average of -0.2" );
        System.out.println( "TEST RESULTS   : " + ArrayUtil.calculateAverage(data));
        
        System.out.println( "------------------------------------" );
        
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
