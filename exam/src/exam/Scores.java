package exam;

import java.util.HashMap;
import java.util.Map;

public class Scores {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 72);
		scores.put("Charlie", 90);
		
		scores.entrySet().stream()
			.filter(score -> score.getValue()>=80)
			.forEach(score -> System.out.println(score.getKey() + ":"+score.getValue()));
	}
}
