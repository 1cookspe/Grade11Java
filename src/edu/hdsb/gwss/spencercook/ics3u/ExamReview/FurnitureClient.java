/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.ExamReview;

/**
 *
 * @author spencercook
 */
public class FurnitureClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Furniture table = new Furniture("table", 565);
        System.out.println(table.getPrice());
        table.add("Black");
        System.out.println(table.getId());
    }
    
}
