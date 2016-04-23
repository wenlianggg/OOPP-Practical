package wl.pract4;

import java.util.ArrayList;

public class Q1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random()*10);
			al.add(random);
		}
		for (int i = 0; i < al.size(); i+=2) {
			System.out.print(al.get(i) + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				System.out.print(al.get(i) + " ");
			}
		}
		System.out.print("\n");
		for (int i = al.size()-1; i >= 0; i--) {
			System.out.print(al.get(i) + " ");
		}
		System.out.print("\n");
		System.out.print(al.get(0) + " " + al.get(al.size() - 1));
	}
}