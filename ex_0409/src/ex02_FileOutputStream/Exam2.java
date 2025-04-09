package ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다
//마지막에는 파일 내용을 읽어 콘솔에 출력한다.
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85
public class Exam2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream("D:\\full_stack_kty\\3.JAVA\\scores.txt",true);
			while(true) {
				System.out.print("이름 :");
				String name = sc.next();
				
				if(name.equalsIgnoreCase("exit")) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				
				System.out.print("점수 : ");
				String score = sc.next();
				
				String line = name + " : "+ score + "\n";
				fos.write(line.getBytes());
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("현재 저장된 점수 목록 : ");
		
		try {
			fis = new FileInputStream("D:\\\\full_stack_kty\\\\3.JAVA\\\\scores.txt");
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			String content = new String(buffer,"UTF-8");
			System.out.println(content);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				if(fos !=null) {
					fos.close();
				}		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
