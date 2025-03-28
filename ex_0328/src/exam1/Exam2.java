package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다
		// 입력받은 문자열에서 소문자 a가 몇개 있는지 판별하시오

		Scanner sc = new Scanner(System.in);

//		int count = 0;
//		System.out.print("입력 : ");
//		String str = sc.next();
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a의 개수 : " + count);
//
//		System.out.println("---------------");
//
//		System.out.print("주민번호를 모두 입력하세요(-포함) : ");
//		String PersonNum = sc.next();
//
//		String front = PersonNum.substring(0, PersonNum.indexOf('-'));
//		String back = PersonNum.substring(PersonNum.indexOf('-') + 1); // '-' 다음부터 저장
//
//		String year = front.substring(0, 2);
//		String month = front.substring(2, 4);
//		String day = front.substring(4, 6);
//
//		int birthYear = Integer.parseInt(year);
//		char genderCode = back.charAt(0);
//
//		if (genderCode == '1' || genderCode == '2') {
//			birthYear += 1900;
//		} else if (genderCode == '3' || genderCode == '4') {
//			birthYear += 2000;
//		}
//
//		// 성별 판별
//		String gender = (genderCode == '1' || genderCode == '3') ? "남자" : "여자";
//
//		// 최종 출력
//		System.out.printf("당신은 %d년 %s월 %s일에 태어난 %s입니다\n", birthYear, month, day, gender);

		System.out.println("--------------");
		// 회문 판별하기
		// 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		// 키보드에서 문자열을 입력받아 회문이면 XXX는 회문입니다
		// 아니면 XXX는 회문이 아닙니다
		// 토마토는 회문입니다
		// 지하철은 회문이 아닙니다

		System.out.println("회문 판별하기");
		System.out.print("단어를 입력하세요 : ");
		String text = sc.next();
		
        String reversed = "";  


		for (int j = text.length(); j >= 0; j--) {
			reversed += text.charAt(j);
		}
		
		if (text.equals(reversed)) {
			System.out.println(text + "는 회문입니다");
		} else {
			System.out.println(text + "는 회문이 아닙니다");
		}

	}
}
