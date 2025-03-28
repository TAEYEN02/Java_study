package ex01_innerClass;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		Person p = new Person() {
			//익명클래스 -> 한번만 쓸 클래스라면 클래스이름이 없는 익명 클래스를 쓴다.
			@Override
			public void mySelf() {
				System.out.println("회사원입니다");
			}
		};
		
		p.mySelf();
	}
}
