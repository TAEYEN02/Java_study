package ex02_iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_iterator {
	public static void main(String[] args) {
		//반복자
		//컬렉션 객체를 통해 생성
		//반복자를 통해 컬렉션 객체의 요소들에 접근할 수 있다
		//hasNext(), next()
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val+ " ");
		}
		
		System.out.println("");
		
		//Set의 경우 index가 없기 때문에 요소를 하나씩 꺼내는 것이 불가능
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<= 10; i++) {
			set.add(i);
		}
		//원본에는 영향이 없는 복사
		Iterator<Integer> iter2 = set.iterator();
		while(iter2.hasNext()) { //hasNext() : boolean타입 있으면 T 없으면 F
			int val = iter2.next();//next() : 매게변수 Or interator타입
			System.out.print(val + " ");
		}
	}
}
