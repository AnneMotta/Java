package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	default String padrao() {
		return "Possibilidade de associar metodo default na Interface";
	}
	
	static String statico() {
		return "Possibilidade de associar metodo static na Interface Funcional";
	}
}
