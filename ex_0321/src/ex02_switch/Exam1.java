package ex02_switch;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//삼항 연산자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기
		Scanner sc = new Scanner(System.in);
		int box=5;
		System.out.print("농구공의 개수 : ");
		int ball = sc.nextInt();
		
		int res = ball/box; 
		if(ball %box != 0 ) {
			System.out.print("필요한 박스의 개수 : "+ ++res);
		}else {
			System.out.print("필요한 박스의 개수 : "+ res);
		}
		
	}

}
