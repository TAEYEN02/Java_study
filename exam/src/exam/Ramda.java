package exam;

import java.util.function.Function;

public class Ramda {
	public static void main(String[] args) {
		Function<String, String> UpperCase = s->s.toUpperCase();
		
		System.out.println(UpperCase.apply("hello"));
		
	}
}
