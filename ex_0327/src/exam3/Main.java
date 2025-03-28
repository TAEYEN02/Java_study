package exam3;

public class Main {
	public static void main(String[] args) {
		HybridWaterCar hc = new HybridWaterCar();
		hc.setGesGauge(30);
		hc.setElectricGauge(30);
		hc.setWaterGauge(30);
		
		hc.showHybridWaterCar();
	}
}
