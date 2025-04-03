package ex01_Collections;

public class Student {
	private String name;
	private int totalScore=0;
	private int subjectCount=0;
	
	public void addScore(int score) {
		totalScore += score;
		subjectCount++;
	}

	
	public String getName() {
		return name;
	}


	public Student(String name) {
		this.name = name;
	}


	public double getAverage() {
		if(subjectCount==0){
			return 0;
		}
		double avg = totalScore/subjectCount;
		return avg;
	}

	
}
