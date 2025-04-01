package ex01_Set;

import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		//예시 
		//I Love Java and I Love coding
		//중복 단어 있음
		
		HashSet<String> str = new HashSet<>();
		HashSet<String> equals = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		boolean trueFalse = false;
		
		for(String word : words) {
			if(!str.add(word)) {
				equals.add(word);
				System.out.println(equals+ ", ");
				trueFalse = true;
			}
			
		}
		if(!trueFalse){
			System.out.println("중복되는 단어 있음");
		}
		System.out.println("중복되는 단어 없음");

	}
}
