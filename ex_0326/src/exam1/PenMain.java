package exam1;

public class PenMain {
	public static void main(String[] args) {
		Pen p = new Pen();
		FountainPen Fp = new FountainPen();
		Ballpen Bp = new Ballpen();
		SharpPencil Sp = new SharpPencil();
		
		p.color = "빨간색";
		p.setAmount(10);
		System.out.println("Pen : "+  p.color+p.getAmount());
		System.out.println("--------------");
	}
}
