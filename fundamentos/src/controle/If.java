package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe sua nota: ");
		double nota = input.nextDouble();
		
		if (nota <=10 && nota >= 7) {
			System.out.println("Voc� passou, continue estudando");
		}if (nota <7 && nota >4) {
			System.out.println("Voc� est� de recupera��o continue estudando");
		}if(nota<=4) {
			System.out.println("Voc� n�o "
					+ "passou, mas n�o se desespere. Continue estudando!");
		}
		input.close();
	}
}
