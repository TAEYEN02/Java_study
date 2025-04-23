package exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		 List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "grape");
		 
		 List<String> result = words.stream()
				 .filter(word -> word.length()>=4)
				 .sorted()
				 .collect(Collectors.toList());
		 
				 result.forEach(System.out::println);
	}
}
