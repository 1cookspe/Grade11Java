/* Name: Spencer Cook
 * Date: October 15, 2014
 * Version: v0
 * Description:
 This program creates a loop that prints out the range of two numbers using a for loop
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class PictureFraming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double M = 5;
        double N = 10;
        double P = 1;
        double Q = 1;

        //Objects
        Scanner frameInput = new Scanner(System.in);

        //Calculations
        // - Print out dimensions of frame
        for (double widthOfMat = 1; widthOfMat <= P + N; widthOfMat++) {
            //System.out.format("\n%4s", "+");
        }
        for (double lengthOfPicture = 1; lengthOfPicture <= M; lengthOfPicture++) {
            System.out.format("%5s", ".");
        }
        for (double widthOfPicture = 2; widthOfPicture <= N; widthOfPicture++) {
            for (int counter = 0; counter <= M; counter++) {
                System.out.format("\n%5s", ".");
            }
        }
    }

}
