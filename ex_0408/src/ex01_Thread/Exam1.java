package ex01_Thread;
//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을때 
//"종료" 메시지와 함께 프로그램이 종료되도록 만들어 보자
//Thread는 ThreadCount에다 작성하기

import java.util.Scanner;


public class Exam1 {
	public static void main(String[] args) {
		ThreadCount th =new ThreadCount();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		th.setCount(num);
		th.start();
		
		
		
	}
	
	

}
