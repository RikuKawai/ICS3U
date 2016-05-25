package mcnellen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunWithMath2 {

	public static void main(String[] args) throws IOException {
		/**
		 * FunWithMath2.java
		 * This program accepts two integers from the user and then adds, subtracts, multiplies, and divides them
		 * @author Quinlan McNellen
		 * 2016/05/24
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //read two integers
		String[] tokens = in.readLine().split(" ");
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		//call methods
		System.out.println(add(num1, num2));
		System.out.println(subtract(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(divide(num1, num2));
	}
	/**
	 * add two integers and return the sum
	 * @param	x	first number
	 * @param	y	second number
	 * @return	sum of x and y
	 */
	public static int add(int x, int y) { 
		return(x+y);
	}
	/**
	 * subtract two integers and return the sum
	 * @param	x	first number
	 * @param	y	second number
	 * @return	sum of x and y
	 */
	public static int subtract(int x, int y) { 
		return(x-y);
	}
	/**
	 * multiply two integers and return the product
	 * @param	x	first number
	 * @param	y	second number
	 * @return	product of x and y
	 */
	public static int multiply(int x, int y) { 
		return(x*y);
	}
	/**
	 * divide two integers and return the product
	 * @param	x	first number
	 * @param	y	second number
	 * @return	product of x and y
	 */
	public static int divide(int x, int y) { 
		return(x/y);
	}

}
