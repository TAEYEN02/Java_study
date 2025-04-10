package ex05_enum;

public class TransportMain {
	public static void main(String[] args) {
		//각 운송수단별 100을 갔을 때 금액
		//name : xxx, 100km - fare : xxx
		//name : xxx, 100km - fare : xxx
		//name : xxx, 100km - fare : xxx
		//name : xxx, 100km - fare : xxx
		
		Transportaion[] trans = Transportaion.values();
		
		
		for(Transportaion t : trans ) {
			System.out.println("name : "+ t.name() + ", 100km - fare : "+t.totalFare(100));
		}
	}
}
