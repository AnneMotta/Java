package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String primeirosalario = input.nextLine().replace(",", ".");
		String segundosalario = input.nextLine().replace(",", ".");
		String terceirosalario = input.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(primeirosalario);
		double valor2 = Double.parseDouble(segundosalario);
		double valor3 = Double.parseDouble(terceirosalario);
		double media = (valor1 + valor2 + valor3)/3;
		
		System.out.printf("Sua média salarial é " + media);
		
		input.close();
		
	}
}
