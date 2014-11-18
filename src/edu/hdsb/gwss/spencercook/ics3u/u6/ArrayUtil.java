/* Name: Spencer Cook
 * Date: November 11, 2014
 * Version: v0
 * Description:
 This class contains array methods that can be used by other files 
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

/**
 *
 * @author 1cookspe
 */
public class ArrayUtil {

    public static int getLowestValueAbove(int[] values, int aboveValue) {
        int lowestValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < lowestValue && values[i] > aboveValue) {
                lowestValue = values[i];
            }
        }
        return lowestValue;
    }

    public static int getLowestValue(int[] values) {
        int lowestValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < lowestValue) {
                lowestValue = values[i];
            }
        }
        return lowestValue;
    }

    public static int getHighestValue(int[] values) {
        int highestValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > highestValue) {
                highestValue = values[i];
            }
        }
        return highestValue;
    }

    public static double calculateAverage(int[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    public static double calculateNonZeroAverage(int[] values) {
        double sum = 0;
        int numberOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                sum += values[i];
                numberOfValues++;
            }
        }
        return sum / numberOfValues;
    }

    public static void bubbleSort(int[] values) {

        for (int pass = 0; pass < values.length - 1; pass++) {
            for (int i = 0; i < values.length - 1 - pass; i++) {

                if (values[i] > values[i + 1]) {
                    int tempValue = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = tempValue;
                    //ArrayUtil.swapValues(values[i], values[i + 1]);
                    //ArrayUtil.swapValues(values[i], values[i]);
                    //System.out.print(values[i] + " ");
                }

            }
        }

        //return values[i] + " ";
    }

    public static void printArray(int[] values) {
        //Create for loop to generate 1000 random numbers
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }

    public static void swapValues(int[] data, int i, int j) {
        int tempValue = data[i];
        data[i] = data[j];
        data[j] = tempValue;
    }

    public static void selectionSort(int[] values) {
        //Variables
        int indexHighestValue;

        //Use for loop to iterate through array
        for (int pass = 0; pass < values.length; pass++) {
            indexHighestValue = 0;
            for (int i = 1; i < values.length - 1 - pass; i++) {
                if (values[indexHighestValue] < values[i]) {
                    indexHighestValue = i;
                }
                //System.out.println(values[i]  ");
            }
            swapValues(values, indexHighestValue, values.length - pass - 1);
            //System.out.println(values[i]);
        }
    }
    
    public static int binarySearch(int[] data, int searchValue) {
        //Variables
        int location = -1;
        int leftPost = 0;
        int rightPost = data.length - 1;
        
        //Use do while loop to move posts and midpoints, and search for searchValue
        do {
            int midpoint = (leftPost + rightPost) / 2;
            if (searchValue == data[midpoint]) {
                location = midpoint;
                rightPost = 1;
                leftPost = 0;
            } else if (searchValue < data[midpoint]) {
                rightPost = midpoint - 1;
            } else {
                leftPost = midpoint + 1;
            } 
        } while (leftPost <= rightPost);
      
        return location;
        
    }
   

}
