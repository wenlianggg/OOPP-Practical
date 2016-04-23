package wl.pract6q2;
import java.util.ArrayList;
/**
 * Sample codes to demonstrate that methods can be quite similar
 * but situations or input data are different.
 */
public class PersonMain {
	/**
	 * A static method to take in an ArrayList of students and
	 * search for the student with the highest final marks.
	 * 
	 * @param name
	 *            ArrayList of Student
	 * @param salary
	 *            Student object
	 */
	public static Student getTopStudent(ArrayList<Student> pList){
		Student top = pList.get(0);
		for (Student s : pList){
			if (s.computeFinalMark() > top.computeFinalMark())
				top = s;
		}
		return top;
	}
	
	public static Lecturer getTopLecturer(ArrayList<Lecturer> pList) {
		Lecturer top = pList.get(0);
		for (Lecturer l : pList){
			if (l.computeSalary() > top.computeSalary())
				top = l;
		}
		return top;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		ArrayList<Lecturer> lecList  = new ArrayList<Lecturer>();

		sList.add(new Student("1231234A", "Tan Mei Mei", "120101A"));
		sList.get(0).setTestMark(30);
		sList.get(0).setExamMark(100);
		
		sList.add(new Student("4455667B", "Joel Tan", "121234B"));
		sList.get(1).setTestMark(50);
		sList.get(1).setExamMark(72);
		
		sList.add(new Student("9412345C", "Ang Sin Chin", "120003C"));
		sList.get(2).setTestMark(50);
		sList.get(2).setExamMark(100);
		
		lecList.add(new Lecturer("1234567A", "Phoon Lee Kien", "1234A"));
		lecList.get(0).setTotalTeachingHr(30);
		
		lecList.add(new Lecturer("7654321B", "Andrea Tan", "5678B"));
		lecList.get(1).setTotalTeachingHr(40);
		
		lecList.add(new Lecturer("1122334C", "Aloysious Thong", "1212C"));
		lecList.get(2).setTotalTeachingHr(20);
		
		lecList.add(new Lecturer("7897890D", "Lim Soo Khim", "8899D"));
		lecList.get(3).setTotalTeachingHr(15);
		
		
		Student stutop = getTopStudent(sList);
		System.out.print("Top student is " + stutop.getName());
		System.out.println(" with " + stutop.computeFinalMark() + " marks.");
		Lecturer lectop = getTopLecturer(lecList);
		System.out.print("Top student is " + lectop.getName());
		System.out.println(" with a pay of $" + lectop.computeSalary() + ".");
		// Using the same approach, add another static method to 
		// search for the lecturer who earns the highest salary.
	}

}
