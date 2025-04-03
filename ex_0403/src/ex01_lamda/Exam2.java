package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting{
	private String name;
	
	public Greeting(String name) {
		this.name = name;
	}
	public String sayHello() {
		return "hello, "+name;
	}
}

class Student{
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}

}

public class Exam2 {
	public static void main(String[] args) {
		//Greeting 메서드를 참조하여 sayHello() 도출하기
		Function<Greeting, String> hello = Greeting::sayHello;
		
		Greeting g = new Greeting("홍길동");
		System.out.println(hello.apply(g));
		
		//학생이 특정 점수 이상인지 확인하는 메서드를 메서드 참조로 구하기
		BiPredicate<Student ,Integer> passChecker = Student::isPassed;
		Student s = new Student(80);
		System.out.println(passChecker.test(s, 60));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> compList = new ArrayList<Integer>(list);
		
		//removeIf()
		//조건에 맞으면 삭제하라
		compList.removeIf(x->x%2==0);//List로는 remove가 안됨 -> 새로 생성한 List로 한번 감싸면 됨
		System.out.println(compList);
		
		
	}
}
