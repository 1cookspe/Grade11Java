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
        double M = 1;
        double N = 1;
        double P = 1;
        double Q = 1;
        String formattedWidth = "";
        String formattedLength = "";
        String formattedMatWidth = "";
        String formattedMatLength = "";
        String formattedPicWidth = "";
        String formattedPicLength = "";

        //Constants
        final double FRAME_WIDTH = (N + (Q * 2) + (P * 2)) - 1;
        final double FRAME_LENGTH = (M + (Q * 2) + (P * 2)) - 2;
        final double MAT_WIDTH = (N + (P * 2)) - 1;
        final double MAT_LENGTH = (M + (Q * 2)) - 1;

        //Objects
        Scanner frameInput = new Scanner(System.in);

        //CALCULATIONS
        // - Find places of rectangle
        for (double widthOfFrame = 0; widthOfFrame <= FRAME_WIDTH; widthOfFrame++) {
//            System.out.println(widthOfFrame);
            formattedWidth += "%1s";
//            System.out.println(formattedWidth);
            for (double lengthOfFrame = 0; lengthOfFrame <= FRAME_LENGTH; lengthOfFrame++) {
                formattedLength += "%1s";
//                System.out.println(formattedLength);
                for (double widthOfMat = 0; widthOfMat <= MAT_WIDTH; widthOfMat++) {
                    formattedMatWidth += "+";
//                    System.out.println(formattedMatWidth);
                    for (double lengthOfMat = 0; lengthOfMat <= MAT_LENGTH; lengthOfMat++) {
                        formattedMatLength += "+";
//                        System.out.println(formattedMatLength);
                        for (double widthOfPic = 0; widthOfPic <= N; widthOfPic++) {
                            formattedPicWidth += ".";
                            for (double lengthOfPic = 0; lengthOfPic <= M; lengthOfPic++) {
                                formattedPicLength += ".";
                                System.out.format(formattedWidth, formattedWidth, formattedLength, formattedMatWidth, formattedMatLength, formattedPicWidth, formattedPicLength);
                                //System.out.format(formattedLength, "");
                            }
                        }
                    }
                }
            }

        }
    }

}
