
package wl.pract2;

import java.util.Scanner;

public class Q1 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the phone number to be formatted: +");
		String full = sc.next();
		System.out.println("(+" + full.substring(0, 2) + ") " + full.substring(2, 6) + " " + full.substring(6, 10));
	}
}