/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.spencercook.ics3u.ExamReview;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author spencercook
 */
public class ExamReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Element rootElement = new Element("people");
        Document doc = new Document(rootElement);
        Element person = new Element("person");
        Element name = new Element("name");
        Element gender = new Element("gender");
        Element fav = new Element("fav");

        rootElement.appendChild(person);

        person.appendChild(name);
        person.appendChild(gender);
        person.appendChild(fav);

        name.appendChild("Billy");
        gender.appendChild("Male");
        fav.appendChild("Math");

        try {
            FileWriter fw = new FileWriter("examXML.xml");
            BufferedWriter buffer = new BufferedWriter(fw);
            buffer.write(doc.toXML());
            buffer.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        File file = new File("examXML.xml");
        Builder builder = new Builder();
        try {
            Document document = builder.build(file);
            Element roots = document.getRootElement();
            Elements children = roots.getChildElements();

            for (int i = 0; i < children.size(); i++) {
                System.out.println(children.get(i).getFirstChildElement("name").getValue());
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        int[] arrayFirst = {1, 66, 3, 44, 2, 98, 7};
        int[] arrayYo = bubbleSort(arrayFirst);

        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.print(arrayYo[i] + " ");
        }
        System.out.println("\n---------");

        int[] secondArray = {22, 3, 4, 1, 88, 5, 4, 12, 99, 76};
        int[] secondArrayYo = selectionSort(secondArray);
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArrayYo[i] + " ");
        }

        String hello = "Hello ";
        String jim = " Jim";
        System.out.println(hello.concat(jim));
        
        twoDArray();
        
        System.out.println("Round " + Math.round(6.4533423234));
        System.out.println("Ceil " + Math.ceil(5));
        
        int hey = 3;
        double yo = hey;
        
//        BigInteger a = new BigInteger("2389283912839218231354545454538294893028409238409283904832");
//        BigInteger b = new BigInteger("34343423423423433214213802193901283901823908120389208390283092");
//        System.out.println("Compared " + a.compareTo(b));
//        BigInteger c = a.multiply(b);
//        System.out.println(c);
        
        BigDecimal a = new BigDecimal("54343432.232323231");
        BigDecimal b = new BigDecimal("678.4422");
        BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
        System.out.println(c);
        
        String ab = "Z";
        System.out.println((int) ab.charAt(0));
        ab = ab.concat(" hello");
        System.out.println(ab);
        
        String team = "Florida Panthers";
        System.out.println(team.substring(2, 13));
        System.out.println(team.indexOf("a", 7));
        System.out.println(team.lastIndexOf("a"));
        
        String token = "String";
        StringTokenizer st = new StringTokenizer(token, ",", true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("Pittsburgh Penguins");
        teams.add("Florida Panthers");
        teams.add("Toronto Maple Leafs");
        teams.add("Buffalo Sabres");
        System.out.println(teams);
        teams.remove("Toronto Maple Leafs");
        System.out.println(teams);
        teams.add(2, "Carolina Hurricanes");
        System.out.println(teams);
        teams.clear();
        System.out.println(teams);
    }

    public static void readingAndWriting() {
        File file = new File("examReview.txt");
        String text = "";
        try {
            Scanner output = new Scanner(file);
            while (output.hasNext()) {
                System.out.println(output.nextLine());
                text += output.nextLine();
            }
            output.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        StringTokenizer str = new StringTokenizer(text);
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }

    public static int[] bubbleSort(int[] array) {
        for (int pass = 0; pass < array.length - 1; pass++) {
            for (int i = 0; i < array.length - 1 - pass; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

        }
        return array;
    }

    public static void twoDArray() {
        int die1[] = {1, 0, 2, 0, 3, 1};
        int die2[] = {2, 1, 0, 4, 0, 3};
        int die3[] = {3, 0, 3, 0, 3, 4};
        int die4[] = {2, 0, 1, 0, 3, 5};
        int die5[] = {1, 0, 2, 0, 3, 4};
        int die6[] = {4, 0, 1, 2, 3, 2};
        int dice[][] = {die1, die2, die3, die4, die5, die6};
        int total = 0;
        for (int row = 0; row < dice.length; row++) {
            for (int col = 0; col < dice[row].length; col++) {
                total += dice[row][col];
            }
        }
        System.out.println(total);
    }

    public static int[] selectionSort(int[] array) {
        int highestIndexValue = -1;

        for (int pass = 0; pass < array.length; pass++) {
            highestIndexValue = 0;
            for (int i = 0; i < array.length - pass; i++) {
                if (array[highestIndexValue] < array[i]) {
                    highestIndexValue = i;
                }
            }
            int temp = array[highestIndexValue];
            array[highestIndexValue] = array[array.length - 1 - pass];
            array[array.length - 1 - pass] = temp;
        }
        return array;
    }

    public static int binarySearch(int[] array, int search) {
        int leftPost = 0;
        int rightPost = array.length - 1;
        int location = -1;
        boolean found = false;

        do {
            int midpoint = (leftPost + rightPost) / 2;
            if (search == array[midpoint]) {
                location = midpoint;
                found = true;
            } else if (search < array[midpoint]) {
                rightPost = midpoint - 1;
            } else {
                leftPost = midpoint + 1;
            }
        } while (!found && rightPost >= leftPost);
        return location;
    }

    public int linearSearch(int[] array, int search) {
        int location = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                location = i;
                i = array.length;
            }
        }
        return location;
    }
}
