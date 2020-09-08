package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Caso não deseja continuar, digite 'sair'");
		String parar = "";
		
		while (!parar.equalsIgnoreCase("sair")) {
			System.out.println("Finalize a frase! \nOs bananas ...");
			parar  = input.next();
//			System.out.printf("Os demonios %s", finalizacao);		
		}
		input.close();	
	}
}
