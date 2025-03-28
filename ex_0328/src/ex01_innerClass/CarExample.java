package ex01_innerClass;

class Car{
	private String engineTyep = "V6";
	
//	void startEnine() {
//		System.out.println(engineTyep + "엔진 시동 거는 중");
//	}
//	
	//엔진 객체는 상태가 있는 구성요소로 존재하게 된다
	//엔진이라는 객체를 캡슐화할 수 있다.
	class Engine{
		void start() {
			System.out.println(engineTyep + "엔진이 시동됨");
		}
		void stop() {
			System.out.println("엔진이 꺼짐");
		}
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car c= new Car();
		Car.Engine engine = c.new Engine();
		engine.start();
		engine.stop();
		
		//왜 굳이 내부 클래스로 정의할까???
		//1. 외부클래스의 내부 구성요소
	}
}
