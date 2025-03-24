package ex02_break;

public class Ex01_break {
	public static void main(String[] args) {
		//break문은 switch를 할때 나왔던 구문으로
		//case를 종료할 때 사용
		//반복문이 진행되는 도중, 특정 조건을 만족해
		//더 이상 반복문을 실행할 필요 없이 종료하려고
		//할 때 사용한다
		
		for(int i =0; i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" ");
		}
		
		System.out.println();
		
		int s =0;
		while(s<10) {
			if(s==5) {
				break;
			}
			System.out.println(s + " ");
			s++;
		}
		
		//break 와 continue와 같은 기타제어문은
		//반복문 안에있는 조건문에 사용할 수 있다.
		
		//기타제어문 밑에는 코드가 올 수 없다.

		
		
		
		
	}
}
