package bank;

import java.util.Scanner;

public class Bank {
	
	//프로그램의 흐름
	public void bank() {
		Scanner sc = new Scanner(System.in);
		UserInfo uI = new UserInfo();
		int num;
		out:do {
			
			System.out.println("1.입  금");
			System.out.println("2.출  금");
			System.out.println("3.잔액확인");
			System.out.println("4.종  료");
			
			System.out.print("원하시는 서비스 번호를 입력하세요 : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				uI.deposit();
				System.out.println("-----------------");
				continue;
			case 2:
				uI.withdraw();
				System.out.println("-----------------");
				continue;
			case 3:
				System.out.println("현재 잔액은 " + uI.showMoney()+"원 입니다");
				System.out.println("-----------------");
				continue;
			case 4:
				System.out.println("시스템을 종료하겠습니다");
				break out;
			default:
				System.out.println("잘못된 숫자입니다.\n다시 입력해주세요!");
				continue;
			
			}

			
			
		}while(true);
	}
}
