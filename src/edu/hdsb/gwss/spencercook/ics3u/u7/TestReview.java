/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Serializer;

/**
 *
 * @author spencercook
 */
public class TestReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("newFile.xml");
        Element root = new Element("root");
        Document document = new Document(root);

        Element firstElement = new Element("firstElement");
        Element secondElement = new Element("secondElement");
        Element begin = new Element("element");

        begin.appendChild(firstElement);
        begin.appendChild(secondElement);

        root.appendChild(begin);

        firstElement.appendChild("YIYDSF");
        secondElement.appendChild("SDFJDSJFJD");

        System.out.println(document.toXML());

        Builder builder = new Builder();
        try {
            BufferedWriter writer = new BufferedWriter(new PrintWriter(file));
            writer.write(document.toXML());
            writer.close();
            document = builder.build(file);
        } catch (Exception e) {
            System.err.println(e);
        }

        Element newRoot = document.getRootElement();
        Elements children = newRoot.getChildElements();

        System.out.println(children.get(0).getFirstChildElement("firstElement").getValue());

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).getFirstChildElement("secondElement").getValue());
        }

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(document);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        
       // anotherMethod();
        

    }

    public static void anotherMethod() {
        
        
      File file = new File("newFile.xml");
        Element root = new Element("root");
        Document document = new Document(root);

        Element firstElement = new Element("firstElement");
        Element secondElement = new Element("secondElement");
        Element begin = new Element("element");

        begin.appendChild(firstElement);
        begin.appendChild(secondElement);

        root.appendChild(begin);

        firstElement.appendChild("YIYDSF");
        secondElement.appendChild("SDFJDSJFJD");

        System.out.println(document.toXML());

        Builder builder = new Builder();
        try {
            BufferedWriter writer = new BufferedWriter(new PrintWriter(file));
            writer.write(document.toXML());
            writer.close();
            document = builder.build(file);
        } catch (Exception e) {
            System.err.println(e);
        }

        Element newRoot = document.getRootElement();
        Elements children = newRoot.getChildElements();

        System.out.println(children.get(0).getFirstChildElement("firstElement").getValue());

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).getFirstChildElement("secondElement").getValue());
        }

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(document);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
