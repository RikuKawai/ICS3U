package mcnellen;

import java.util.Scanner;

public class IntegerPolarity {
    
    public static void main(String[] args) {
        /* IntegerPolarity.java
         * This program takes an integer and determines if it is positive/negative and if it is cleanly divisible by 7
         * @author Quinlan McNellen
         * 2016/03/22
         * v0.0.2
         */
         //set version number
        final String VERSION = "v0.0.2";
        
        //declare and initialize variables
        int integer;
        String polarity;
        boolean divisible = true;
        
        //declare input scanner
        Scanner scan = new Scanner(System.in);
        
        //output queries and parse input
        System.out.println("IntegerPolarity " + VERSION);
        System.out.print("Enter Integer: ");
        integer = Integer.parseInt(scan.nextLine());
        
        //close input scanner
        scan.close();
        
        //check if number is positive or negative
        if (integer > 0) {
            polarity = "positive";
        } else if (integer < 0) {
            polarity = "negative";
        } else if (integer == 0) {
            polarity = "zero";
        } else {
            polarity = "invalid";
        }
        
        //check if number is cleanly divisible by 7
        if ((integer % 7) == 0) {
            divisible = true;
        } else if ((integer % 7) >= 1) {
            divisible = false;
        } 
        
        //output results
        System.out.println("Integer is " + polarity);
        System.out.println("Divisible by 7: " + divisible);
    }
}