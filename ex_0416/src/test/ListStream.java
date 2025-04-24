package test;

import java.util.Arrays;
import java.util.List;


public class ListStream {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "grape");
		
		words.stream()
	     .filter(w -> w.length() > 3)
	     .sorted()
	     .forEach(System.out::println);
		
	}
}
