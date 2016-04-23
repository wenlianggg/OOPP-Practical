package wl.pract4;

import java.util.ArrayList;
import java.util.Scanner;

import wl.pract2.Stock;

public class Q2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Stock> stock = new ArrayList<Stock>();
		for (int i = 0; i < 1; i = 0) {
			System.out.print("Enter symbol: ");
			String symbol = sc.next();
			if (symbol.equalsIgnoreCase("QUIT"))
				break;
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter opening price: ");
			double op = sc.nextDouble();
			System.out.print("Enter closing price: ");
			double cp = sc.nextDouble();
			stock.add(new Stock(symbol, name, op, cp));
			System.out.print("\n");
		}
		System.out.println("\n====== RESULTS =======");
		for (int i = 0; i < stock.size(); i++) {
			System.out.println(stock.get(i).getSymbol() + ", " + stock.get(i).getName());
			stock.get(i).calPercentchange();
		}
	}
}
