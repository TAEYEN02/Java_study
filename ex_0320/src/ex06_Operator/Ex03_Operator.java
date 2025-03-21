package ex06_Operator;

import java.util.Scanner;

public class Ex03_Operator {

	public static void main(String[] args) {
		//비트연산자
		//논리연산자와 유사하지만 bit단위의 연산만 가능하다
		//& 논리곱(and) - 두 항이 모두 참이면 참 아니면 거짓
		//| 논리합(or) - 두 항 중 하나라도 참이면 참 아니면 거짓
		//^ 배타적논리합(xor) - 두 항이 다르면 참 같으면 거짓
		//~ 부정(not) - 참을 거짓으로 거짓을 참으로 연산
		
		int a = 10;//1010
		int b = 7;//0111
		int c = a&b;
		System.out.println("c: "+ c);
		
		int a2 =12;//0000 1100
		int b2 = 8;//0000 1000
		int c2 = a2|b2; // 0000 1100
		System.out.println("c2: "+ c2);
		
		int a3 = 9; //1001
		int b3 = 11;//1011
		int c3 = a3^b3;//0010
		System.out.println(c3);
		
		// ~(not)
		 
		int x = 7;
		System.out.println("~x: "+~x);
		//~x -> -(x+1)
		
		//시프트 연산자
		//비트의 이동
		x=10; //1010
		int result = x<<1;
		System.out.println(result);
		
		result =  x>>1;
		System.out.println(result);
		
		//삼항연산자
		//조건식 ? 참일때 실행할 명령 : 거짓일때 실행할 명령
		int i = 10;
		int i2 = 15;
		boolean res = ++a>=b ? true: false;
		System.out.println("result(++a>=b) : "+ res);
		
//		x:5
//		y:6
//		30
//		T
//		
		x =5;
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		
		x=10;
		y=20;
		int z = (++x) + (--y);
		System.out.println(z);
		
		a = 10;
		b=12;
		boolean result2=++a>=b||2+7<=b&&13-b>=0&&(a+=b)-(a%b)>10;//T||T&&T&&T
		System.out.println(result2);
		
		System.out.println("=================");
		
		
		
		
		
	}

}
