/* Name: Spencer Cook
 * Date: December 12, 2014
 * Version: v0
 * Description:
 This program prints out the AL standings from an XML file
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
public class Standings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("AL.STANDINGS.xml");
        Builder builder = new Builder();

        try { 
            Document document = builder.build(file);
            Element root = document.getRootElement();
            Elements children = root.getChildElements();

            System.out.println("American League East \n-------------------------------------------");
            System.out.format("%10s | %10s\n", "Team", "Record");

            for (int i = 0; i < children.size(); i++) {
                if (children.get(i).getFirstChildElement("division").getValue().equals("East")) {
                    System.out.format("%10s | %10s\n", children.get(i).getFirstChildElement("name").getValue(), children.get(i).getFirstChildElement("record").getValue());
                }
            }

            System.out.println("\nAmerican League Central \n-------------------------------------------");
            System.out.format("%11s | %10s\n", "Team", "Record");

            for (int i = 0; i < children.size(); i++) {
                if (children.get(i).getFirstChildElement("division").getValue().equals("Central")) {
                    System.out.format("%11s | %10s\n", children.get(i).getFirstChildElement("name").getValue(), children.get(i).getFirstChildElement("record").getValue());
                }
            }

            System.out.println("\nAmerican League West \n-------------------------------------------");
            System.out.format("%10s | %10s\n", "Team", "Record");

            for (int i = 0; i < children.size(); i++) {
                if (children.get(i).getFirstChildElement("division").getValue().equals("West")) {
                    System.out.format("%10s | %10s\n", children.get(i).getFirstChildElement("name").getValue(), children.get(i).getFirstChildElement("record").getValue());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
