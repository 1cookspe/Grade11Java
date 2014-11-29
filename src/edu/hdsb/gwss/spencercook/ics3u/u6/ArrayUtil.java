/* Name: Spencer Cook
 * Date: November 11, 2014
 * Version: v0
 * Description:
 This class contains array methods that can be used by other files 
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.util.Scanner;

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

    public static int[] bubbleSortAscending(int[] values) {

        for (int pass = 0; pass < values.length - 1; pass++) {
            for (int i = 0; i < values.length - 1 - pass; i++) {

                if (values[i] > values[i + 1]) {
                    swapValues(values, i, i + 1);
                }

            }
        }

        return values;
    }

    public static void bubbleSortDescending(int[] values) {

        for (int pass = 0; pass < values.length - 1; pass++) {
            for (int i = 0; i < values.length - 1 - pass; i++) {

                if (values[i] < values[i + 1]) {
                    swapValues(values, i, i + 1);
                }

            }
        }

        //return values[i] + " ";
    }

    public static int[] printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        return values;
    }

    public static String[] printArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        return values;
    }

    public static void swapValues(int[] data, int i, int j) {
        int tempValue = data[i];
        data[i] = data[j];
        data[j] = tempValue;
    }

    public static void swapValuesDouble(double[] data, int i, int j) {
        double tempValue = data[i];
        data[i] = data[j];
        data[j] = tempValue;
    }

    public static int selectionSortAscending(int[] values) {
        //Variables
        int indexHighestValue = - 1;

        //Use for loop to iterate through array
        for (int pass = 0; pass < values.length; pass++) {
            indexHighestValue = 0;
            for (int i = 1; i < values.length - pass; i++) {
                if (values[indexHighestValue] < values[i]) {
                    indexHighestValue = i;
                }
                //System.out.println(values[i]  ");
            }
            swapValues(values, indexHighestValue, values.length - pass - 1);
            //System.out.println(values[i]);
        }
        return indexHighestValue;
    }

    public static int selectionSortDescending(int[] values) {
        //Variables
        int indexHighestValue = - 1;

        //Use for loop to iterate through array
        for (int pass = 0; pass < values.length; pass++) {
            indexHighestValue = 0;
            for (int i = 1; i < values.length - pass; i++) {
                if (values[indexHighestValue] > values[i]) {
                    indexHighestValue = i;
                }
                //System.out.println(values[i]  ");
            }
            swapValues(values, indexHighestValue, values.length - pass - 1);
            //System.out.println(values[i]);
        }
        return indexHighestValue;
    }

    public static int binarySearchDescending(int[] data, int searchValue) {
        //Variables
        int location = -1;
        int leftPost = 0;
        int rightPost = data.length - 1;
        boolean variableFound = false;

        //Use do while loop to move posts and midpoints, and search for searchValue
        do {
            int midpoint = (leftPost + rightPost) / 2;
            if (searchValue == data[midpoint]) {
                location = midpoint;
                variableFound = true;
            } else if (searchValue > data[midpoint]) {
                rightPost = midpoint - 1;
            } else {
                leftPost = midpoint + 1;
            }
        } while (leftPost <= rightPost && !variableFound);

        if (variableFound) {
            System.out.println(searchValue + " is found at index " + location + " in the array.");
        } else {
            System.out.println("Data not found.");
        }

        return location;

    }
    
    public static int binarySearchAscending(int[] data, int searchValue) {
                //Variables
        int location = -1;
        int leftPost = 0;
        int rightPost = data.length - 1;
        boolean variableFound = false;

        //Use do while loop to move posts and midpoints, and search for searchValue
        do {
            int midpoint = (leftPost + rightPost) / 2;
            if (searchValue == data[midpoint]) {
                location = midpoint;
                variableFound = true;
            } else if (searchValue < data[midpoint]) {
                rightPost = midpoint - 1;
            } else {
                leftPost = midpoint + 1;
            }
        } while (leftPost <= rightPost && !variableFound);

        if (variableFound) {
            System.out.println(searchValue + " is found at index " + location + " in the array.");
        } else {
            System.out.println("Data not found.");
        }

        return location;
    }

    public static int sequentialSearch(int[] data, int searchValue) {
        //Variables
        int position = -1;
        boolean variableFound = false;

        //Create for loop to iterate through objects in array
        for (int i = 0; i < data.length; i++) {
            if (searchValue == data[i]) {
                position = i;
                i = data.length + 1;
                variableFound = true;
            }
        }
        if (variableFound) {
            System.out.println(searchValue + " is found at index " + position + " in the data.");
        } else {
            System.out.println("Data not found.");
        }
        return position;
    }

    public static void performLinearSearch(int[] values) {
        //Variables
        int searchValue = -1;

        //Objects
        Scanner input = new Scanner(System.in);

        //Ask user to search for value and use linear search to search for it
        System.out.print("\nSearch for value in array: ");
        searchValue = input.nextInt();
        ArrayUtil.sequentialSearch(values, searchValue);
    }

    public static void performBinarySearch(int[] values) {
        //Variables
        int searchValue = -1;

        //Objects
        Scanner input = new Scanner(System.in);

        //Ask user to search for value and use linear search to search for it
        System.out.print("\nSearch for value in array: ");
        searchValue = input.nextInt();
        ArrayUtil.binarySearchAscending(values, searchValue);
    }

    public static int calculateSum(int[] values) {
        //Variables
        int sum = 0;

        //For loop to calculate sum
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int[] selectionSortAscendingDoubleTable(double[] data) {
        int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]] > (data[indecies[i + 1]])) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;

    }

    public static int[] selectionSortDescendingDoubleTable(double[] data) {
       int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]] < (data[indecies[i + 1]])) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;
    }

    public static int[] selectionSortDescendingTable(int[] data) {
        int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]] < (data[indecies[i + 1]])) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;
    }

    public static int[] selectionSortAscendingTable(int[] data) {
        int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]] > (data[indecies[i + 1]])) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;
    }
    
    public static int[] generateIndicesArray( int size ) {
        int[] indecies = new int[size];
        for (int i = 0; i < indecies.length; i++) {
            indecies[i] = i;
        }
        return indecies;
    }

    public static int selectionSortAscendingTableDouble(double[] data) {
        //Variables
        int indexHighestValue = - 1;

        //Use for loop to iterate through array
        for (int pass = 0; pass < data.length; pass++) {
            indexHighestValue = 0;
            for (int i = 1; i < data.length - pass; i++) {
                if (data[indexHighestValue] > data[i]) {
                    indexHighestValue = i;
                }
                //System.out.println(values[i]  ");
            }
            swapIndicies(indexHighestValue, data.length - pass - 1);
            //swapValuesDouble(data, indexLowestValue, data.length - pass - 1);
            //System.out.println(values[i]);
        }
        return indexHighestValue;
    }

    public static int selectionSortDescendingTableDouble(double[] data) {
        //Variables
        int indexLowestValue = - 1;

        //Use for loop to iterate through array
        for (int pass = 0; pass < data.length; pass++) {
            indexLowestValue = 0;
            for (int i = 1; i < data.length - pass; i++) {
                if (data[indexLowestValue] > data[i]) {
                    indexLowestValue = i;
                }
                //System.out.println(values[i]  ");
            }
            swapIndicies(indexLowestValue, data.length - pass - 1);
            //swapValuesDouble(data, indexLowestValue, data.length - pass - 1);
            //System.out.println(values[i]);
        }
        return indexLowestValue;
    }

    public static void swapIndicies(int i, int j) {
        int[] indicies = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tempIndicie = indicies[i];
        indicies[i] = indicies[j];
        indicies[j] = tempIndicie;
    }

    public static int[] selectionSortStringsAscending(String[] data) {
        int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]].compareTo(data[indecies[i + 1]]) > 0) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;
    }

    public static int[] selectionSortStringsDescending(String[] data) {
        int[] indecies = generateIndicesArray( data.length );

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[indecies[i]].compareTo((data[indecies[i + 1]])) < 0) {
                    swapValues(indecies, i, i + 1);
                }
            }
        }
        return indecies;
    }
}
