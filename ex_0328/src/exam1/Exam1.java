package exam1;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 정수가 아닌걸 입력했을때
		// 해당값은 정수가 아닙니다 라고 출력하기
		String num="";
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수 : ");
			num = sc.next();
			int str = Integer.parseInt(num);
			System.out.print("결과 : " + num);
		} catch (Exception e) {
				System.out.printf("결과 : "+num+"은(는) 정수가 아닙니다.");
			
		}
	}
}
