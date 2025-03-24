package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 1~50 사이의 난수를 생성하고
		// 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면
		// "맞춰야 할 숫자가 더 큽니다"
		// 적은 값이 난수보다 크면
		// "맞춰야 할 숫자가 더 작습니다

		// 정답을 x번만에 맞췄습니다
		Random ran = new Random();
		int random = ran.nextInt(50) + 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
//		while로 풀기
		boolean isAnswer = true;
		while(isAnswer) {
			count++;
			System.out.print("숫자 입력(1~50): ");
			int answer = sc.nextInt();
			if(answer > random) {
				System.out.println("맞춰야 할 숫자가 더 작습니다");
				continue;
			}else if(answer <random) {
				System.out.println("맞춰야 할 숫자가 더 큽니다");
				continue;
			}else {
				System.out.println("정답입니다!");
				break;
			}	
		}
		System.out.printf("정답을 %d번만에 맞췄습니다!",count);
		
//		for문으로 풀기
//		for (int count =0;;count++) {
//			System.out.print("숫자 입력(1~50): ");
//			int answer = sc.nextInt();
//			if (answer > random) {
//				System.out.println("맞춰야 할 숫자가 더 작습니다");
//				continue;
//			} else if (answer < random) {
//				System.out.println("맞춰야 할 숫자가 더 큽니다");
//				continue;
//			} else {
//				System.out.println("정답입니다!");
//				System.out.printf("정답을 %d번만에 맞췄습니다!", count);
//				break;
//			}
//		}
		
	}

}
