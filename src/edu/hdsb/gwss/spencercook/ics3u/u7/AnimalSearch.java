/* Name: Spencer Cook
 * Date: December 11, 2014
 * Version: v0
 * Description:
 This program searches an XML file
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1cookspe
 */
public class AnimalSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects
        File file = new File("animals.xml");
        Builder builder = new Builder();
        Element rootAnimals = null;
        try {
            Document document = builder.build(file);
            rootAnimals = document.getRootElement();
        } catch (Exception ex) {
            System.err.print(ex);
        }

        Elements childElements = rootAnimals.getChildElements();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 1");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("diet").getValue().equals("Carnivore")) {
                System.out.println(childElements.get(i).toXML());
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 2");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("flying").getValue().equals("Yes")) {
                System.out.println(childElements.get(i).getFirstChildElement("animalName").toXML());
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 3");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("habitat").getValue().equals("North America")) {
                System.out.println(childElements.get(i).toXML());
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 4");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("animalName").getValue().equals("Moose")) {
                System.out.println(childElements.get(i).toXML());
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 5");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("animalName").getValue().equals("Toucan")) {
                System.out.println(childElements.get(i).getFirstChildElement("animalName").getValue());
            }
        }
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 6");
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("animalClass").getValue().equals("Mammalia")) {
                System.out.println(childElements.get(i).getFirstChildElement("animalName").toXML());
            }
        }
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Activity 6");
        //Create loop to find elements
        for (int i = 0; i < childElements.size(); i++) {
            if (childElements.get(i).getFirstChildElement("diet").getValue().equals("Omnivore")) {
                System.out.println(childElements.get(i).toXML());
            }
        }
    }

}
