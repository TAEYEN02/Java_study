package ex01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		Exam ex = new Exam();
		List<Integer> num = ex.i_arr;
		
		num.stream().distinct().forEach(System.out::print);
		System.out.println();
		System.out.println("=================");
		
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		int result = 0;
		for(int i = 0; i<f_arr.length-1;i++) {
			if(f_arr[i+1]>f_arr[i]) {
				if(f_arr[i+1]>result) {
					result=f_arr[i+1];
				}
			}
		}
		System.out.println(result);
		 
		System.out.println("=================");
		
		Student st = new Student("홍길동", 25, "20250424");
		st.StudentInfo();
		
		System.out.println("=================");
		
		String text = "apple banana apple apple orange banana apple orange orange";
		
		List<String> texts = Arrays.asList(text.split(" "));
		
		
		Map<List<String>, Integer> list = new HashMap<List<String>, Integer>();
		
		Stream<String> arr =texts.stream().distinct();
		
		int count=0;
		if(arr.equals(texts)) {
			count += 1;
		}
		list.put(texts, count);
		System.out.println(list);
		
		System.out.println("=================");
		
		
		
		
	}
}
