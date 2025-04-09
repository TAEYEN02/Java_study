package ex01_FileInputStream;

import java.io.IOException;

public class Ex01_FileInputStream {
	public static void main(String[] args) {
		byte[] kyeborad = new byte[100];
		
		System.out.print("값 : ");
		
		//Scanner sc = new Scanner(System.in);
		//System.in 인 입력스트림이 Scanner라는 클래스에 입력값에 대한 시스템을 위임해주는거
		
		//System : System클래스
		//in : inputStream 객체를 의미
		//System.in : 표준 입력 스트림
		
		//표준입력스트림
		//자바에서 프로그램이 외부로부터 데이터를 입력받을 수 있게
		//해주는 기본 통로
		//기본대상 : 키보드
		
		//사용자가 키보드로 입력한 값을 kyeborad배열에 저장
		//사용자가 엔터를 입력할 때 까지 입력을 받는다
		//엔터키 값까지 포함되어 저장
		try {
			System.in.read(kyeborad);
			
			String s = new String(kyeborad).trim();
			System.out.println(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


//Scanner(System.in)   vs 	System.in.read()
//문자단위 입력					바이트단위 입력
//다양한 타입(String,int...)	int(0~255)||byte[]
//nextLine으로 여러줄 처리가능	직접처리해야함

//sc.close();
//in이 static이고 메모리에 한번만 올라가기 때문에
//닫아버리면 프로그램 전체에서 더 이상 키보드 입력이 불가능해진다.
