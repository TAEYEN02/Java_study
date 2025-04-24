package test;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 72);
		scores.put("Charlie", 90);
		
		scores.entrySet().removeIf(entry -> entry.getValue() < 80);

		System.out.println(scores);
	}
}
