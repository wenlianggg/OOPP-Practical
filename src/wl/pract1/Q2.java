package wl.pract1;

import java.util.Scanner;

public class Q2 {
	private static Scanner in = new Scanner(System.in);
	/**
	  Prompts a user to enter a value in a given range until the user
	  provides a valid input.
	  @param low the low end of the range
	  @param high the high end of the range
	  @return the value provided by the user
	*/
	public static int readValueBetween(int low, int high) {
		int input;
		do {
			System.out.print("Enter between " + low + " and " + high + ": ");
			input = in.nextInt();
		} while (input < low || input > high);
		return input;
	}
	/**
	 * Reads a floating-point value from input and returns its value
	 * 
	 * @param prompt the prompt string
	 * @return the floating point number the user enters after the prompt
	 */
	public static double readDouble(String prompt) {
		System.out.println(prompt + " ");
		return in.nextDouble();
	}
	
	public static String readString(String prompt) {
		System.out.println(prompt);
		return in.next();
	}
	
	public static double readDoubleBetween(double max, double min) {
		double input = 0;
		do {
			System.out.println("Enter an input value between " + min + " and " + max);
			input = in.nextDouble();
		} while (input <= max && input >= min);
		return input;
	}
	// Can add readString
	// Can add readDoubleBetween
	// Can add readDoubleGreaterTan
	// Can add readValueGreaterThan
	// etc...

	public static void main(String[] args) {
		int hours = Q2.readValueBetween(1, 12);
		int minutes=Q2.readValueBetween(0, 59);
		// Output
		System.out.println(hours + ":" + minutes);
	}
}
