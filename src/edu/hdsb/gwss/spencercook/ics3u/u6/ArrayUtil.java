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

    public static int[] bubbleSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                int tempValue = values[i];
                values[i] = values[i + 1];
                values[i + 1] = tempValue;
            }
        }

        return values;
    }

}
