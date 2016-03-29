package mcnellen;

import java.util.Scanner;

public class DiceCompetition {
    
    public static void main(String[] args) {
        /* DiceCompetition.java
         * This program rolls two dice for the user and the computer and announces the winner
         * @author Quinlan McNellen
         * 2016/03/29
         * v0.0.2
         */
        //declare version number
        final String VERSION = "v0.0.2";
        
        //declare variables
        int dieA;
        int dieB;
        int human;
        int computer;
        String choice;
        boolean playAgain = true;
        
        //declare input scanner
        Scanner scan = new Scanner(System.in);
        
        //print version
        System.out.println("DiceCompetition " + VERSION);
        
        //begin game loop
        while (playAgain == true) {
            //get human score
            dieA = (int)(Math.random() * 6) + 1;
            dieB = (int)(Math.random() * 6) + 1;
            
            human = dieA + dieB;
            
            //get computer score
            dieA = (int)(Math.random() * 6) + 1;
            dieB = (int)(Math.random() * 6) + 1;
            
            computer = dieA + dieB;
            
            //compare scores and decide winner
            if (human > computer) {
                System.out.println("User wins!");
            } else if (human < computer) {
                System.out.println("Computer wins!");
            } else if (human == computer) {
                System.out.println("Tie!");
            } 
            
            boolean invalid = true;
            
            //replay loop
            while (invalid == true) {
                //ask if the user wants to play again
                System.out.print("Play again? (y/n) ");
                choice = scan.nextLine();
            
                if (choice.equalsIgnoreCase("y")) {
                    playAgain = true;
                    invalid = false;
                } else if (choice.equalsIgnoreCase("n")) {
                    playAgain = false;
                    invalid = false;
                } else {
                    //ask again if an invalid response is parsed
                    invalid = true;
                    System.out.println("Enter y or n ONLY");
                }
            }
        } scan.close(); //close input scanner
        System.out.println("Goodbye!"); //print exit message
    }
}