package wl.pract4;

import java.util.ArrayList;
import java.util.Scanner;

import wl.pract2.Stock;

public class Q2Recursion {
	private static Scanner sc = new Scanner(System.in);
	private static Scanner sn = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Stock> stock = new ArrayList<Stock>();
		addElement(false, stock);
		System.out.println("\n====== RESULTS =======");
		for (int i = 0; i < stock.size(); i++) {
			System.out.println(stock.get(i).getSymbol() + ", " + stock.get(i).getName());
			stock.get(i).calPercentchange();
		}
	}
	public static boolean addElement(boolean toQuit, ArrayList<Stock> stock) {
		if (toQuit == true)
			return true;
		System.out.print("Enter symbol: ");
		String symbol = sc.next();
		if (symbol.equalsIgnoreCase("QUIT")) {
			toQuit = true;
		} else {
			System.out.print("Enter name: ");
			String name = sn.nextLine();
			System.out.print("Enter opening price: ");
			double op =sc.nextDouble();
			System.out.print("Enter closing price: ");
			double cp = sc.nextDouble();
			stock.add(new Stock(symbol, name, op, cp));
			System.out.print("\n");
		}
		return toQuit = addElement(toQuit, stock);
	}
	
}
