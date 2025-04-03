package ex_0401_ex03_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04_Map {
	public static void main(String[] args) {
//	      학생별 국어, 영어, 수학 점수 저장 및 평균 계산
//	      학생 이름을 입력받고, 해당 학생의 국어, 영어, 수학 점수를 입력받는다.
//	      3명의 학생 정보를 입력받은 후, 각 학생의 평균 점수를 계산하여 출력하시오.
//	      학생 이름: 홍길동
//	      국어 점수: 90
//	      영어 점수: 85
//	      수학 점수: 88
//
//	      학생 이름: 김영희
//	      국어 점수: 100
//	      영어 점수: 95
//	      수학 점수: 90
//
//	      학생 이름: 이철수
//	      국어 점수: 80
//	      영어 점수: 70
//	      수학 점수: 75
//
//	      학생별 평균 점수:
//	      홍길동 - 평균: 87.66666666666667
//	      김영희 - 평균: 95.0
//	      이철수 - 평균: 75.0

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		HashMap<String, Double> avgMap = new HashMap<>();

		System.out.print("입력할 학생수 입력 : ");
		int number = sc.nextInt();
		System.out.println("---------------");
		
		System.out.println("[학생 성적 입력]");

		for (int i = 0; i <number; i++) {
			System.out.print("학생 이름: ");
			String name = sc.next();

			System.out.print("국어 점수: ");
			int kor = sc.nextInt();

			System.out.print("영어 점수: ");
			int eng = sc.nextInt();

			System.out.print("수학 점수: ");
			int math = sc.nextInt();

			Student student = new Student(name, kor, eng, math);
			students.add(student);
			System.out.println("---------------");
		}


		for (Student student : students) {
			double avg = (student.getKor() + student.getEng() + student.getMath()) / 3.0;
			avgMap.put(student.getName(), avg);
		}


		System.out.println("[학생 성적]");
		for(Student student : students) {
			System.out.printf("이름 : %s \n국어 성적 : %d\n영어 성적 : %d\n수학 성적 : %d\n",student.getName(),student.getKor(),student.getEng(),student.getMath());
			System.out.println("---------------");
		}
		
		System.out.println("[학생별 평균 점수]");
		for (String name : avgMap.keySet()) {
			System.out.println(name + " - 평균: " + Math.round(avgMap.get(name)*100)/100.0);
		}

	}
}

