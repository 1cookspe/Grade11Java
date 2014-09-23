/*
 * Name: Spencer Cook
 * Date: September 22, 2014
 * Version: v0
 * Description:
        This code creates a bingo, rock paper scissors, and smile application
*/
package edu.hdsb.gwss.spencercook.ics3u.u3;

/**
 *
 * @author 1cookspe
 */
public class BingoRockPaperScissorsSmile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
//Exercise 1: The Bingo Game
        System.out.println("Bingo Game");
        System.out.format("%-5s| %-5s| %-5s| %-5s| %-5s", " B", " I", " N", " G", " O");
        System.out.format("\n%-5s| %-5s| %-5s| %-5s| %-5s", " 8"," 67", " 42", " 3", " 99");
        System.out.format("\n%-5s| %-5s| %-5s| %-5s| %-5s", " 78"," 57", " 4", " 94", " 9");
        System.out.format("\n%-5s| %-5s| %-5s| %-5s| %-5s", " 75", " 51", " FREE", " 12", " 87");
        System.out.format("\n%-5s| %-5s| %-5s| %-5s| %-5s", " 90", " 77", " 59", " 31", " 66");
        System.out.format("\n%-5s| %-5s| %-5s| %-5s| %-5s", " 56", " 34", " 73", " 22", " 1");
        
        //Exercise 2: Bingo Instructions
        System.out.println("\n\n\nBingo Instructions\n");
        System.out.println("1. The dealer pulls out a randomly numbered bingo ball.\n");
        System.out.println("2. The dealer calls out the number he/she has taken.\n");
        System.out.println("3. Players try to match the number with the numbers on their card.\n");
        System.out.println("4. Players mark off any matching numbers.\n");
        System.out.println("5. Dealer repeats steps 1-4 until a player matches five numbers in a row.\n");
        System.out.println("6. This player calls \"Bingo\" and the dealer checks to make sure that the player has indeed matches five numbers in a row.\n");
        
        //Exercise 4: Rock, Paper, Scissors
        System.out.println("\nHow To Play \"Rock, Paper, Scissors\"");
        System.out.println("\nPlayers say \"Rock, Paper, Scissors\" and choose either \"Rock\", \"Paper\", or \"Scissors\" in their head");
        System.out.println("\nPlayers then reveal their choices in unision, making a fist to represent\"Rock\", a piece sign to represent \"Scissors\", and a flat hand to represent \"Paper\"");
        System.out.println("\nThe players compare their choices, and the scoring is based on the following:\n");
        System.out.format("%-8s  %-8s  %-20s", "Choice 1", "Choice 2", "Winner");
        System.out.format("\n%-8s  %-8s  %-20s", "Rock", "Scissors", "Rock (Rock dulls scissors)");
        System.out.format("\n%-8s  %-8s  %-20s", "Paper", "Rock", "Paper (Paper covers rock)");
        System.out.format("\n%-8s  %-8s  %-20s", "Scissors", "Paper", "Scissors (Scissors cut paper)\n");
        
        //Exercise 7: Smile Application
        System.out.format("\n\n%51s", "Smile Application\n");
        System.out.format("%40s%1s%1s%1s%1s", "*", "*", "*", "*", "*");
        System.out.format("\n%39s%6s", "*", "*");
        System.out.format("\n%38s%2s%4s%2s", "*", "_", "_", "*");
        System.out.format("\n%37s%3s%4s%3s", "*", "O", "O", "*");
        System.out.format("\n%36s%6s%6s", "*", ":", "*");
        System.out.format("\n%35s%7s%7s", "*", "+", "*");
        System.out.format("\n%36s%4s%1s%1s%3s", "*", "\\", "____", "/", "*");
        System.out.format("\n%37s%10s", "*", "*");
        System.out.format("\n%38s%8s", "*", "*");
        System.out.format("\n%39s%6s", "*", "*");
        System.out.format("\n%40s%1s%1s%1s%1s", "*", "*", "*", "*", "*\n");
    }
    
}

     
    
