package wl.mocktest;

public class Student extends User {
	private String courseCode;
	private double schoolFee;
	
	Student(String id, String name) {
		super(id, name);
	}
	
	Student(String id, String name, String courseCode, double schoolFee) {
		super(id, name);
		this.courseCode = courseCode;
		this.schoolFee = schoolFee;
	}

	public void show() {
		super.show();
		System.out.println("Course Code: " + this.courseCode);
		System.out.println("School Fees: " + this.schoolFee);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public double getSchoolFee() {
		return schoolFee;
	}

	public void setSchoolFee(double schoolFee) {
		this.schoolFee = schoolFee;
	}

}
