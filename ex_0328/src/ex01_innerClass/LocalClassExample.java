package ex01_innerClass;

public class LocalClassExample {
	private int speed = 10;
	public void getUnit(String unitName) {
		
		//unitName = unitName+"님";
		
		class Unit{
			public void move() {
				System.out.println(unitName+"이 "+speed+"속도로 달리고 있습니다");
			}
		}
		Unit u = new Unit();
		u.move();
	}
	
	public static void main(String[] args) {
		LocalClassExample localClassExample = new LocalClassExample();
		localClassExample.getUnit("마린");
	}
	
	//지역 내부 클래스를 사용하는 이유
	//1.클래스를 외부로 뺄 필요 없이, 한정된 범위 내에서만 잠깐 사용할때
	// - 재사용성이 없고, 해당 메서드에만 사용하는 클래스라면, 외부에 클래스를
	//선언하지 않아도 돼서 코드가 간결해짐
	
	//2.상태나 기능이 조금 있는 일시적인 도우미 객체가 필요할때
	//- 단순변수, 함수로는 부족할때
	//- 일회성 객체에 상태/기능을 동시에 담고 있을때 
	
	
}
