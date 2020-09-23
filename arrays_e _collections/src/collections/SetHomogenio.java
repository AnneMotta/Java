package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogenio {
	public static void main(String[] args) {
		
		SortedSet<String> listaAprovades = new TreeSet<>();
		listaAprovades.add("Anne");
		listaAprovades.add("Petra");
		listaAprovades.add("Gabi");
		
		for(String nomes: listaAprovades) {
			System.out.println(nomes);
		}
		
		Set<Integer> adicaonumeros = new HashSet<>();
		adicaonumeros.add(7);
		adicaonumeros.add(27);
		adicaonumeros.add(378);
		
		for (int numeros: adicaonumeros) {
			System.out.println(numeros);
		}
		
	
	}
}
