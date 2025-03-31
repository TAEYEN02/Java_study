package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// products라는 ArrayList를 만들고
		ArrayList<String> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("상품 이름을 입력하세요 (종료하려면 exit)\n");
		while (true) {
			System.out.print("상품명 입력 : ");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			}
			viewProduct(products, input);
		}
		System.out.println("종료");
	}

	// viewProduct
	// 키보드에서 값을 입력받아 상품을 추가한다(조회)
	// 상품이 중복되면 제거하고
	// 최근 조회회한 상품 목록이 가장 앞에 나오도록 한다

	public static void viewProduct(ArrayList<String> list, String product) {
		list.remove(product);
		list.add(0, product);
		
		System.out.println("상품 클릭 : "+ product + " -> "+list);
	}

}

