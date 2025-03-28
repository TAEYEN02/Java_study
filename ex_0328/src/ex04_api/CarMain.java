package ex04_api;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car("소나타","현대");
//		System.out.println(c);->toString()은 생략되어있는거
		System.out.println(c.toString());
	}
}
