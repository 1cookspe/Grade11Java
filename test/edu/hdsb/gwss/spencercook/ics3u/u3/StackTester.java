/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u3;


/**
 *
 * @author spencercook
 */
public class StackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(5);
        stack.push(76);
        System.out.println(stack.toString());
    }
    
}
