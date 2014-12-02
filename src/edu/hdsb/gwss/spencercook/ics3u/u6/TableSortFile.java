/* Name: Spencer Cook
 * Date: December 2, 2014
 * Version: v0
 * Description:
 This program sorts a table of values from a file and prints it to the user
 */
package edu.hdsb.gwss.spencercook.ics3u.u6;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1cookspe
 */
public class TableSortFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Variables
        String inputString = "";
        
        //Objects 
        File file = new File("input.txt");
        Scanner input = new Scanner(file);
        StringTokenizer stringTokenizer = new StringTokenizer(inputString, ",");
        
        //Use while loop to get data from file
        while (stringTokenizer.hasMoreTokens()) {
            
        }
        
        
    }
    
    
}
