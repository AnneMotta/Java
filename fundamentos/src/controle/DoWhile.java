package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String magicas = "";
		
		do {
			System.out.print("Caso queira sair, digite as palavras magicas: ");
			magicas = input.nextLine();
		}while(!magicas.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigada!");
		input.close();;
		
	}
}
