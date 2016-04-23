package wl.pract5q1;

public class Lecturer extends Person {

	private String staffId;
	private double totalTeachingHour;
	
	public void view() {
		super.view();
		System.out.println("Staff ID: " + this.staffId);
		System.out.println("Total Teaching Hours: " + this.totalTeachingHour);
		System.out.println("Total Lecturer Salary: $" + computeSalary());
	}
	
	public String getStaffId() {
		return this.staffId;
	}
	
	public double getTotalTeachingHour() {
		return this.totalTeachingHour;
	}
	
	
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	public void setTotalTeachingHour(double totalTeachingHour) {
		this.totalTeachingHour = totalTeachingHour;
	}
	
	public double computeSalary() {
		return this.totalTeachingHour * 90.0;
	}

}
