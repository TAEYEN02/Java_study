package ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERD;
		try {
			System.out.println("현재 상태 :" +status);
			status = status.next();
			System.out.println("현재 상태 :" +status);
			status = status.next();
			System.out.println("현재 상태 :" +status);
			status = status.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 발생 : "+e.getMessage());
		}

		
		
	}
}
