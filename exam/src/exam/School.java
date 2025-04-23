package exam;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class School {
	 public static void main(String[] args) {
	        // 학생 이름 ➜ (과목 ➜ 점수)
	        Map<String, Map<String, Integer>> studentScores = new HashMap<>();

	        // 샘플 데이터 입력
	        Map<String, Integer> aliceScores = new HashMap<>();
	        aliceScores.put("국어", 90);
	        aliceScores.put("영어", 85);
	        aliceScores.put("수학", 88);
	        studentScores.put("Alice", aliceScores);

	        Map<String, Integer> bobScores = new HashMap<>();
	        bobScores.put("국어", 70);
	        bobScores.put("영어", 65);
	        bobScores.put("수학", 75);
	        studentScores.put("Bob", bobScores);

	        Map<String, Integer> charlieScores = new HashMap<>();
	        charlieScores.put("국어", 82);
	        charlieScores.put("영어", 90);
	        charlieScores.put("수학", 87);
	        studentScores.put("Charlie", charlieScores);

	        System.out.println("평균 80점 이상 학생 명단:");

	        // 평균을 계산하고 80점 이상인 학생만 출력
	        studentScores.entrySet().stream()
	            .map(entry -> {
	                String name = entry.getKey();
	                Map<String, Integer> subjectScores = entry.getValue();
	                double average = subjectScores.values().stream()
	                    .mapToInt(Integer::intValue)
	                    .average()
	                    .orElse(0);
	                return new AbstractMap.SimpleEntry<>(name, average);
	            })
	            .filter(entry -> entry.getValue() >= 80)
	            .forEach(entry -> 
	                System.out.println(entry.getKey() + ": 평균 " + String.format("%.2f", entry.getValue()))
	            );
	    }
	}
