package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double media = input.nextDouble();
		String resultado = media>7 ? "aprovade" : media<4 ? "reprovade" : "em recuperação";
		System.out.printf("E alune está %s", resultado);
		input.close();
	}
}
