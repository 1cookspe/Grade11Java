/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import static edu.hdsb.gwss.spencercook.ics3u.u6.ArrayUtil.swapValues;

/**
 *
 * @author 1cookspe
 */
public class TestReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {1, 5, 66, -76, 2, 7, 15, 3};
        int[] results = new int[8];
        int[] newArray;

        results = bubbleSortUp(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(results[i] + " ");
            //System.out.println(newArray[i] + " ");
        }
    }

    public static int[] bubbleSortUp(int[] data) {

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                if (data[i] > data[i + 1]) {
                    ArrayUtil.swapValues(data, i, i + 1);
                }

            }
        }
        return data;
    }
    
    public static int selectionSortUp(int[] data) {
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
            swapValues(data, indexHighestValue, data.length - pass - 1);
            //System.out.println(values[i]);
        }
        return indexHighestValue;
    }
}
