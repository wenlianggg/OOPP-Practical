package wl.pract1;

import java.util.Scanner;

public class Q5 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int monthstolive = 1;
		System.out.print("Enter starting account balance (S$): ");
		double balance = sc.nextDouble();
		System.out.print("Enter compound interest per month (%): ");
		double interest = sc.nextDouble();
		System.out.print("Enter expense per month (S$): ");
		double expense = sc.nextDouble();
		while (balance - expense > 0) {
			balance -=expense;
			balance = ((100.0 + interest)/100.0 * balance);
			if (balance < 0) {
				break;
			}
			monthstolive++;
		}
		System.out.print("The account will be completely depleted in " + monthstolive + " months.");
	}
}
