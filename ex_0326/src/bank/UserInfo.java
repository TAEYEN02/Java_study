package bank;

import java.util.Scanner;
//프로그램의 기능
public class UserInfo {

	int money;

	public int deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금하실 금액을 적어주세요 : ");
		int depoMoney = sc.nextInt();
		money +=depoMoney;
		
		System.out.println("입금 완료");
		System.out.println("현재 금액 : "+money);
		return money;
	}
	
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금하실 금액을 적어주세요 : ");
		int depoMoney = sc.nextInt();
		
		if(money<depoMoney) {
			System.out.println("잔액이 부족합니다");
			System.out.println("현재 금액 : "+money);
		}else {
			money -=depoMoney;
			System.out.println("출금 완료");
			System.out.println("현재 금액 : "+money);
		}
	}
	
	public int showMoney() {
		return money;
	}
	
	
}
