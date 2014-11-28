/* Name: Spencer Cook
 * Date: November 19, 2014
 * Version: v0
 * Description:
 This program writes values to a file and reads from the file
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1cookspe
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Variables
        int[] randomArrays = new int[1000];
        int[] firstArray = new int[1000];
        int[] secondArray = new int[1000];
        
        //Objects
        File file = new File("output.txt");
        PrintWriter output = new PrintWriter( file );
//        File fileRead = new File("input.txt");
//        Scanner input = new Scanner(fileRead);
        
        
        //Use for loop to generate random numbers
        for (int i = 0; i < 1000; i++) {
            randomArrays[i] = (int) (Math.random() * 100) + 1;
//            output.write("\n" + randomArrays[i]);
//            output.write("HELLO!");
        }
        output.write("Hello0");
        output.close();
        
//        while (input.hasNext()) {
//            int i = 0;
//            firstArray[i] = Integer.parseInt(input.nextLine());
//            System.out.println(firstArray[i] + " ");
//            i++;
//        }
//        input.close();
//    }
    }
}
