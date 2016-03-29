package mcnellen;

import java.util.Scanner;

public class DiceCompetition {
    
    public static void main(String[] args) {
        /* DiceCompetition.java
         * This program rolls two dice for the user and the computer and announces the winner
         * @author Quinlan McNellen
         * 2016/03/29
         * v0.0.1
         */
        final String VERSION = "v0.0.1";
        
        int dieA;
        int dieB;
        int human;
        int computer;
        String choice;
        boolean playAgain = true;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DiceCompetition " + VERSION);
        
        while (playAgain == true) {
            dieA = (int)(Math.random() * 6) + 1;
            dieB = (int)(Math.random() * 6) + 1;
            
            human = dieA + dieB;
            
            dieA = (int)(Math.random() * 6) + 1;
            dieB = (int)(Math.random() * 6) + 1;
            
            computer = dieA + dieB;
            
            if (human > computer) {
                System.out.println("User wins!");
            } else if (human < computer) {
                System.out.println("Computer wins!");
            } else if (human == computer) {
                System.out.println("Tie!");
            } 
            
            boolean invalid = true;
            
            while (invalid == true) {
                System.out.print("Play again? (y/n) ");
                choice = scan.nextLine();
            
                if (choice.equalsIgnoreCase("y")) {
                    playAgain = true;
                    invalid = false;
                } else if (choice.equalsIgnoreCase("n")) {
                    playAgain = false;
                    invalid = false;
                } else {
                    invalid = true;
                    System.out.println("Enter y or n ONLY");
                }
            }
        } scan.close();
        System.out.println("Goodbye!");
    }
}