package mcnellen;

import java.util.Scanner;

public class ArithmeticExpressions {
    
    public static void main(String[] args) {
        /* ArithmeticExpressions.java
         * This program applies various operations to five input numbers
         * @author Quinlan McNellen
         * 2016/03/09
         * v0.0.1
         */
         final String VERSION = "v0.0.1";
         
         int num1;
         int num2;
         int num3;
         int num4;
         int num5;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("ArithmeticExpressions " + VERSION);
         System.out.print("Number 1: ");
         num1 = Integer.parseInt(scan.nextLine());
         System.out.print("Number 2: ");
         num2 = Integer.parseInt(scan.nextLine());
         System.out.print("Number 3: ");
         num3 = Integer.parseInt(scan.nextLine());
         System.out.print("Number 4: ");
         num4 = Integer.parseInt(scan.nextLine());
         System.out.print("Number 5: ");
         num5 = Integer.parseInt(scan.nextLine());
         
         scan.close();
         
         System.out.println("Sum of 5 numbers is " + (int)((num1+num2+num3+num4+num5)));
         System.out.println("2nd subtracted from 3rd " + (int)((num3-num2)));
         System.out.println("Product of 1st and 5th number " + (int)((num1*num5)));
         System.out.println("Quotient of 4th divided by 2nd " + (int)((num4/num2)));
         System.out.println("Remainder of 4th divided by 2nd " + (int)((num4%num2)));
         System.out.println("1st to the power of 3rd " + (int)(Math.pow(num1,num3)));
         System.out.println("Square root of the 5th " + (int)(Math.sqrt(num5)));
    }
}