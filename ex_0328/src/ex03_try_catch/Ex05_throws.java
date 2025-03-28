package ex03_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_throws {
	public static void checkYourSelg(Scanner sc) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다 , 2.혼자 있는 것이 좋다");
		System.out.print("선택 : ");
		int check = sc.nextInt();
		
		if(check==1) {
			System.out.println("당신은 E 입니다");
		}else if(check==2) {
			System.out.println("당신은 I 입니다");
		}else {
			System.out.println("항목에 있는 숫자를 입력해주세요");
			 sc.nextLine();
		}
		
	}
	
	
	public static void main(String[] args) {
		//예외 던지기
		//메서드에서 발생한 예외를 직접 처리하는 것이 아닌
		//메서드를 호출한 쪽에서 대신 처리를 해주는 것
		Scanner sc= new Scanner(System.in);
		try {
			Ex05_throws.checkYourSelg(sc);//여기서 예외를 발생할 확률이 있음
		} catch (Exception e) {
			System.out.println("키보드 입력이 잘못되었습니다");
		}finally {
			System.out.println("프로그램 종료");
			sc.close();
		}
		
	}
}
