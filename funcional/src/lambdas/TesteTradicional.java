package lambdas;

public class TesteTradicional {
	public static void main(String[] args) {
		
		Calculo calc = new Soma();
		System.out.println(calc.executar(5, 6));
		
		
		calc = new Multiplicacao();
		System.out.println(calc.executar(5, 6));
		
		System.out.println(calc.padrao());
		System.out.println(Calculo.statico());
		
	}
}
