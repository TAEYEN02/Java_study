package ex02_for;

public class Ex01_for {
	public static void main(String[] args) {
		//향상된 for문
		//JDK 1.5부터 새롭게 추가된 기능으로
		//배열과 컬렉션의 모든 요소를 참조하기 위한
		//반복문이다.
		
		//for(변수 : 배열){
		//	반복하고 싶은 명령
		//}
		
		int[] ar = {1,2,3,4,5};
		//일반적인 for문
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("-------------------");
		//향상된 for문
		for(int i : ar) {
			System.out.println(i);
		}
		
	}
}
