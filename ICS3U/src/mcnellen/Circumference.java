package mcnellen;

public class Circumference {

    public static void main(String[] args) {
        /* Circumference.java
         * This program calculates the circumference of a circle from the radius
         * @author Quinlan McNellen
         * 2016/03/08
         */
        
        //Declare integer radius
        int radius;
        //Declare integer circumference
        int circumference;
        //Declare input scanner
        Scanner scan = new Scanner(System.in);
        //Print prompt for the radius value
        System.out.println("Radius: ");
        //Read the value from the user
        radius = scan.nextLine();
        //Calculate circumference
        circumference = (3.14 * radius * 2);
        //Print the output value
        System.out.print("Circumference: ");
        System.out.println(circumference);       
    }
}