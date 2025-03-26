package ex05_inheritance;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {//void가 없으면 생성자 | 있으면 필드
		this.name = name;
		this.age = age;
	}
}
