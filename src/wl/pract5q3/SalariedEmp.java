package wl.pract5q3;

public class SalariedEmp extends Employee{
	double salary;
	public SalariedEmp(String name, String empId, double salary) {
		super(name, empId);
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getEmpId() {
		return super.getEmpId();
	}
	
	public String getName() {
		return super.getName();
	}

	public double calSalary() {
		return (salary * 12);
	}
	
	public void view() {
		System.out.println("Employee Name: " + super.getName());
		System.out.println("Employee ID:" + super.getEmpId());
		System.out.println("Monthly Salary: " + this.calSalary()/12);
		System.out.println();

	}
}
