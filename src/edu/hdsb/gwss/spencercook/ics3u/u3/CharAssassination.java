/* Name: Spencer Cook
 * Date: September 23, 2014
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class CharAssassination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch = 'A' ;
        //Z works because it is a character like A
        //AA presents an error, because it can only store a single character
        //A single space does work because it is a single value
        //No character presents an error, since it needs a value
        //"A" presents an error, since char does not represent a string, which uses ""
    System.out.println("A char: " +  ch );
    }
    
}
