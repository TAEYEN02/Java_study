package ex01_class_casting;

public class FourWheelBike extends Bike {

	public FourWheelBike(String riderName) {
		super(riderName);
		
	}
	
	@Override
	public void info() {
		super.info();
	}
	
	public void addWheel() {
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName +"의 자전거에 보조바퀴 2개를 부착하였습니다");
		}else {
			System.out.println(riderName +"의 자전거에 보조바퀴가 이미 있습니다.");
		}
	}

}
