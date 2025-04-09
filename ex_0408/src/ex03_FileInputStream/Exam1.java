package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고
		//문장을 입력하고 저장을한다
		//FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		String path = "D:\\full_stack_kty\\3.JAVA\\file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_read);
				String res = new String(b_read).trim();
				
				String[] lines = res.split("\r\n|\r|\n");
				ArrayList<String> arr_res =new ArrayList<>();
				
				for (String line : lines) {
					arr_res.add(line);
				}
				
				for (int i = 0; i < arr_res.size(); i++) {
					String original = arr_res.get(i).trim();
					String reversed = new StringBuilder(res).reverse().toString();

					System.out.println("원본: " + original);
					if (res.equals(reversed)) {
						System.out.println("=> 회문입니다.");
					} else {
						System.out.println("=> 회문이 아닙니다.");
					}
				}
		
			} catch (Exception e) {
				// TODO: handle exception
			}
			 finally {
					try {
						if (fis != null) {
							fis.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
		}
		
	}
}
