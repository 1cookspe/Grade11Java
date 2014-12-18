/* Name: Spencer Cook
 * Date: December 12, 2014
 * Version: v0
 * Description:
 This program prints out the AL standings from an XML file
 */
package edu.hdsb.gwss.spencercook.ics3u.u7;

import java.io.BufferedWriter;
import java.io.File; 
import java.io.PrintWriter;
import nu.xom.Document;
import nu.xom.Element;

/**
 *
 * @author 1cookspe
 */
public class StandingsEast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String teamName = "";
        String recordString = "";
        String divisionString = "";

        File file = new File("eastStandings.xml");
        Element root = new Element("americanLeagueEastTeams");
        Document document = new Document(root);

        for (int i = 0; i < 3; i++) {
            
            if (i == 0) {
                teamName = "Baltimore";
                recordString = "96-66";
                divisionString = "East";
            } else if (i == 1) {
                teamName = "NY Yankees";
                recordString = "84-78";
                divisionString = "East";
            } else {
                teamName = "Toronto";
                recordString = "83-79";
                divisionString = "East";
            }

            Element team = new Element("team");

            Element name = new Element("name");
            Element division = new Element("division");
            Element record = new Element("record");

            name.appendChild(teamName);
            division.appendChild(divisionString);
            record.appendChild(recordString);

            team.appendChild(name);
            team.appendChild(division);
            team.appendChild(record);

            root.appendChild(team);
            
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            BufferedWriter bw = new BufferedWriter(pw);
            
            bw.write(document.toXML());
            bw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
