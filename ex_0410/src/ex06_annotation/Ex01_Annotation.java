package ex06_annotation;

@FunctionalInterface
interface testInter{
	void method1();
}


//'사용하지 않는 변수'경고를 억제
@SuppressWarnings({"unused","unchecked","deprecation"})
//unused : 사용하지 않는 변수 경고 억제
//unchecked : 제네릭 타입 미지정에 발생하는 경고 억제
public class Ex01_Annotation {
	public static void main(String[] args) {
		int x = 10;
		
		Integer y = new Integer(10);
		
		addUser("철수");
	}
	
	@Deprecated
	public static void addUser(String name) {
		System.out.println("사용자 추가 : "+name);
		
	}
}
