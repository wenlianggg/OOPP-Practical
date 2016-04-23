package wl.pract3a;

public class Student {
	String name;
	int tscore;
	int testtaken;
	// Constructor Method
	public Student(String name, int tscore, int testtaken) {
		this.name = name;
		this.tscore = tscore;
		this.testtaken = testtaken;
	}
	
	// Other Methods
	public boolean addQuiz(int score) {
		this.testtaken++;
		this.tscore+=score;
		return true;
	}
	
	public double getAverageScore() {
		return (double)this.tscore / this.testtaken;
	}
	
	// Mutator Methods
	public boolean setName(String name) {
		this.name = name;
		return true;
	}
	
	public boolean settScore(int tscore) {
		this.tscore = tscore;
		return true;
	}
	
	public boolean setTesttaken(int testtaken) {
		this.testtaken = testtaken;
		return true;
	}
	
	// Accessor Methods
	public String getName() {
		return this.name;
	}
	
	public int getTotalScore() {
		return this.tscore;
	}
	
	public int getTesttaken() {
		return this.testtaken;
	}
}
