package exam3;

public class HybridCar extends Car {
	private int electricGauge;
	


	public int getElectricGauge() {
		return electricGauge;
	}


	public void setElectricGauge(int electricGauge) {
		this.electricGauge = electricGauge;
	}
	
	@Override
	public int getGesGauge() {
		return super.getGesGauge();
	}

	
	public void showHybridCar() {
		System.out.println("잔여 가스량 : "+electricGauge);
	}


}
