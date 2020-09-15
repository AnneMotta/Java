package classe;

public class AreaCirc {	
	double raio;
	final static double PI = 3.14;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double calculo(){
		return Math.pow(raio, 2) * PI;
	}
	
	static double calculo(double raio) {
		return Math.pow(raio, 2) * PI;
	}
}
