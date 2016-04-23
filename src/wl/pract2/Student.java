package wl.pract2;

import java.util.GregorianCalendar;

public class Student {
	// Attributes of Student
	private String name;
	private char gender;
	private double mark;
	private GregorianCalendar date;

	// Constructor
	public Student(String name, char gender) {
		this.name = name;
		this.gender = gender;
		this.date = new GregorianCalendar();
	}

	// Accessor & Mutator methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	// User defined or service method
	public void view() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Marks: " + mark);
		System.out.print("Enrolment Date: " + date.get(GregorianCalendar.DAY_OF_MONTH) + "-" + date.get(GregorianCalendar.MONTH) + "-" + date.get(GregorianCalendar.YEAR));
	}
}
