package exam4;

public class Calc extends Calculator {

	public int avgrage;

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int i=0; i<a.length;i++) {		
			sum += a[i];
		}
		return sum / a.length;
	}
	
}
