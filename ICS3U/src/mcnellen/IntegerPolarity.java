package mcnellen;

import java.util.Scanner;

public class IntegerPolarity {
    
    public static void main(String[] args) {
        
        final String VERSION = "v0.0.1";
        
        int integer;
        String polarity;
        boolean divisible;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("IntegerPolarity " + VERSION);
        System.out.print("Enter Integer: ");
        integer = Integer.parseInt(scan.nextLine());
        
        scan.close();
        
        if (integer > 0) {
            polarity = "positive";
        } else if (integer < 0) {
            polarity = "negative";
        } else if (integer == 0) {
            polarity = "zero";
        } else {
            polarity = "invalid";
        }
        
        if ((integer % 7) == 0) {
            divisible = yes;
        } else if ((integer % 7) >= 1) {
            divisible = no;
        } 
        
        System.out.println("Integer is " + polarity);
        System.out.println("Divisible by 7: " + divisible);
    }
}