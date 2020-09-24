package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		livros.push("Kindred");
		livros.push("Admiravel mundo novo");
		livros.push("1884");
		livros.push("Procure por mim na tempestade");
		
		for(String lista: livros) {
			System.out.println(lista);
		}
		
		System.out.println("=======================");
		System.out.println(livros.element());
		
		System.out.println("=======================");
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println("=======================");
		System.out.println(livros.peek());
	}
}
