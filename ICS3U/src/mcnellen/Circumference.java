package mcnellen;

import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        /* Circumference.java
         * This program calculates the circumference of a circle from the radius
         * @author Quinlan McNellen
         * 2016/03/08
         * v0.0.3
         */
        
        //Declare integer radius
        double radius;
        //Declare integer circumference
        double circumference;
        //Declare input scanner
        Scanner scan = new Scanner(System.in);
        //Print prompt for the radius value
        System.out.println("Radius: ");
        //Read the value from the user
        radius = Double.parseDouble(scan.nextLine());
        scan.close();
        //Calculate circumference
        circumference = (3.14 * radius * 2);
        //Print the output value
        System.out.print("Circumference: ");
        System.out.println(circumference);       
    }
}