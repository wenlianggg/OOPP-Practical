package wl.pract5q2;

public class PersonApp {
	
	public static void main(String[] args) {
		Lecturer lec = new Lecturer("Tay Siew Fong", "S1234567D", "TAYSF", 100);
		lec.view();
		System.out.println();
		Student stu = new Student("James Escabas", "S9876543A", "153455A", 99, 1);
		stu.view();
	}

}
