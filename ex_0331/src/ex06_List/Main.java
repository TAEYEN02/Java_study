package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		out:while(true) {
			
			System.out.print("아이디 : ");
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			for(UserInfo user : arr) {
				  if (user.getId().equals(ui.getId())) {
					  System.out.println("이미 있는 아이디 입니다");
	                   continue out;
				
				  }
			}
			
			System.out.print("비밀번호 : ");
			ui.setPass(sc.nextInt());
			arr.add(ui);
			
			//중복체크 부분 추가
			
			for(int i =0 ; i<arr.size();i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPass());
				System.out.println("---------------------");
			}
		}
		
	}
}
