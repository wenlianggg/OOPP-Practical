package wl.mocktest;

import java.util.ArrayList;

public class UserMain {
	public static void main(String[] args) {
		// Declaring an arraylist of type User
		ArrayList<User> usrarr = new ArrayList<User>();
		// Temorary hold on user objects
		Student s1 = new Student("1001", "Mary Lim","ITDF01",1800.0);
		Student s2 = new Student("1002", "Peter Pan","ITDF02",1200.0);
		Lecturer e1 = new Lecturer("1003","John Ang", "#305", 7500);
		Lecturer e2 = new Lecturer("1004","Joe Tay", "#401", 6000);
		// Add the student and lecturer objects into the ArrayList
		usrarr.add(s1);
		usrarr.add(s2);
		usrarr.add(e1);
		usrarr.add(e2);
		// Write a for loop to display the information on screen
		for(User u : usrarr) {
			u.show();
			System.out.println("==============================");
		}
		System.out.println("Average Salary: $" + computeAverageSalary(usrarr));
	}
	
	public static double computeAverageSalary(ArrayList<User> l) {
		int lecCount = 0;
		double total = 0;
		for (User u : l) {
			if (u instanceof Lecturer) {
				lecCount++;
				total+=((Lecturer)u).getSalary();
			}
		}
		return total / lecCount;
	}
}
