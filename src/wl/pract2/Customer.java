package wl.pract2;

public class Customer {
	private String custId = null;
	private String name = null;
	private boolean defConsUsed;
	
	public Customer() {
		defConsUsed = true;
	}
	
	public Customer(String c, String n) {
		custId = c;
		name = n;
		defConsUsed = false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return custId;
	}
	
	public boolean setName(String n) {
		name = n;
		return true;
	}
	
	public boolean setId(String c) {
		custId = c;
		return true;
	}
	
	public boolean print() {
		System.out.print("== Customer object ");
		System.out.println((defConsUsed == true) ? "instantiated using default constructor ==" : "created using non-default constructor ==");
		System.out.println("Customer ID: " + custId);
		System.out.println("Customer Name: " + name);
		return true;
	}
}
