package ex02_lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ex03_Funcrion {
	public static void main(String[] args) {
		//컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용한다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");

		//void accept(T t)
		//list에 들어있는 요소들을 하나씩 꺼내서 출력해라
		list.forEach(System.out::print);//Consumar로 만든 인터페이스 람다식만 들어갈 수 있다
		System.out.println("");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		hs.forEach(System.out::print);
		
		
	}
}
