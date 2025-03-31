package ex05_Generic;

import java.util.Random;

public class GenericExam {
	//Gen클래스를 만들어 제네릭 타입 T를 가지는
	//printArr메서드를 생성한다
	//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
	//main에서 Integer, Double, Character배열을 각각 만든 뒤
	//Gen 클래스의 printArr 메서드를 각각 호출하여 배열의 내용을 출력하자
	//결과
	//1 2 3 4 5
	//1.1 2.2 3.3 4.4 5.5
	//A B C D E
	public static void main(String[] args) {
		Gen gen = new Gen();
		Object[] arr = {2,4,5,1,3};
		Object[] arr1 = {2.2,4.4,5.5,1.1,3.3};
		Object[] arr2 = {'A','D','B','E','C'};
		
		//컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다
		gen.printArr(arr);
		gen.printArr(arr1);
		gen.printArr(arr2);
		
		
		
	}
}
