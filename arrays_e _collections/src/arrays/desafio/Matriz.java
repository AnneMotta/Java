package arrays.desafio;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		System.out.print("Informe a quantidade de aluno em sala: ");
		Scanner input = new Scanner(System.in);
		int quantidade_aluno = input.nextInt();
		System.out.print("Informe a quantidade de notas: ");
		int quantidade_notas = input.nextInt();
		
		double[] alunos = new double[quantidade_aluno];
		double[] notas = new double [quantidade_notas];
		double total = 0;
			
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite as notas: ");
			for (int j = 0; j < notas.length; j++) {
				notas[j] = input.nextDouble();
				total += notas[j];
				
			}	
		}
		double media = total / (notas.length * alunos.length); 
		System.out.println("Média da turma: " + media);
		
		
		input.close();
		
	
	}
}
