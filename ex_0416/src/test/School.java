package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	public static void main(String[] args) {
		Map<String, List<Integer>> student = new HashMap<>();
		
		student.put("홍길동",Arrays.asList(67,34,87));
		student.put("이길동",Arrays.asList(90,84,87));
		student.put("김길동",Arrays.asList(57,74,87));
		
		Map<String,Float> score = new HashMap<>();
		
		student.forEach((name,scores)->{
			double avg = scores.stream()
					.mapToInt(Integer::intValue)
					.average()
					.orElse(0.0);
			score.put(name, (float)avg);
		});
		
		score.entrySet().stream()
			.filter(t->t.getValue()>=80)
			.forEach(s->System.out.println(s.getKey()+" : "+s.getValue()));
	}
}
