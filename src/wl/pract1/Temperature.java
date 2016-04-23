package wl.pract1;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Temperature {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] temps = new double[13];
		System.out.print("Enter temperature for month " + DateFormatSymbols.getInstance().getMonths()[0] + ": ");
		temps[1] = sc.nextInt();
		temps[0] = 1;
		for (int i = 2; i < temps.length; i++) {
		System.out.print("Enter temperature for month " + DateFormatSymbols.getInstance().getMonths()[i-1] + ": ");
		temps[i] = sc.nextInt();
		if (temps[i] >= temps[0]) temps[0] = i;
	}
	System.out.println("The highest temperature is during the month of " + DateFormatSymbols.getInstance().getMonths()[(int) temps[0]-1]);
	
}
}
