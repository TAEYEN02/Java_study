package exam4;

import java.util.Scanner;

public class MainCalc {
	public static void main(String[] args) {
		Calc c = new Calc();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		int num2 = sc.nextInt();

		System.out.println("-----합-----");
		System.out.printf("%d + %d = %d\n", num1, num2, c.add(num1, num2));

		System.out.println("-----차-----");
		System.out.printf("%d - %d = %d\n", num1, num2, c.substract(num1, num2));

		System.out.println("----평균----");
		System.out.print("숫자입력할 배열의 수 : ");
		int count = sc.nextInt();
		int number[] = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			number[i] = num;
		}
		System.out.printf("이들 수의 평균 값 : %.2f\n",c.average(number));
	}
}
