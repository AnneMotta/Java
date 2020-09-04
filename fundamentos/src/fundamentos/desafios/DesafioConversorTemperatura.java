package fundamentos.desafios;

public class DesafioConversorTemperatura {
	//(30 °C × 9/5) + 32 = 86 °F
	
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 9/5;
		double celsius = 45;
		
		double fahrenheit = (celsius - AJUSTE)* (FATOR);
		double conversao = ( celsius - 32 ) * 5/9;
		System.out.println(fahrenheit);
		System.out.println(conversao);
	}
}
