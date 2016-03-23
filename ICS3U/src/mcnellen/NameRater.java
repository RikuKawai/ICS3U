package mcnellen;

import java.util.Scanner;

public class NameRater {
    
    public static void main(String[] args) {
        
        final String VERSION = "v0.0.1"
        
        String name;
        String ratingText;
        int rating;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("NameRater " + VERSION);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        scan.close();
        
        rating = (int)(Math.random() * 10) + 1;
        
        if (rating >= 1 && rating <= 3) {
            ratingText = "I hate that";
        } else if (rating >= 4 && rating <= 10) {
            ratingText = "That's my favourite";
        } else {
            ratingText = "It's so bad it broke this program, that";
        }
        
        System.out.println(name + "? " + ratingText + " name!");
    }
}