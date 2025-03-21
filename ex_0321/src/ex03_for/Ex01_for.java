package ex03_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		//반복문
		//특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		//for, while
		
		//for 
		//주로 반복 횟수가 정해져 있을때 사용하는 문법
		
		//for(초기식;조건식;증감식){
		//	반복하고자 하는 명령
		//}
		
		//초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		//조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다.
		//증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 한다.
		
		for(int i =0; i<=3;i++) {
			System.out.println(i);
		}
		
//		int i =0;//초기값을 밖에다 쓸 수 있음
//		for(;i<=3;) {
//			System.out.println(i);
//			i++;
//			//증감값도 밖에다쓸 수 있음
//		}
		
		//초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다
		//사용하는게 좋을 것 같을때 쓰면 된다.
		
		//1부터 10까지 출력하는 for문 작성하기
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//10부터 1까지 출력한는 for문 작성하기
		for(int i=10;i>=0;i--) {
			System.out.print(i+" ");
		}	
		System.out.println();
		//1부터 10까지 3의 배수만 출력하는 for문
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//1부터 10까지 총합 구하기
		int total =0;
		for(int i =1; i<=10; i++) {
			total += i;	
		}
		System.out.println("i의 총합 : "+total);
		
		//키보드에서 정수를 하나 입력받아
		//해당 단의 구구단 출력하기
	Scanner sc= new Scanner(System.in);
		System.out.print("출력할 구구단의 단을 입력해주세요 : ");
		int num = sc.nextInt();
		
		for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d\n",num,j,num*j);
		}
		
		//키보드에서 정수 n을 입력빋고
		//1부터 정수 n까지의 총합을 계산하여 결과 출력하기
		int total1=0;
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		for(int i =1;i<=num1;i++) {
			total1 +=i;
			
		}
		System.out.printf("%d까지의 총합 : %d\n",num1,total1);
		
		//10개의 정수를 입력받아
		//그 중 짝수의 개수가 몇개인지 구하세요
	
		System.out.print("정수 10개를 쓰세요: ");
		int num2[] = new int[10];
		int count = 0;
		for(int i = 0; i<10;i++) {
			num2[i]=sc.nextInt();
		}
		
		for(int i = 0; i<10;i++) {
			if(num2[i]%2==0) {
				count++;
			}
		}
		System.out.println("짝수의 개수는 : "+count);
			
		
		//1 + (1+2) + (1+2+3) +
		//(1+2+3+4) +...(1+2+3+...+10)
		//의 결과를 구하세요
		num=0;
		total=0;
		for(int i = 1; i<=10; i++) {
			num +=i;
			total+=num;
		}
		System.out.println(total);
		
		//양의 정수 x를 키보드에서 입력받아 
		//x가 홀수면 x 이하의 홀수인 정수의 합을 구하고
		//x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하세요
		
		total=0;
		System.out.print("양의 정수 : ");
		int num3 = sc.nextInt();
		
		if(num3%2==1) {
			for(int i = 1; i<=num3; i++) {
				if(i%2==1) {
					total += i;
				}
			}
			System.out.printf("홀수이며 %d까지의 정수 합 : %d",num3,total);
		}else {
			for(int i=1; i<=num3; i++) {
				if(i%2==0) {
					total += i*i;
				}
			}
			System.out.printf("짝수이며 %d까지의 정수의 제곱의 합 : %d",num3,total);	
		}
		
	}
	

}
