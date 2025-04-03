package ex01_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		//예시 
		//I Love Java and I Love coding
		//중복 단어 있음
		
		HashSet<String> str = new HashSet<>();
		ArrayList<String> equals = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		boolean trueFalse = false;
		
		for(String word : words) {
			if(!str.add(word)) {
				equals.add(word);
				trueFalse = true;
			}
		}
		if(trueFalse){
			System.out.println("중복되는 단어 있음");
		}else {
			System.out.println("중복되는 단어 없음");

		}
		
		for(int i =0 ; i<equals.size();i++) {
			System.out.print(equals.get(i)+ " ");
		}

	}
}
