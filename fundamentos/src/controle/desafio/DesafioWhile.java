package controle.desafio;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Para sair do programa digite '-1'");
		double nota = 0;
		double total = 0;
		int contador = 0;
		
		while(nota != -1) {
			
			System.out.println("Digite sua nota");
			nota = input.nextDouble();
			if(nota<=10 && nota >= 0) {
				total += nota;
				contador++;
			}else if(nota != -1) {
				System.out.println("Digite uma nota válida");
				}
		}
		double media = total/contador;
		System.out.println("Total das medias " + media);
		input.close();
	}
}
