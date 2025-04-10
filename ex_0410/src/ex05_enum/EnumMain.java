package ex05_enum;

import java.util.Arrays;

public class EnumMain {
	public static void main(String[] args) {
		//열거형은 직접 객체를 생성할 수 없다.
		//enum의 생성자는 암묵적으로 private으로 만들어져있다(접근 불가)
		//JVM이 각 상수를 단 한번만 생성하고 공유한다. 
		
		Item i1 = Item.START;
		System.out.println(i1);//START
		//모든 열거형이 상속하는 Enum클래스에 toString()메서드에서
		//이름을 반환하기 때문에 이름이 출력된다
		
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		//열거형 상수에 들어있는 순서 보기
		for(Item item : items) {
			System.out.println("name = "+item.name()+", ordinal = "+item.ordinal());
		}
		
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		
		System.out.println(i1==i2);
		
		Item i3 = Item.EXIT;
	
		//열거형끼리는 == 이외의 비교연산자는 사용할 수 없다
		//compareTo()는 사용이 가능하다.
		//System.out.println(i1>i3); - error
		
		System.out.println(i1.compareTo(i3));//-2
		//i1의 ordinal = 0 / i3의 ordinal=2 .. -> 0-2 = -2 
		//a.compareTo(b)
		//a가 b보다 앞서면 -> 음수
		//a와 b가 같으면 -> 0
		//a가 b보다 뒤면 -> 양수
		
		//열거형과  switch문
		//열거형 상수를 switch의 case에 쓸 수 있다.
		
		switch (i1) {
		case START: //Item.START앞의 타입은 생략해도된다.
			System.out.println("시작");
			break;
		case STOP:
			System.out.println("정지");
			break;
		case EXIT:
			System.out.println("종료");
			break;
		}
		
		for(Item item: items) {
			System.out.println(item.getItemStr()+" "+item.getSymbol());
		}
		
		//왜 enum을 써야할까
		//1. 코드의 가독성을 증가
		//int status = 1; //무슨 상태를 의미하는거지?
		//누가 봐도 성공했다는 상태임
		//Status status = Status.SCUCCES;
		
		//2. 타입 안정성 보장
		//정해진 값 이외의 다른 값을 넣을 수 없다.
		//열거형을 안쓸때
		//int color = 99999;//문법적으로 틀린게 아니라 에러는 안남
		//단 설정한 색의 범주가 아님
		//열겨형일때
		//Color color = Color.RED;
		//color 타입만 들어올 수 있음
		
		
		
		
		
		
		
	}
}
