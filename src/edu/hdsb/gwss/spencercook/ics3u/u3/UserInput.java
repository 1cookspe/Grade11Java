/*
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author spencercook
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello there, " + name);

        //Formatter
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double dollars = 21.5;
        System.out.println(money.format(dollars));
    }

}
