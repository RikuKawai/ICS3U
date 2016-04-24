package mcnellen;

import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		/* NameList.java
         * This program reads a list of names of a user defined length, then prints it as it was input and in reverse order
         * @author Quinlan McNellen
         * 2016/04/24
         * v0.2
         */
		
		//set version number
		final String VERSION = "v0.2";
		
		//declare input scanner
		Scanner scan = new Scanner(System.in);
		
		//input parsing
		System.out.println("NameList " + VERSION);
		System.out.print("Please specify the number of names: "); //ask for the length of the array
		int numberOfNames = Integer.parseInt(scan.nextLine());
		String[] name = new String[numberOfNames]; //create array of desired length
		
		System.out.println("Enter names");
		for (int i = 0; i<numberOfNames; i++) { //fill array with names
			System.out.print("Name " + (i+1) + ": ");
			name[i] = scan.nextLine();
		}
		scan.close(); //close scanner
		listNames(name); //call method to print the list of names
	}
	public static void listNames(String[] a) {
		int x = a.length - 1;
		for (int i = 0; i<=x; i++) {
			System.out.println(a[i]); //print in original order
		}
		for (int i = x; i>=0; i--) {
			System.out.println(a[i]); //print in reverse order
		}
	}
}
