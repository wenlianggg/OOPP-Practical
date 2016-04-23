package wl.mocktest;

public class Lecturer extends User {
	
	private String roomNo;
	private double salary;
	
	Lecturer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	
	Lecturer(String id, String name, String roomNo, double salary) {
		super(id, name);
		this.roomNo = roomNo;
		this.salary = salary;
	}
	
	public void show() {
		super.show();
		System.out.println("Room Number: " + this.roomNo);
		System.out.println("Salary: $" + this.salary);
	}


	public String getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
