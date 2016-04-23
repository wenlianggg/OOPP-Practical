package wl.pract2;

public class CustomerApp {
	public static void main(String[] args) {
		Customer[] cm = new Customer[2];
		cm[0] = new Customer();
		cm[1] = new Customer("1234567", "Ms Phoon");
		cm[0].print();
		cm[1].print();
	}
}
