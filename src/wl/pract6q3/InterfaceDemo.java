package wl.pract6q3;

import java.util.ArrayList;
/**
 * This program demonstrates the power of polymorphism by writing a reusable method 
 * to process objects from different classes.
 */
public class InterfaceDemo {
	/**
	 * A static method to take in an ArrayList of type Measurable
	 * (ie, the class must implement Measurable) to
	 * search for the object with the highest measurable attribute.
	 * 
	 * @param name
	 *            ArrayList of Measurable objects
	 * @param salary
	 *            Measurable obejct
	 */
	public static Measurable getTop(ArrayList<Measurable> mList){
		Measurable top = mList.get(0);
		for (Measurable temp : mList){
			if (temp.getMeasure() > top.getMeasure())
				top = temp;
		}
		return top;
	}
	public static void main(String[] args){
		ArrayList<Measurable> list = new ArrayList<Measurable>(); 
	
		Student stud1 = new Student("1231234A", "Tan Mei Mei", "120101A");
		stud1.setTestMark(30);
		stud1.setExamMark(100);
		list.add(stud1);
		
		Student stud2 = new Student("4455667B", "Joel Tan", "121234B");
		stud2.setTestMark(50);
		stud2.setExamMark(72);
		list.add(stud2);
		
		Student stud3 = new Student("9412345C", "Ang Sin Chin", "120003C");
		stud3.setTestMark(50);
		stud3.setExamMark(100);
		list.add(stud3);
		
		Measurable m = getTop(list);
		((Student)m).view();
		
		// To clear the ArrayList
		list.clear();
		
		// Optional: You may want to do the same for Lecturer to 
		// see if you understand the concept of polymorphism via interface
	}

}