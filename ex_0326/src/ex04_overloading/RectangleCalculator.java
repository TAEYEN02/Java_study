package ex04_overloading;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	//메서드 명 : area
	//1.정사각형의 한변의 길이를 받아 넓이 변환하기
	public int area(int r) {
		int area = r*r;
		return area;
	}
	//2.가로 세로 길이를 받아 직사각형의 넓이 변환하기
	public int area(int r,int h) {
		int area = r*h;
		return area;
	}
	//3.실수형 가로, 세로를 받아 실수 결과 반환하기
	public double area(double r,double h) {
		double area = r*h;
		return area;
	}
}
