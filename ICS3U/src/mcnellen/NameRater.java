package mcnellen;

import java.util.Scanner;

public class NameRater {
    
    public static void main(String[] args) {
        /* QuadraticFormula.java
         * This program takes the user's name and randomly decides it's opinion of it
         * @author Quinlan McNellen
         * 2016/03/23
         * v0.0.2
         */
        //set version number
        final String VERSION = "v0.0.2";
        
        //declare variables
        String name;
        String ratingText;
        int rating;
        
        //declare input scanner
        Scanner scan = new Scanner(System.in);
        
        //output query and store input
        System.out.println("NameRater " + VERSION);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        //close input scanner
        scan.close();
        
        //randomly generate rating
        rating = (int)(Math.random() * 10) + 1;
        
        //decide opinion based on rating
        if (rating >= 1 && rating <= 3) {
            ratingText = "I hate that";
        } else if (rating >= 4 && rating <= 10) {
            ratingText = "That's my favourite";
        } else {
            ratingText = "It's so bad it broke this program, that";
        }
        
        //output opinion of name
        System.out.println(name + "? " + ratingText + " name!");
    }
}