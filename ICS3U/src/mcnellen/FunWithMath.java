package mcnellen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunWithMath {

	public static void main(String[] args) throws IOException {
		/*
		 * FunWithMath.java
		 * This program accepts two integers from the user and then adds, subtracts, multiplies, and divides them
		 * @author Quinlan McNellen
		 * 2016/05/20
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //read two integers
		String[] tokens = in.readLine().split(" ");
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		add(num1, num2); subtract(num1, num2); multiply(num1, num2); divide(num1, num2); //call methods
	}
	public static void add(int x, int y) { //add two integers and print the sum
		System.out.println(x+y);
	}
	public static void subtract(int x, int y) { //subtract two integers and print the sum
		System.out.println(x-y);
	}
	public static void multiply(int x, int y) { //multiply two integers and print the product
		System.out.println(x*y);
	}
	public static void divide(int x, int y) { //divide two integers and print the product
		System.out.println(x/y);
	}

}
