package ex03_variable;

public class Ex01_variable {

	public static void main(String[] args) {
		//변수
		//프로그램을 만들고 실행하는데 필요한 값들을
		//메모라애 저장해두고 필요할때마다 꺼내서 사용
		
		//메모리에 무질서하게 저장되는게 아닌
		//규칙 속에서 일부 공간을 할당 받아야 한다
		
		//메모리에 값을 저장하기 위해 할당해 놓은 특정 공간을 변수라고 한다
		
		//1. 변수의 선언
		//변수를 사용하기 위해서 선언을 우선 사용해야한다
		
		//변수명 짓는 규칙
		//1. 숫자,특수문자($,_제외)가 첫 글자rk cjt rmfwkfh dhf tn djqtek
		//2. 대소문자 구별한다
		//3. 일반적으로 영어 소문자로 시작한다
		//4. 특수문자가 포함될 수 없다
		//5. 예약어 금지(if,switch, for, while)
		//6. 한글 사용하지 않는다
		
		//표기법
		//카멜표기법
		//두번째 단어부터 첫글자를 대소문자
		//userName , homeAddress
		
		//스네이크 표기법
		//모든 단어가 소문자로 시작하고 
		//단어와 단어 사이는 _로 연결
		//user_name, home_address
		
		//변수에 데이터 입력하기
		//데이터를 직접 사용하는 대신, 변수에 더당하고
		//변수명을 사용하여 값을 사용
		
		int studentAge;
		studentAge =20;
		
		System.out.println(studentAge);
		
		boolean b = true;
		System.out.println("b의 값 : "+b);
		//자바는 변수의 타입을 엄격하게 지켜야 한다.
		
		//문자형
		char ch = 'd';
		System.out.println("ch의 값 : "+ch);
		
		//아스키코드값 때문에 에러 발생X
		char ch2 = 65;
		System.out.println(ch2);
		
		//정수형
		byte c = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("byte 값 : "+ c);
		System.out.println("short 값 : "+ s);
		System.out.println("int 값 : "+ n);
		
		//실수형
		float f1, f2;
		
		//java에서는 실수의 타입을 double형으로 인식하기 때문에
		//데이터가 float타입이라는 것을 인식시켜줘야한다
		f1 = 3.14f;
		f2 = 150.0f;
		System.out.println("f1 : " +f1);
		System.out.println("f2 : "+ f2);
		
		int myAge = 20;
		int yourAge = myAge;
		
		myAge = 21;
		System.out.println("yourAge = " +yourAge);
		
		//두 변수의 값을 서로 바꾸기 (임시로 담아둘 변수 만들어서 바꾸기)
		//두 값이 있는 변수에다가는 못비꾸기 때문에 임시 변수 만드는거
		int su1 = 20, su2=30;
		System.out.println("변경 전");
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : "+ su2);
		System.out.println("==============");
		
		int temp;
		temp = su1;
		su1= su2;
		su2 =temp;
		System.out.println("변경 후");
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : "+ su2);
		System.out.println("==============");
		
		
		
	}
}
