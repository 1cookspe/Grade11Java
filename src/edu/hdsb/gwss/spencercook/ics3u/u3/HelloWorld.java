/*
 * Name: Spencer Cook
 * Date: Sept 18, 2014
 * Version: v1.
 * Description: 
        This code prints "Hello world" to the output window. 
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Special characters
        System.out.println("\"Hello\"");
        System.out.println("\tTab");
        System.out.println("\\Slash");
        System.out.println("\"Quote\"");
        System.out.println("Hello, world!");
        
        //MLB Standings
        System.out.print("Team");
        System.out.print("\t Wins");
        System.out.print("\t Losses");
        System.out.print("\t Ties");
        System.out.print("\nOrioles");
        System.out.print("\t 93");
        System.out.print("\t 62");
        System.out.print("\t 15");
        System.out.print("\nYankees");
        System.out.print("\t 80");
        System.out.print("\t 75");
        System.out.print("\t 6");
        System.out.print("\nBlue Jays");
        System.out.print("\t 78");
        System.out.print("\t 77");
        System.out.print("\t 10");
        
        //Formatting
        System.out.format("%-20s | %5s | %6s | %5s", "\n\nTeam Name", "Wins", "Losses", "PCT");
        System.out.format("%-20s | %5s | %6s | %5s", "\nBaltimore", "90", "60", ".600");
        System.out.format("%-20s | %5s | %6s | %5s", "\nNew York", "80", "75", ".516");
        System.out.format("%-20s | %5s | %6s | %5s", "\nToronto", "78", "77", ".503");
        System.out.format("%-20s | %5s | %6s | %5s", "\nTampa", "75", "81", ".481\n");
    }
}
