package ex05_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
		List<String> list2 = Arrays.asList("apple","banana");
		print(list1);
//		print(list2);
	}
	//와일드 카드의 경우는 메서드의 매개변수의 타입으로 사용하는 것이 일반적이다
	
	
	
	//Integer을 포함한 부모타입만 허용
	public static void print(List<? super Integer> list) {
		for(Object e : list) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
//	//Number와 그의 자식클래스만 허용
//	public static void print(List<? extends Number> list) {
//		for(Object e : list) {
//			System.out.print(e+" ");
//		}
//		System.out.println();
//	}
	
//	public static void print(List<?> list) {
//		for(Object e : list) {
//			System.out.print(e+" ");
//		}
//		System.out.println();
//	}
}
