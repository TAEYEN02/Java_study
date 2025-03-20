package ex05_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행할 때 키보드를 통해 입력한 데이터를 
		//변수에 대입하겠다.
		
		//java.util.패키지에 있는 Scanner클래스를 이용해야한다.
		//다른 패키지에 있는 기능을 사용하기 위해서는 import를 해야한다.
		//import 경로
		//js -> let obj = new Object();
		// 		obj.key = value; -> 프로퍼티가 없으면 프로퍼티 생성을해준다.
		Scanner sc = new Scanner(System.in); //Scanner 객체 선언
//		System.out.print("정수 입력 : ");
//		
//		int n = sc.nextInt(); // 정수 입력받기
//		System.out.printf("정수 : %d ",n);
		
		//나이를 입력받기
		//제 나이는 x세 입니다
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();//띄어쓰기를 해버리면 끝남
		sc.nextLine();//해결->엔터값을 대신 가져감
		System.out.print("주소 입력 : ");
		String address= sc.nextLine();//엔터치면 끝남
		
		System.out.printf("제 나이는 %d세 입니다\n",age);
		System.out.printf("제 이름는 %s 입니다\n",name);
		System.out.printf("제 주소는 %s 입니다\n",address);
		
		
		
		
	}

}
