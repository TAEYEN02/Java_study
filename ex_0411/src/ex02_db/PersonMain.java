package ex02_db;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		PersonMethod pm = new PersonMethod();
		List<Person> list = pm.find();
		for(Person p : list) {
			System.out.printf("%d | 이름 : %s | 나이 : %s \n", p.getIDX(),p.getNAME(),p.getAGE());
		}
	}
}
