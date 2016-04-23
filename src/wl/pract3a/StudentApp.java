package wl.pract3a;

public class StudentApp {
	public static void main(String[] args) {
		Student student = new Student("Wen Liang Goh", 500, 5);
		System.out.println(student.getAverageScore());
		student.addQuiz(90);
		System.out.println(student.getAverageScore());
		student.settScore(580);
		System.out.println(student.getAverageScore());
	}
}
