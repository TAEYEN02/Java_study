package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<>();

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			UserInfo user = new UserInfo();
			user.setId(sc.nextLine());
			
		
			System.out.print("비밀번호 : ");
			user.setPass(sc.nextLine());

			arr.add(user);
			
			for(int i =0 ; i<arr.size();i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPass());
				System.out.println("---------------------");
			}
		}
		
	}
}
