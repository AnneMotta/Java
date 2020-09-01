package fundamentos;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho_dia_um = false;
		boolean trabalho_dia_dois = false;
		
		boolean resposta1 = trabalho_dia_um && trabalho_dia_dois;
		System.out.println("Você poderá comprar a TV de 50\": " + resposta1);
		boolean resposta2 = trabalho_dia_um ^ trabalho_dia_dois;    
		System.out.println("Você poderá comprar a TV de 30\": " + resposta2);
		boolean resposta3 = trabalho_dia_um || trabalho_dia_dois;
		System.out.println("Você poderá comprar sorvete a sua familia: " + resposta3);
		boolean sem_sorvete=  !resposta3; //operador unario
		System.out.println("Você não comprou sorvete: " +  sem_sorvete + 
				". Não desanime, suas conquistas logo chegará. Poderas comprar sua TV "
				+ "e sorteve a sua familia");
		System.out.println("\n");
		
		
		//--------------------DESAFIO PESSOAL-------------------------------
		Scanner input = new Scanner(System.in);
		System.out.println("Você trabalhou no primeiro dia: ");
		trabalho_dia_um = input.nextBoolean();
		System.out.println("Você trabalhou no segundo dia: ");
		trabalho_dia_dois = input.nextBoolean();
		
		resposta1 = trabalho_dia_um && trabalho_dia_dois;
		System.out.println("Você poderá comprar a TV de 50\": " + resposta1);
		resposta2 = trabalho_dia_um ^ trabalho_dia_dois;
		System.out.println("Você poderá comprar a TV de 30\": " + resposta2);
		resposta3 = trabalho_dia_um || trabalho_dia_dois;
		System.out.println("Você poderá comprar sorvete a sua familia: " + resposta3);
		sem_sorvete=  !resposta3;
		System.out.println("Você não comprou sorvete: " +  sem_sorvete + 
				". Não desanime, suas conquistas logo chegará. Poderas comprar sua TV "
				+ "e sorteve a sua familia");
		
		input.close();
		
		
		
	}
}
