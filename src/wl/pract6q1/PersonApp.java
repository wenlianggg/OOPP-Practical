package wl.pract6q1;

import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] args) {
		ArrayList<Lecturer> lect = new ArrayList<Lecturer>();
		lect.add(new Lecturer("1234567A", "Phoon Lee Kien", "1234D"));
		lect.get(0).setTotalTeachingHr(30);     
		lect.get(0).view();
		
		lect.add(new Lecturer("1234567A", "Tay Siew Fong", "1234D"));
		lect.get(1).setTotalTeachingHr(30);     
		lect.get(1).view();
		
		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(new Student("S1696969A", "Bob Ho", "161100A"));
		stud.get(0).setTestMark(30);
		stud.get(0).setExamMark(50);
		stud.get(0).view();
		
		stud.add(new Student("S1123456B", "Wen Liang", "151515F"));
		stud.get(1).setTestMark(40);
		stud.get(1).setExamMark(60);
		stud.get(1).view();
		
		stud.add(new Student("S1989898B", "Tan John", "160101F"));
		stud.get(2).setTestMark(50);
		stud.get(2).setExamMark(70);
		stud.get(2).view();
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.addAll(lect);
		people.addAll(stud);
		
		System.out.println(calAvgMark(people));
	}
	
	public static double calAvgMark(ArrayList<Person> people) {
		double total = 0, numberof = 0;
		for (Person p : people) {
			if (p instanceof Student) {
				numberof++;
				total+=((Student)p).computeFinalMark();
			}
		}
		return total/numberof;
	}
}
