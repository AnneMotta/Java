package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//	Offer e Add -> Adicionam elementos a fila
		
		//Diferença é o comportamento que ocorre quando a fila está cheia
		fila.add("Gabs");
		fila.add("Nameku");
		fila.add("Kel");
		fila.add("Sil");
		fila.add("Bea");
		
		//Peek e Element -> obter o próximo elemento da fila (sem remover)
		//Diferença -> quando fila está vazia
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.element()); //Lança uma exceção
		
		//Poll e Remove -> obter o próximo elemento da fila e remove
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		System.out.println("===============");
		
		for(String f: fila) {
			System.out.println(f);
		}
		
		System.out.println("Está vazio? " + fila.isEmpty());
		fila.clear();
		System.out.println("Está vazio? " + fila.isEmpty());
	}
}
