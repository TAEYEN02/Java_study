package ex04_casting;

public class Ex03_Casting {

	public static void main(String[] args) {
		//float -> int 강제 형변환
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("[float->int] \nf1의 값 : "+ f1 + "\ni1의 값 : "+i1 );
		System.out.println("================");
		//double -> int 강제 형변환
		double d1 = 12345.67;
		int i2 = (int)d1;
		System.out.println("[double->int] \nd1의 값 : "+ d1 + "\ni2의 값 : "+i2 );
		
		//byte의 표현 범위가 127까지밖에 되지 않아
		//byte끼리의 연산은 127를 넘어버릴 가능성이 없다
		
		//java 개발자들은 byte의 연산이 수행될때
		//int형 변수로 값을 받도록 만든다
		System.out.println("================");
		byte b1 = 100;
		byte b2 = 20;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
		
		
	}

}
