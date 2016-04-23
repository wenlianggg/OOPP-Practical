package wl.pract3b;

import wl.pract3a.ClassA;

public class ClassC {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		System.out.println("a : " + ca.a); // - Public (Visible to the world)
		System.out.println("b : " + ca.getB()); // - Protected (Only visible by subclass)
		System.out.println("c : " + ca.getC()); // - Default (Only visible within package)
		System.out.println("d : " + ca.getD()); // - Private (Only visible by itself)
		// b, c and d are not directly visible because they are not public
		// Can be resolved if public accessor methods are used.
	}
}
