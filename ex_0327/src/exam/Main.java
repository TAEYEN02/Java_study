package exam;

public class Main {
	public static void main(String[] args) {

		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println("CalPlus : "+cp.getResult(20, 10));
		System.out.println("CalMinus : "+cm.getResult(30, 15));
	}
}
