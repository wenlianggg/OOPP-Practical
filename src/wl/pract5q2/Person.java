package wl.pract5q2;

public class Person {

	private String name, nric;

	Person(String name, String nric) {
		this.name = name;
		this.nric = nric;
	}
	
	public void view() {
		System.out.println("Name: " + name);
		System.out.println("NRIC: " + nric);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNric(String nric) {
		this.nric = nric;
	}
}
