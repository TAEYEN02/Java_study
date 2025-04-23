package exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreStudent {
	public static void main(String[] args) {
		Map<String,List<Integer>> Student = new HashMap<>();
		
		Student.put("Alice", Arrays.asList(90, 85, 88));
		Student.put("Bob", Arrays.asList(70, 65, 75));
		Student.put("Charlie", Arrays.asList(82, 90, 87));
		
		Student.entrySet().stream()
			.map(e-> Map.entry(e.getKey(), 
					e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)))
			.filter(score->score.getValue()>=80)
			.forEach(score->System.out.println(score.getKey() + ": 평균 "+String.format("%.2f", score.getValue()))
					);
	}
}
