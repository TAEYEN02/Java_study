package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		Operation[] op = Operation.values();
		int a= 20;
		int b=5;
		
		for(Operation p : op ) {
			System.out.printf("%S : %d \n",p.name(),p.apply(a,b));
		}
		
		
	}
}
