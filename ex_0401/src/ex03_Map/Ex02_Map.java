package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_Map {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		// id : aaa
		// pw :1111
		// 아이디가 존재하지 않습니다
		// id : lee
		// pw : 3333
		// 비밀번호 불일치
		// id : park
		// pw : 3333
		// 로그인 성공!
		while (true) {
			System.out.print("id : ");
			String id1 = sc.next();
			System.out.print("pw : ");
			int pw = sc.nextInt();

			if (!map.containsKey(id1)) {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}

			
			if (map.get(id1) == pw) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("비밀번호 불일치");
			}
		}

	}

}
