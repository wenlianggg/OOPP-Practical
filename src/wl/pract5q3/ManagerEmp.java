package wl.pract5q3;

public class ManagerEmp extends Employee {
	double salary, bonus;
	public ManagerEmp(String name, String empId, double salary, double bonus) {
		super(name, empId);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public double getBonus() {
		return this.bonus;
	}

	public String getEmpId() {
		return super.getEmpId();
	}
	
	public String getName() {
		return super.getName();
	}
	
	public double calSalary() {
		return (salary * 12) + this.bonus;
	}
	
	public void view() {
		System.out.println("Manager Name: " + super.getName());
		System.out.println("Employee ID:" + super.getEmpId());
		System.out.println("Monthly Salary: " + this.calSalary()/12);
		System.out.println();
	}
}
