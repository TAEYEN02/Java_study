package ex07_final;

public class Book {
	
	String title = "홍길동전";
	final int PRICE = 25000;//상수에도 final를 붙여 값을 고정;
	
	
	//final메서드
	//자식클래스에서 오버라이드 할 수 없다.
	public final void info_title() {
		System.out.println("책의 제목은 : "+title + ", 가격은 : "+PRICE );
	}
}
