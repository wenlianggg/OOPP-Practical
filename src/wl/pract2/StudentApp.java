package wl.pract2;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student ("Ms Phoon", 'F');
		System.out.println("=== First view ===");
		s.view();
		s.setMark(100);
		System.out.println("\n=== Second view ===");
		s.view();
	}

}
