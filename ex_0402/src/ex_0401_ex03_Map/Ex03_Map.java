package ex_0401_ex03_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex03_Map {
	public static void main(String[] args) {
		// 문장에 입력을 받고 몇번 등장했는지 출력하시오
		// 예시
		// hello world hello java world java java
		// hello : 2
		// world : 2
		// java : 3
		Scanner sc = new Scanner(System.in);

		System.out.print("문장을 입력하세요 : ");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");

		HashMap<String, Integer> str2 = new HashMap<String, Integer>();

		for (String word : words) {
//			if (str2.containsKey(word)) {
//				//키가 이미 존재한다면 1증가
//				str2.put(word, str2.get(word) + 1);
//			} else {
//				//단어가 처음 나왔을때 
//				
//				str2.put(word, 1);
//			}
			str2.put(word, str2.getOrDefault(word, 0)+1);
		}
		System.out.println("---단어별 등장 횟수---");
		for (String key : str2.keySet()) {
			System.out.println(key + " : " + str2.get(key));
		}
		
		//Map인터페이스에서 제공하는 메서드
		
		//V getOrDefault(K key, defaultValue)
		//키가 존재하면 value를 반환
		//키가 존재하지 않으면 defaultValue를 반환한다.
		
		//V replace(K key, V value)
		//put은 키가 없으면 추가가 된다
		//replace는 키가 없으면 추가는 안된다.
		
		//V putIfAbsent(K key, V value)
		//키가 없을 경우에만 추가한다
		
		//키가 있을 경우
		//put() -> 덮어쓰기
		//putIfAbsent() -> 아무 동작도 하지 않는다.
	}
}
