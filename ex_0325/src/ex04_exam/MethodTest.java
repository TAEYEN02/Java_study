package ex04_exam;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class MethodTest {
	// 배열의 최대값을 찾는 maxFinder 메서드
	// 임의의 배열은 매개변수로 받자.
	public void maxFinder(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max : " + max);

	}

	// 원의 넓이와 둘레 구하기
	// 함수의 호출하면서 반지름을 받는다
	// 원의 넓이를 구하는 circleArea
	// 원의 둘레를 구하는 circleRound
	public void circleArea(int r) {
		double Area = 3.14 * r * r;
		System.out.printf("원의 넓이 : %.1f \n", Area);
	}

	public double circleRound(int r) {
		double round = (double) 2 * 3.14 * r;
		return round;
	}

	// 계산기 만들기
	// 사칙연산을 할 수 있는 calculator메서드 만들기
	// 두 수와 연산자를 매개변수로 받는다

	public void calculator(int a, int b, String c) {
		switch (c) {
		case "+":
			System.out.printf("%d+%d=%d \n", a, b, a + b);
			break;
		case "-":
			System.out.printf("%d-%d=%d \n", a, b, a - b);
			break;
		case "*":
			System.out.printf("%d*%d=%d \n", a, b, a * b);
			break;
		case "/":
			System.out.printf("%d/%d=%d \n", a, b, a / b);
			break;
		case "%":
			System.out.printf("%d%%d=%d \n", a, b, a % b);
			break;
		}
	}

	// 1~50사이의 난수를 생성
	// main쪽에서 키보드를 통해 정수 입력
	// check()메서드를 만들어서 사용자가 입력한 숫자를 판단
	// 발생한 난수보다 크다면 down
	// 작다면 up
	// 사용자가 입력한 숫자와 발생한 난수가 같을 경우에 프로그램 종료 (몇회만에 맞췄는지판단)

	public String check(int i) {
		Random rd = new Random();
		int num1 = rd.nextInt(50) + 1;

		if (num1 > i) {
			return "up!";

		} else if (num1 < i) {
			return "down!";

		} else {
			return "정답";
		}

	}

	
	
	
//  Graph라는 이름의 메인 클래스를 만들어 
  //0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
  //해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
//
//  단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
//
//  결과:
//  0507...... //난수 100개
//  0의 갯수 : ############ 12
//  1의 갯수 : ######### 9
//  2의 갯수 : ########### 11
//  3의 갯수 : ######## 8
//  4의 갯수 : ############## 14
//  5의 갯수 : ####### 7
//  6의 갯수 : ######### 9
//  7의 갯수 : ############# 13
//  8의 갯수 : ####### 7
//  9의 갯수 : ########## 10
	
	

}
