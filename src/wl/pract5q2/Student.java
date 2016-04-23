package wl.pract5q2;

public class Student extends Person{
	private String adminNo;
	private double testMark, examMark;
	
	Student(String name, String nric, String adminNo, double testMark, double examMark) {
		super(name, nric);
		this.adminNo = adminNo;
		this.testMark = testMark;
		this.examMark = examMark;
	}
	
	public void view() {
		super.view();
		System.out.println("Admin Number: " + this.adminNo);
		System.out.println("Test Mark: " + this.testMark);
		System.out.println("Exam Mark: " + this.examMark);
		System.out.println("Final Mark: " + computeFinalMark());

	}
	
	public double computeFinalMark() {
		return (this.testMark/2 + this.examMark/2);
	}
	
	public String getAdminNo() {
		return this.adminNo;
	}
	
	public double getTestMark() {
		return this.testMark;
	}
	
	public double getExamMark() {
		return this.examMark;
	}
	
	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}
	
	public void setTestMark(double testMark) {
		this.testMark = testMark;
	}
	
	public void setExamMark(double examMark) {
		this.examMark = examMark;
	}

}
