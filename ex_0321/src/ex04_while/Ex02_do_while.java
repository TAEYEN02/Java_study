package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		//while문과 같이 조건을 만족할 때 까지 반복한다
		//다만, while문과 다른 점은 먼저 루프 한 번 실행후
		//조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한번은 실행한다
		
		//do{
		//	반복하고자 하는 명령
		//}while(조건식)
		
		int i = 9;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		//1~10까지의 총합
		int result=0;
		int j =1;
		do {
			result +=j;
			j++;
		}while(j<=10);
		System.out.println("총합: "+result);
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호를 입력받아 올바른 비밀번호가 입력될 때 까지 
		//계속 바말번호를 요구하는 프로그램
		//비밀번호는 9486
		int pw = 9486;
		Scanner sc = new Scanner(System.in);
		int pass = 0;
		boolean IsAnswer = false;
		do {
			
			System.out.print("비밀번호를 입력하세요 : ");
			pass = sc.nextInt();
			if(pw==pass) {
				System.out.println("접속 성공!");
				IsAnswer = true;
			}else {
				System.out.println("틀렸습니다, 다시 입력하세요.");
			}
		}while(!IsAnswer);//비밀번호가 맞지 않으면 반복
		
		
		
		//학생의 국어, 영어, 수학 점수를 입력받는다
		//단, 각 과목은 40점 이상이어야 하며,
		//40점 미만이면 해당 과목 점수를 다시 입력받아야한다.
//		System.out.print("국어 : ");
//		int hangle = sc.nextInt();
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 : ");
//		int math = sc.nextInt();
//		
//		do {
//			System.out.println("다시입력하세요");
//			System.out.print("국어 : ");
//			hangle = sc.nextInt();
//			System.out.print("영어 : ");
//			eng = sc.nextInt();
//			System.out.print("수학 : ");
//			math = sc.nextInt();
//		}while(hangle<40||eng<40||math<40);
//		System.out.println("모든 과목이 40점이 넘네요!!");
		
		int kor,eng,math =0;
		do {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			math = sc.nextInt();
		}while(kor<40||eng<40||math<40);
		System.out.println("모든 과목이 40점이 넘네요!!");
		
		
		
		
		
	}

}
