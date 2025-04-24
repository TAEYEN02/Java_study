package test;

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printinfo() {
		System.out.println("이름 : "+ name +", 나이 : "+age);
		
	}
	
}

