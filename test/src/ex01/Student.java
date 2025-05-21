package ex01;

public class Student {
	String name;
	int age;
	String number;
	
	public Student(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
		
	}

	public void StudentInfo() {
	
		System.out.println("이름 : "+name+", 나이 : "+ age+", 학번 : "+number);
	}

	
	
}
