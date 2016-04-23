package wl.pract5q3;

public class EmployeeApp {
	
	public static void main(String[] args) {
		ManagerEmp mgr = new ManagerEmp("Tan Cheng Suan", "122334A", 0, 0);
		SalariedEmp empl = new SalariedEmp("Tuan Cheng Suan", "122334A", 0);
		HourlyEmp hrly = new HourlyEmp("Tan Cheng Kuan", "122334A", 0, 0);
		mgr.view();
		empl.view();
		hrly.view();
	}

}
