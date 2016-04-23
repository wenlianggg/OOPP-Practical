package wl.pract5q1;

public class PersonApp {
	
	public static void main(String[] args) {
		Lecturer lec = new Lecturer();
		lec.setName("Tay Siew Fong");
		lec.setNric("S1234567D");
		lec.setStaffId("TAYSF");
		lec.setTotalTeachingHour(100);
		lec.view();
		System.out.println("\n");
		Student stu = new Student();
		stu.setName("James Escabas");
		stu.setNric("S9876543A");
		stu.setAdminNo("153455A");
		stu.setExamMark(99);
		stu.setTestMark(1);
		stu.view();
	}

}
