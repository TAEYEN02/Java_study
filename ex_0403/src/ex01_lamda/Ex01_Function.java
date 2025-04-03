package ex01_lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex01_Function {
	public static void main(String[] args) {
		//Consumer인터페이스
		Consumer<String> c1 = t ->System.out.println(t);
		c1.accept("홍길동");
		
		//BiConsumer인터페이스
		BiConsumer<String, Integer> c2 = (x, y) -> System.out.println("입력값1 :"+x+", 입력값2 : "+y);
		c2.accept("박길동", 100);
		
		//Supplier
		Supplier<Object> s1 =() -> new Object();
		System.out.println(s1.get());//s1의 주소값
		
		//Function인터페이스
		Function<Integer, String> f1 = t -> String.valueOf(t);
		String str =f1.apply(100);
		System.out.println("문자열 str : "+ str);
		
		//BiFunction 
		BiFunction<String, String, Boolean> f2 = (x, y) -> x.equals(y);
		
		String result1=f2.apply("토마토", "토마토") ? "두 문자열의 값은 같습니다" :"두 문자열의 값이 다릅니다";
		System.out.println(result1);
		//Predicate
		Predicate<Integer> p1 = t -> t>=60;
		int score = 65;
		boolean pass = p1.test(score);
		String result2 = pass ? "홍길동님의 점수는 "+ score+"이고 합격입니다" : "불합격입니다"; 
		System.out.println(result2);
	}
}
