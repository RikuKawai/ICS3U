package mcnellen;

import java.util.Scanner;

public class MothersAge {
    
    public static void main(String[] args) {
        /* MothersAge.java
         * This program determines how old a mother was when she gave birth to her children()
         * @author Quinlan McNellen
         * 2016/03/08
         * v0.0.1
         */
         final String VERSION = "v0.0.1";
         
         Scanner scan = new Scanner(System.in);
         String mothersName;
         String childsName;
         int mothersBirthYear;
         int childsBirthYear;
         int ageAtBirth;
         
         System.out.println("MothersAge " + VERSION);
         System.out.print("Mother\'s name: ");
         mothersName = scan.nextLine();
         System.out.print("Year of birth: ");
         mothersBirthYear = Integer.parseInt(scan.nextLine());
         System.out.print("Child\'s name: ");
         childsName = scan.nextLine();
         System.out.print("Year of birth: ");
         childsBirthYear = Integer.parseInt(scan.nextLine());
         scan.close();
         
         ageAtBirth = (childsBirthYear-mothersBirthYear);
         System.out.println(mothersName + " was " + ageAtBirth + " years old when " + childsName + " was born.");
    }
}