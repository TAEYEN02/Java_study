package ex04_casting;

public class Ex02_Casting {

	public static void main(String[] args) {
		//double -> float(float의 범위 내일때)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float] \nd1의 값 : " +d1+"\nf1의 값 : " + f1);
		System.out.println("====================");
		
		//double -> float(float의 최소 범위보다 작을경우)
		//float의 최솟값 : 1.4 x 10의 -45승
		double d2 = 1.0e-50; //1.0 x 10의 -50승
		float f2 = (float)d2;
		System.out.println("[double -> float] \nd2의 값 : " +d2+"\nf2의 값 : " + f2);
		System.out.println("====================");
		
		//double -> float(float의 최대 범위보다 큰 경우)
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("[double -> float] \nd3의 값 : " +d3+"\nf3의 값 : " + f3);
		System.out.println("====================");
		
		//double과 float의 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[double -> float] \nd4의 값 : " +d4+"\nf4의 값 : " + f4);
	}

}
