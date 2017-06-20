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
public class countWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        
        System.out.println("Hello ".substring(1));
        
        String word = "train";
        StringBuilder stringbuilt = new StringBuilder(word);
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

}
