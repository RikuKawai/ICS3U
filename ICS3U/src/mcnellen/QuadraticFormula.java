package mcnellen;

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticFormula {
    
    public static void main(String[] args) {
        /* QuadraticFormula.java
         * This program takes the values of a quadratic equation and solves for X 
         * @author Quinlan McNellen
         * 2016/03/10
         * v0.0.3
         */
         //set version number
         final String VERSION = "v0.0.3";
         
         //declare variables
         double a;
         double b;
         double c;
         double x1;
         double x2;
         double discriminant;
         
         //declare formatting scheme
         DecimalFormat oneDecimal = new DecimalFormat ("###,##0.0");
         
         //declare input scanner
         Scanner scan = new Scanner(System.in);
         
         //output queries and parse input
         System.out.println("QuadraticFormula " + VERSION);
         System.out.print("Value of A: ");
         a = Double.parseDouble(scan.nextLine());
         System.out.print("Value of B: ");
         b = Double.parseDouble(scan.nextLine());
         System.out.print("Value of C: ");
         c = Double.parseDouble(scan.nextLine());
         
         //close input scanner
         scan.close();
         
         //calculate values
         discriminant = Math.sqrt(Math.pow(b,2)-(4*a*c));
         x1 = ((-b)+discriminant)/(2*a);
         x2 = ((-b)-discriminant)/(2*a);
         
         //print output
         System.out.println("X = " + oneDecimal.format(x1));
         System.out.println("X = " + oneDecimal.format(x2));
    }
}