package wl.pract3a;

public class ClassB {
	public static void main(String[] args){
		ClassA ca = new ClassA();
		System.out.println("a : " + ca.a); // - Public (Visible to the world)
		System.out.println("b : " + ca.b); // - Protected (Only visible by subclass)
		System.out.println("c : " + ca.c); // - Default (Only visible within package)
		System.out.println("d : " + ca.getD()); // - Private (Only visible by itself) and has to use accessor methods
		// Can be resolved if public accessor methods are used.
	}
}
