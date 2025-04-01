package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {
	void PersonF() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> person = new ArrayList<>();

		while (true) {
			System.out.println("==학생정보시스템==");
			System.out.println("1. 정보 추가");
			System.out.println("2. 정보 삭제");
			System.out.println("3. 전체 정보");
			System.out.println("4. 종료");

			System.out.print("항목 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				Person p = new Person();

				System.out.println("---정보추가---");

				System.out.print("이름 : ");
				p.setName(sc.next());

				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				sc.nextLine(); 

				System.out.print("전화 : ");
				p.setPhone(sc.nextLine());

				person.add(p);
				System.out.println("정보가 저장되었습니다.");

				break;
			case 2:
				if (person.isEmpty()) {
					System.out.println("삭제할 정보가 없습니다.");
					break;
				}

				System.out.println("---정보 삭제---");
				for (Person personInfo : person) {
					System.out.println("이름 : " + personInfo.name);
					System.out.println("나이 : " + personInfo.age);
					System.out.println("전화 : " + personInfo.phone);
					System.out.println("----------");
				}
				System.out.print("삭제할 사람의 이름을 입력해주세요 : ");
				String deleteP = sc.next();
				sc.nextLine();

				for (Person personInfo : person) {
					if (deleteP.equals(personInfo.getName())) {
						person.remove(personInfo);
						System.out.printf("%s님이 삭제되었습니다\n", deleteP);
						break;
					}else {
						System.out.println("등록되어있지 않는 사람입니다");
						break;
					}
				}

				break;
			case 3:
				System.out.println("---전체 정보---");
				System.out.printf("등록 인원 : %d명\n", person.size());
				System.out.println("----------");
				for (Person personInfo : person) {
					System.out.println("이름 : " + personInfo.name);
					System.out.println("나이 : " + personInfo.age);
					System.out.println("전화 : " + personInfo.phone);
					System.out.println("----------");
				}
				break;
			case 4:
				System.out.println("---종료---");
				return;

			default:
				System.out.println("항목에 있는 번호로 눌러주세요");
				break;
			}

		}

	}
}
