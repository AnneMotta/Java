package lambdas;

public class TesteFuncaoLambdas {
	public static void main(String[] args) {
		
		Calculo calc = (x,y) -> {
			return x + y;
		};
		System.out.println(calc.executar(5, 6));
		
		calc = (x,y) -> x * y;
		System.out.println(calc.executar(5, 6));
		
		System.out.println(calc.padrao());
		System.out.println(Calculo.statico());
	}
}
