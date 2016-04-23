package wl.mocktest;

import java.util.Scanner;

public class UserApp {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter user ID: ");
		String id = sc.nextLine();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		User usr = new User(id, name);
		System.out.println("Name of user is " + usr.getName());
		System.out.println("========================");
		Student stu = new Student(id, name, "ITDF11", 1250.30);
		stu.show();
		System.out.println("========================");
		Lecturer lec = new Lecturer(id, name, "102", 9123.03);
		lec.show();
		System.out.println("========================");
	}
}
