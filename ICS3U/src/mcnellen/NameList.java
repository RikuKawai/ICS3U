package mcnellen;

import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		
		final String VERSION = "v0.1";
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfNames;
		
		System.out.println("NameList " + VERSION);
		System.out.print("Please specify the number of names: ");
		numberOfNames = Integer.parseInt(scan.nextLine());
		String[] name = new String[numberOfNames];
		
		System.out.println("Enter names");
		for (int i = 0; i<numberOfNames; i++) {
			System.out.print("Name " + (i+1) + ": ");
			name[i] = scan.nextLine();
		}
		scan.close();
		listNames(name);
	}
	public static void listNames(String[] a) {
		int x = a.length - 1;
		for (int i = 0; i<=x; i++) {
			System.out.println(a[i]);
		}
		for (int i = x; i>=0; i--) {
			System.out.println(a[i]);
		}
	}
}
