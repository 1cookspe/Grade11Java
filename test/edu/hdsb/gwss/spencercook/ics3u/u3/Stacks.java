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
public class Stacks {
    private int top;
    private int[] data;

    public Stacks() {
        this(15);
    }
    
    public Stacks(int length) {
        this.data = new int[length];
        this.top = -1;
    }
    
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = this.data[top];
            top--;
        }
        return value;
    }
    
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }
    
    public int size() {
        return this.top + 1;
    }
    
    public int capacity() {
        return this.data.length;
    }
    
    public boolean isFull() {
        if (size() == capacity()) {
            return true;
        }
        return false;
    }
    
    public void push(int value) {
        if (!isFull()) {
            this.data[top + 1] = value;
            top++;
        }
        
    }
    
    public String toString() {
        String outputString = "";
        for (int i = 0; i <= top; i++) {
            outputString += this.data[i];
        }
        return outputString;
    }
    
}
