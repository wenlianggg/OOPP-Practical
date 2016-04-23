package wl.pract1;

import java.util.Scanner;

public class Q3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter your grade: ");
		System.out.println(convertToNumberGrade(sc.next().toUpperCase().charAt(0)));
	}
	public static int convertToNumberGrade(char grade) {
		int gradepoint;
		do {
			switch (grade) {
			case 'A':
				gradepoint = 4;
				break;
			case 'B':
				gradepoint = 3;
				break;
			case 'C':
				gradepoint = 2;
				break;
			case 'D':
				gradepoint = 1;
				break;
			case 'F':
				gradepoint = 0;
				break;
			default:
				gradepoint = -1;
				break;
			}
		} while (gradepoint == -1);
		return gradepoint;
	}
}