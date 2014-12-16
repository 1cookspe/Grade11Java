/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import nu.xom.Document;
import nu.xom.Element;

/**
 *
 * @author spencercook
 */
public class TestReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("fileName.xml");
        Element root = new Element("root");
        Document document = new Document(root);
        
        Element firstElement = new Element("firstElement");
        Element secondElement = new Element("secondElement");
        Element begin = new Element("element");
        
        begin.appendChild(firstElement);
        begin.appendChild(secondElement);
        
        root.appendChild(begin);
        
        firstElement.appendChild("Hello");
        secondElement.appendChild("Hey");
        
        System.out.println(document.toXML());
        
        PrintWriter pw = new PrintWriter(file);
        BufferedWriter writer = new BufferedWriter(pw);

        writer.write(document.toXML());
    }

}
