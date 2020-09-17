package arrays_collections.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		//programa que captura a quantidade de notas que o aluno irá fornecer, soma a notas e imprime resultado
		
		
		System.out.print("Digite a quantidade de notas a serem informadas: ");
		Scanner input = new Scanner(System.in);
		int quantidade_notas = input.nextInt();
		double[] notas = new double [quantidade_notas];
		
		for(int i = 0; i<quantidade_notas; i++) {
			System.out.print("Digite sua nota: ");
			notas[i] = input.nextDouble();
		}
		
		System.out.println("Notas informadas: " + Arrays.toString(notas));
		double total_notas = 0;
		for (double nota : notas) {
			total_notas += nota;
		}
		
		double media = total_notas/ notas.length;
		System.out.println("Sua média é " + media); 
		input.close();
	}
}
