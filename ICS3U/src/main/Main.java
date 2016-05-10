package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ICS3U - Quinlan McNellen");
		System.out.print("mcnellen\nmethodTest\nvectors");
		System.out.print("\nPick a package: ");
		
		String selectedPackage = scan.nextLine();
		
		if (selectedPackage.equalsIgnoreCase("mcnellen")) {
			System.out.println("Package: mcnellen");
			System.out.print("");
			System.out.print("\nPick a class: ");
			
		} else if (selectedPackage.equalsIgnoreCase("methodTest")) {
			System.out.println("Package: methodTest");
			System.out.print("methodTest");
			System.out.print("\nPick a class: ");
			
		} else if (selectedPackage.equalsIgnoreCase("vectors")) {
			System.out.println("Package: vectors");
			System.out.print("Vectors");
			System.out.print("\nPick a class: ");
		}
		
		scan.close();
	}

}
