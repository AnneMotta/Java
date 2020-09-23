package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//	Offer e Add -> Adicionam elementos a fila
		
		//Diferen�a � o comportamento que ocorre quando a fila est� cheia
		fila.add("Gabs");
		fila.add("Nameku");
		fila.add("Kel");
		fila.add("Sil");
		fila.add("Bea");
		
		//Peek e Element -> obter o pr�ximo elemento da fila (sem remover)
		//Diferen�a -> quando fila est� vazia
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.element()); //Lan�a uma exce��o
		
		//Poll e Remove -> obter o pr�ximo elemento da fila e remove
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		System.out.println("===============");
		
		for(String f: fila) {
			System.out.println(f);
		}
		
		System.out.println("Est� vazio? " + fila.isEmpty());
		fila.clear();
		System.out.println("Est� vazio? " + fila.isEmpty());
	}
}
