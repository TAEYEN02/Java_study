package ex04_overloading;

public class RectangleCalculatorMain {
	public static void main(String[] args) {
		RectangleCalculator r = new RectangleCalculator();
		System.out.println("정사각형의 넓이 : "+r.area(3));
		System.out.println("직사각형의 넓이 : "+r.area(3, 5));
		System.out.println("실수형 직사각형 넓이 : "+ r.area(3.4, 5.5));
		
		
	}
}
