package wl.pract1;

import java.util.Scanner;

public class Q1 {
	private static Scanner sc;
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000;
		System.out.print(duration);
	}
	
	public double readDouble(String prompt) {


		System.out.print(prompt);
		sc = new Scanner(System.in);
		double value = sc.nextDouble();
		return value;
	}
}
