package lambdas.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Cam", "Gui", "Sil" );
		System.out.println("Forma tradicional:");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nLambda#1");
		aprovados.forEach((nome) -> {System.out.println(nome);});
		System.out.println("\nMetod References");
		aprovados.forEach(System.out::println);
	}
}
