package ex01_class_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Example2 {
	public static void main(String[] args) {
		//1차 상속관계가 아니더라도 자동 타입 변환이 된다.
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 =new OpenCar();
		OpenCar oc = new SportCar();
		
//		Bus b3 = new SportCar();
//		Bus b4 = new OpenCar();
		
	}
}
