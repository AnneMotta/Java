package fundamentos;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho_dia_um = false;
		boolean trabalho_dia_dois = false;
		
		boolean resposta1 = trabalho_dia_um && trabalho_dia_dois;
		System.out.println("Voc� poder� comprar a TV de 50\": " + resposta1);
		boolean resposta2 = trabalho_dia_um ^ trabalho_dia_dois;    
		System.out.println("Voc� poder� comprar a TV de 30\": " + resposta2);
		boolean resposta3 = trabalho_dia_um || trabalho_dia_dois;
		System.out.println("Voc� poder� comprar sorvete a sua familia: " + resposta3);
		boolean sem_sorvete=  !resposta3; //operador unario
		System.out.println("Voc� n�o comprou sorvete: " +  sem_sorvete + 
				". N�o desanime, suas conquistas logo chegar�. Poderas comprar sua TV "
				+ "e sorteve a sua familia");
		System.out.println("\n");
		
		
		//--------------------DESAFIO PESSOAL-------------------------------
		Scanner input = new Scanner(System.in);
		System.out.println("Voc� trabalhou no primeiro dia: ");
		trabalho_dia_um = input.nextBoolean();
		System.out.println("Voc� trabalhou no segundo dia: ");
		trabalho_dia_dois = input.nextBoolean();
		
		resposta1 = trabalho_dia_um && trabalho_dia_dois;
		System.out.println("Voc� poder� comprar a TV de 50\": " + resposta1);
		resposta2 = trabalho_dia_um ^ trabalho_dia_dois;
		System.out.println("Voc� poder� comprar a TV de 30\": " + resposta2);
		resposta3 = trabalho_dia_um || trabalho_dia_dois;
		System.out.println("Voc� poder� comprar sorvete a sua familia: " + resposta3);
		sem_sorvete=  !resposta3;
		System.out.println("Voc� n�o comprou sorvete: " +  sem_sorvete + 
				". N�o desanime, suas conquistas logo chegar�. Poderas comprar sua TV "
				+ "e sorteve a sua familia");
		
		input.close();
		
		
		
	}
}
