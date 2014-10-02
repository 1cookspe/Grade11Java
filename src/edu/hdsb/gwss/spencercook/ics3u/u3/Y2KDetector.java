/* Name: Spencer Cook
 * Date: October 2, 2014
 * Version: v0
 * Description:
 This program calculates a user's age after inputting the last two digits of the year they were born in.
 */

package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1cookspe
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Constants

        // Variables
        int dateOfBirth;
        int currentYear;
        int ageOfPerson;

        // Objects
        Scanner ageInput = new Scanner(System.in);

        /*GET USER INPUT*/
        System.out.println("Welcome to the Y2KDetector!");
        //Get user's age
        System.out.print("Please input the last two digits of the year you were born in (eg. 1976 = 76)");
        dateOfBirth = ageInput.nextInt();
        //Get year
        System.out.print("Please input the last two digits of the current year (eg. 2014 = 14)");
        currentYear = ageInput.nextInt();

        //See what century person was born in and calculate age
        if (dateOfBirth < currentYear) {
        ageOfPerson = currentYear - dateOfBirth;
        ageOfPerson = ageOfPerson * -1;
        } else if (dateOfBirth == currentYear) {
        ageOfPerson = 0;
        } else {
        ageOfPerson = dateOfBirth - currentYear;
        }
    }
}
