package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<>();
		usuario.add(new Usuario("Jo�o"));
		usuario.add(new Usuario("Larissa"));
		usuario.add(new Usuario("Xina"));
		
		boolean resultado = usuario.contains(new Usuario("China"));
		System.out.println(resultado);
	}
}
