package wl.pract2;

import java.text.DecimalFormat;

public class Stock {
	String symbol;
	String name;
	double openingPrice;
	double currentPrice;
	
	public Stock(String s, String n, double op, double cp) {
		symbol = s.toUpperCase();
		name = n.toUpperCase();
		openingPrice = op;
		currentPrice = cp;
	}
	
	public Stock() {
		
	}
	
	public boolean setSymbol(String s) {
		symbol = s;
		return true;
	}
	
	public boolean setName(String n) {
		name = n;
		return true;
	}
	
	public boolean setOpeningPrice(double op) {
		openingPrice = op;
		return true;
	}
	
	public boolean setCurrentPrice(double cp) {
		currentPrice = cp;
		return true;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public double getOpeningPrice() {
		return openingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public double calPercentchange() {
		DecimalFormat dp3 = new DecimalFormat("0.###");
		double pctchg = ((currentPrice - openingPrice) / openingPrice) * 100;
		if (pctchg < 0) {
			System.out.println("A drop of " + dp3.format(-pctchg) + " percent.");
		} else if (pctchg > 0) {
			System.out.println("An increase of " + dp3.format(pctchg) + " percent.");
		} else {
			System.out.println("No change!");
		}
		return pctchg;
	}
}