package controle;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		System.out.print("Insira sua nota: ");
		
		Scanner input = new Scanner(System.in);
		int nota = input.nextInt();
		
		switch (nota) {
		case 10: case 9:
			System.out.println("Conceito A");
			break;
		case 8: case 7:
			System.out.println("Conceito B");
			break;
		case 6: case 5:
			System.out.println("Conceito C");
			break;
		case 4: case 3:
			System.out.println("Conceito D");
			break;
		case 2: case 1:
			System.out.println("Conceito E");
			break;
		default:
			System.out.println("Valor n�o encontrado: " + nota);
			break;
		}
		
		input.close();
	}
	
}
