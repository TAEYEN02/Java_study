package exam3;

public class HybridWaterCar extends HybridCar{
	private int waterGauge;
	
	public int getWaterGauge() {
		return waterGauge;
	}
	public void setWaterGauge(int waterGauge) {
		this.waterGauge = waterGauge;
	}
	@Override
	public int getGesGauge() {
		return super.getGesGauge();
	}
	@Override
	public int getElectricGauge() {
		return super.getElectricGauge();
	}
	
	public void showHybridWaterCar() {
		showCurrentGauge();
		showHybridCar();
		System.out.println("잔여 물량 출력 : "+waterGauge);
		
	}
	
	
	
}
