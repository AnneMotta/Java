package heranca.desafio;

public class Teste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(150);
		Civic civic = new Civic();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		
		System.out.println(ferrari);
		System.out.println(civic);
	}
}
