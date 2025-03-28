package ex02_exception;

public class Ex02_NumberFormatException {
	public static void main(String[] args) {
		// 잘못된 문자열을 숫자로 형변환할 때 발생
		String str01 = "11";
		String str02 = "11.2";
		// 정수형태의 문자열을 정수로 변경
		int num01 = Integer.parseInt(str01);

		System.out.println("String to int : " + num01);

//		int num02 = Integer.parseInt(str02);
//		오류 => str02는 Float형이기 때문
//		System.out.println("String to int : " + num02);

		float num02 = Float.parseFloat(str02);
		System.out.println("String to int : " + num02);
	}
}
