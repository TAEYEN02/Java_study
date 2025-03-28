package exam3;

public class Car {
	private int gesGauge;
	
	public int getGesGauge() {
		return gesGauge;
	}

	public void setGesGauge(int gesGauge) {
		this.gesGauge = gesGauge;
	}

	public void showCurrentGauge() {
		System.out.println("가스 잔여량 : "+gesGauge);
	}
}
