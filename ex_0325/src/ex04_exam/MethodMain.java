package ex04_exam;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		Random random = new Random();
		int[] iArr = new int[6];
		
		outer:for (int i = 0; i < iArr.length; i++) {
			iArr[i] = random.nextInt(20) + 1;
			for (int j = 0; j < i; j++) {
				if (iArr[j] == iArr[i]) {
					continue outer;
				}
			}
			System.out.print(iArr[i] + " \n");
		}

		MethodTest methodTest = new MethodTest();
		methodTest.maxFinder(iArr);
		
		System.out.println("--------------");
		int r = random.nextInt(9)+1;
		int num = random.nextInt(9)+1;
		methodTest.circleArea(r);
		System.out.printf("원의 둘레 : %.1f\n",methodTest.circleRound(r));
		
		System.out.println("-------------------");
		methodTest.calculator(r, num,"*");
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		int count =0;
		Random rd = new Random();

		while(true) {
			System.out.print("숫자 맞추기 : ");
			int number = sc.nextInt();	
			if(methodTest.check(number).equals("정답!")){
				System.out.println("정답입니다");
				System.out.println(count+"회만에 맞췄습니다");
				break;
			}else {
				System.out.println(methodTest.check(number));
				count++;
			}
			
		}
		
		
	}

}
