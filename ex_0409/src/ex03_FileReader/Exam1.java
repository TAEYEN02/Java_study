package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		//text.txt파일을 만들고 한글, 영어(대문자, 소문자)섞어서 작성
		//text.txt파일의 내용을 읽어와서
		//영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요
		//대문자 : x개
		//소문자 : x개
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\full_stack_kty\\3.JAVA\\text.txt");
			
			int read = 0;
			int scount = 0;
			int lcount = 0;
			while((read = fr.read()) != -1) {
				if((char)read >= 'a' & (char)read <= 'z') {
					scount++;
				}else if((char)read >='A'&(char)read<='Z') {
					lcount++;
				}
				System.out.print((char)read);
			}
			System.out.println();
			System.out.println("대문자 : "+lcount);
			System.out.println("소문자 : "+scount);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
