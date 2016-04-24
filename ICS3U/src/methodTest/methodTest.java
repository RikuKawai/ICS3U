package methodTest;

import java.util.Scanner;

public class methodTest {
    
    public static int exponent;

	public static void main(String[] args) {
        ScanInput();
        System.out.println(exponent);
    }

	private static void ScanInput( ) {
        int numA;
        Scanner scan = new Scanner(System.in);
        AddInt addI = new AddInt();
        
        System.out.print("numA: ");
        numA = scan.nextInt();
        
        scan.close();
        
        addI.square(numA);
        System.out.println(exponent);
    }
}
