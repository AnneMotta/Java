package controle.desafio;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		int diaDaSemana = input.nextInt();
//		if(diaDaSemana == 1) {
//			System.out.println("Domingo");
//		}else if (diaDaSemana == 2) {
//			System.out.println("Segunda-feira");
//		}else if (diaDaSemana == 3) {
//			System.out.println("Terça-feira");
//		}else if (diaDaSemana == 4) {
//			System.out.println("Quarta-feira");
//		}else if (diaDaSemana == 5) {
//			System.out.println("Quinta-feira");
//		}else if (diaDaSemana == 5) {
//			System.out.println("Sexta-feira");
//		}else
//			System.out.println("Dia não identificado");

		
		String diaSemana = input.nextLine();
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}else if (diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if (diaSemana.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		}else if (diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		}else if (diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		}else if (diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		}else if (diaSemana.equalsIgnoreCase("Sábado") || (diaSemana.equalsIgnoreCase("Sabado"))) {
			System.out.println(7);
		}else
			System.out.println("Dia não identificado");
		input.close();
		
	}
}
