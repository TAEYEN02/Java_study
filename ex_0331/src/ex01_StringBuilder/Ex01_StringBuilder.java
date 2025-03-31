package ex01_StringBuilder;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		//append()
		//기존 문자열의 뒤에 삽입
		str.append(" world");
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length());
		
		//delete()
		//문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length());
		
		//insert()
		//문자열 삽입
		str.insert(0, "Hello ");
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length());
		
		//reverse()
		//문자열 반대로 출력
		str.reverse();
		System.out.println(str);
		System.out.println("문자열의 길이 : "+str.length() );
	}
}
