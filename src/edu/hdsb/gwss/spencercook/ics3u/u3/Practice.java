/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int count, sum;

sum = 0;
for ( count = 0;  count <= 5; count++ )
{
  sum = sum + count ;
  System.out.print( count + " " );
}
System.out.println( "\nsum is: " + sum );

    }
}
