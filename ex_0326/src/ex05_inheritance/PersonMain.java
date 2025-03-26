package ex05_inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Customer c1 = new Customer("홍길동", 30,202503001);
		//자식 객체가 부모의 필드를 가져다가 사용함
		c1.enter();
	}
}
