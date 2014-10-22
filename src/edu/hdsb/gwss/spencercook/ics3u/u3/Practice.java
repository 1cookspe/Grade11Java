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
        boolean flag = true;
int i = 10;
while ( flag ) {
    System.out.print( i + " " );
    if ( i % 2 == 0 ) {
        i = i - 2;
    } else if ( i % 3 == 0 ) {
        i = i + 1;
    }
    if ( i < 0 ) {
        flag = false;
    }
}

    }
}
