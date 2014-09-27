/* Name: Spencer Cook
 * Date: September 24, 2014
 * Version: v0
 * Description:
        This program calculates the perimeter and area of a rectangle
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;
import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class AreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width;
        double length;
        double area;
        double roundedArea;
        double perimeter;
        double roundedPerimeter;
        
        //User-input for width
        Scanner widthInput = new Scanner(System.in);
        System.out.print("Please enter the width value for your rectangle.");
        width = widthInput.nextDouble();
        
        //User-input for length
        Scanner lengthInput = new Scanner(System.in);
        System.out.print("Please enter the length value for your rectangle");
        length = lengthInput.nextDouble();
        
        //Calculate area
        area = width * length;
        roundedArea =  Math.round(area);
        System.out.print("The approximate area of a rectangle with a width of " + width);
        System.out.print(" a length of " + length);
        System.out.print(" is " + roundedArea);
        System.out.print("\n");
        
        //Calculate perimeter
        perimeter = 2 * (width + length);
        roundedPerimeter = Math.round(perimeter);
        System.out.print("The approximate perimeter of a rectangle with a width of " + width);
        System.out.print(" a length of " + length);
        System.out.print(" is " + roundedPerimeter);
        System.out.print("\n");
    }
    
}
