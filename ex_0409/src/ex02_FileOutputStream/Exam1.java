package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 FileOutputStream을 이용하여 score.txt파일에 저장하세요

//요구사항
//1. 사용자로부터 이름과 점수를 입력받는다.(Scanner)
//2. 입력받은 데이터를 "이름 : 점수 \n"형식으로 문자열로 만들어 파일에 쓴다
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 score.txt로 저장되며, 기존 내용은 덮어씁니다
//5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화한다.
public class Exam1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);

		try {
			fos = new FileOutputStream("D:\\full_stack_kty\\3.JAVA\\score.txt");

			while (true) {

				System.out.print("이름 : ");
				String name = sc.next();
				//대문자 무시하고 값을 검증
				if (name.equalsIgnoreCase("exit")) {
					System.out.println("파일 저장 완료");
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				System.out.print("점수 : ");
				String score = sc.next();

				StringBuilder sb = new StringBuilder();
				
				String scores = name + " : " + score + "\n";
				for(int i =0; i<scores.length();i++) {
					char ch = scores.charAt(i);
					ch +=3;
					sb.append(ch);
				}

				fos.write(sb.toString().getBytes());
			}
			
			System.out.println("복호화 : ");
			
			FileInputStream fis = new FileInputStream("D:\\\\full_stack_kty\\\\3.JAVA\\\\score.txt");
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			String s = new String(buffer);
			
			String result = "";
			for(int i = 0 ; i<buffer.length;i++) {
				char ch = s.charAt(i);
				result += (char)(ch-3);
			}
			
			System.out.println(result);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block

			}

		}
	}
}
