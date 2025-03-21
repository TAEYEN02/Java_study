package ex06_Operator;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
//		국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
//		1. 세 과목에 대한 합계 출력하기
//		2. 평균 출력하기 (합계/3.0)
//
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
//		아니면 불합격
		
		Scanner sc = new Scanner(System.in);	
//		System.out.print("국어: ");
//		int hangle = sc.nextInt();
//		System.out.print("수학: ");
//		int math = sc.nextInt();
//		System.out.print("영어: ");
//		int eng = sc.nextInt();
//		
//		int total = hangle+math+eng;
//		float avg = (float)total/3;
//		
//		System.out.println("합계: "+ total );
//		System.out.printf("평균 : %.1f\n",avg);
//		
//		String pass = (hangle>=40||math>=40||eng>=40)&&avg>=60 ? "합격입니다" : "불합격입니다";
//		System.out.println(pass);
		
		
		//--------------------------------------------
		// 상자 하나에는 농구공이 5개가 들어있다
		//x개의 농구공을 담기 위한 박스의 개수를 구하세요
		// 농구공의 개수는 키보드를 통해 입력받습니다
		int box = 5;
		
		System.out.print("농구공의 개수 : ");
		int ball = sc.nextInt();
		int res = ball/box; 
		res = ball % box != 0 ? ++res : res;
		System.out.print("필요한 박스의 개수 : "+res);
		
//		//----------------------------------------------
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은
//		각각 5,7,5개 이다 
//		과수원에서 하루에 생간되는 총 개수를 출력하고
//		시간당 전체 과일의 평균 생산 갯수를 출력하시오
//		평균값을 담는 변수는 float으로 할것
		
		int apple = 5;
		int orange = 5;
		int pear = 7;
		
		int total = apple+orange+pear;
		float time = (float)total/24;
		System.out.print("\n총 생산되는 개수 : "+total);
		
		System.out.printf("\n시간당 평균 과일 생산 개수 : %f",time);
		
	}

}
