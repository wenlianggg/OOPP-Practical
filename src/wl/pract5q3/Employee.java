package wl.pract5q3;

public abstract class Employee {
	private String name;
	String empId;
	public Employee(String name, String empId) {
		this.name = name;
		this.empId = empId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmpId() {
		return this.empId;
	}
	
}
