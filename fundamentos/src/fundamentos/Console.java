package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String name = input.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String lastName = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		int age = input.nextInt();
		
		System.out.printf("Cliente %s %s, idade de %d anos!", name, lastName, age);
		
		input.close();
	}
}
