package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	void Order() {
		  ArrayList<String> menu = new ArrayList<>();
	        ArrayList<Integer> cost = new ArrayList<>();
	        ArrayList<String> Box = new ArrayList<>();
	        ArrayList<Integer> BoxCost = new ArrayList<>();

	        menu.add("아메리카노");
	        menu.add("라떼");
	        menu.add("카푸치노");

	        cost.add(3000);
	        cost.add(3500);
	        cost.add(4000);

	        Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\n=== 카페 주문 시스템 ===");
	            System.out.println("1. 메뉴 보기");
	            System.out.println("2. 주문 추가");
	            System.out.println("3. 결제하기");
	            System.out.println("4. 취소하기");
	            System.out.println("5. 프로그램 종료");
	            System.out.print("번호 선택: ");
	            int number = sc.nextInt();

	            switch (number) {
	                case 1:
	                    System.out.println("\n[메뉴판]");
	                    for (int i = 0; i < menu.size(); i++) {
	                        System.out.printf("%d. %s - %d원\n", i + 1, menu.get(i), cost.get(i));
	                    }
	                    break;

	                case 2:
	                    System.out.print("\n메뉴 번호 입력: ");
	                    int menu2 = sc.nextInt();
	                    if (menu2 > 0 && menu2 <= menu.size()) {  
	                        System.out.printf("'%s'가 추가되었습니다.\n", menu.get(menu2 - 1)); 
	                        Box.add(menu.get(menu2 - 1));
	                        BoxCost.add(cost.get(menu2 - 1));
	                    } else { 
	                        System.out.println("잘못된 메뉴 번호입니다.");
	                    }
	                    break;

	                case 3:
	                	if (Box.isEmpty()) {
	                        System.out.println("\n결제 주문이 없습니다.");
	                        break;
	                    }
	                    int total = 0;
	                    int same = 0;
	                    System.out.println("\n[결제 내역]");
	                    for (int i = 0; i < Box.size(); i++) {
	                    	total += BoxCost.get(i);
	                    	System.out.printf("- %s\n", Box.get(i));
	                    }
  
	                    System.out.printf("총 금액: %d원\n", total);
	                    
	                    System.out.print("결제하시겠습니까?(Y/N) :");
	                    sc.nextLine(); 
	                    String order = sc.nextLine();
	                    
	                    if(order.equalsIgnoreCase("Y")) {
	                    	 System.out.println("결제가 완료되었습니다. 감사합니다!");
	 	                    Box.clear();
	 	                    BoxCost.clear();
	 	                    return;
	                    }else if(order.equalsIgnoreCase("N")) {
	                    	System.out.println("결제가 취소됩니다.");
	                    	break;
	                    }else {
	                    	System.out.println("'Y' 또는 'N'으로 눌러주세요");
	                    }
	                    break;
	                case 4:
	                    if (Box.isEmpty()) {
	                        System.out.println("\n취소할 주문이 없습니다.");
	                        break;
	                    }

	                    System.out.println("\n[현재 주문 내역]");
	                    for (int i = 0; i < Box.size(); i++) {
	                        System.out.printf("%d. %s - %d원\n", i + 1, Box.get(i), BoxCost.get(i));
	                    }
	                    System.out.print("취소할 주문 번호를 입력하세요: ");
	                    int NoOrder = sc.nextInt();

	                    if (NoOrder > 0 && NoOrder <= Box.size()) {
	                        System.out.printf("'%s' 주문이 취소되었습니다.\n", Box.get(NoOrder - 1));
	                        Box.remove(NoOrder - 1);
	                        BoxCost.remove(NoOrder - 1);
	                    } else {
	                        System.out.println("잘못된 주문 번호입니다.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("프로그램을 종료합니다.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("올바른 번호를 선택해주세요.");
	            }
	        }
	}
}
