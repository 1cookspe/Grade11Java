/* Name: Spencer Cook
 * Date: October 19, 2014
 * Version: v0
 * Description:
 This program creates a loop that calculates how long it will take for Canada's topsoil to be eroded from 30cm to 9cm
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author spencercook
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants
        final double INITIAL_TOPSOIL = 30;
        final double FINAL_TOPSOIL = 9;
        final double FIVE_HUNDRED_YEARS = 500;
        final double ONE_PERCENT = 0.01;
        final double TWO_AND_A_HALF = 2.5;

        // Variables
        int years = 0;
        
        //INTRODUCE PROGRAM
        System.out.println("Welcome to the Erosion Calculator!");
        System.out.println("Erosion is a serious problem in Canada today. Canada's current amount of topsoil is 30cm, and is decreasing. Once the topsoil reaches 9cm, plants can no longer grow. This program calculates how many years it will take for Canada's topsoil to erode.");
        

        //LOGICAL CALCULATIONS
        // - Create loop to find when topsoil will erode
        for (double topSoil = INITIAL_TOPSOIL; topSoil > FINAL_TOPSOIL; years++) {
            topSoil -= topSoil * ONE_PERCENT;
            topSoil += TWO_AND_A_HALF / FIVE_HUNDRED_YEARS;
        }
        System.out.println("It will take " + years + " years for the topsoil to erode.");
    }

}
