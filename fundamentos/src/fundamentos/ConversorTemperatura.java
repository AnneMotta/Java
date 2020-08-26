package fundamentos;

public class ConversorTemperatura {
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - AJUSTE)*FATOR;
		System.out.println(celsius);
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE)*FATOR;
		System.out.println(celsius);
	}
}
