package ex04_overloading;

public class ConverterMain {
	public static void main(String[] args) {
		Converter c = new Converter();
		String unit;
		System.out.println("cm -> m : " + c.convert(1));
		System.out.println("m -> cm : " + c.convert(2, "m"));
		System.out.println("inch -> cm : " + c.convert(2, "inch"));
	}
}
