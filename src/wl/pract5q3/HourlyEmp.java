package wl.pract5q3;

public class HourlyEmp extends Employee {
	double rate;
	int hoursWorked;
	public HourlyEmp(String name, String empId, double rate, int hoursWorked) {
		super(name, empId);
		this.rate = rate;
		this.hoursWorked = hoursWorked;
	}

	public String getEmpId() {
		return super.getEmpId();
	}
	
	public String getName() {
		return super.getName();
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double calSalary() {
		if (hoursWorked < 160) {
			return (hoursWorked * 12);
		} else {
			return (160 * rate) + (hoursWorked-160 * rate);
		}
	}
	
	public void view() {
		System.out.println("Hourly Employee Name: " + super.getName());
		System.out.println("Employee ID:" + super.getEmpId());
		System.out.println("Monthly Salary: " + this.calSalary()/12);
		System.out.println();
	}
}
