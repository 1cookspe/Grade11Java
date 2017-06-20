/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.ExamReview;

import java.util.ArrayList;

/**
 *
 * @author spencercook
 */
public class Furniture {
    // Class variables
    static String name = "Bob";

    // Instance variables
    private int price;
    private boolean sold;
    private String type;
    private int id;
    private ArrayList<String> strings;

    public Furniture() {
        id = (int) Math.random() * 10 + 1;
    }

    public Furniture(int id) {
        this.id = id;
    }

    public Furniture(String type, int price) {
        this();
        this.type = type;
        this.price = price;
        
    }

    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        boolean doesEqual = false;
        final Furniture f = (Furniture) obj;
        if (this.id == f.id) {
            doesEqual = true;
        } else if (this.type == f.type) {
            doesEqual = true;
        }
        return doesEqual;
    }

    @Override
    public String toString() {
        return "Furniture: " + this.id + "";
    }
    
    public void add(String s) {
        strings.add(s);
    }
    
    
    
}
