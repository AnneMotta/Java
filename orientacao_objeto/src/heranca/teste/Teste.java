package heranca.teste;

import heranca.desafio.Civic;
import heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(400);
		Civic civic = new Civic();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("*************************");
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		
		civic.frear();
		
		System.out.println("*************************");
		System.out.println(ferrari);
		System.out.println(civic);
		
		System.out.println(ferrari.velocidadeDoAr());
	}
}
