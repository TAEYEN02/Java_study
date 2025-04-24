package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
			
		StudentTest st = new StudentTest();
		
		System.out.print("등록할 학생 수 : ");
		int num = sc.nextInt();

		for(int i =0; i<num;i++) {
			System.out.println("학생의 이름과 성적 입력");
			System.out.print("이름 : ");
			String name = sc.next();
			st.setStdname(name);
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			st.setKor(kor);
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			st.setEng(eng);
			System.out.print("수학 : ");
			int math = sc.nextInt();
			st.setMath(math);
			
			st.avg();
		}
		
		if(st.getAvg()>=80) {
			student.put(st.getStdname(), (int) st.getAvg());
			System.out.println("80점 이상인 학생 : "+student);
		}else {
			System.out.println("80점 이상인 학생이 없습니다.");
		}
		
		
		
		
	}
}
