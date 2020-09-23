package collections;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
	
	public static void main(String[] args) {
		List<Usuario> listausuario = new ArrayList<>();
		listausuario.add(new Usuario("Zilda"));
		listausuario.add(new Usuario("Jonas"));
		listausuario.add(new Usuario("Jessica"));
		listausuario.add(new Usuario("Juninho"));
		
		System.out.println(listausuario.get(1));
		System.out.println("Removeu? " + listausuario.remove(new Usuario("Jonas")));
		System.out.println(listausuario.remove(1));
		System.out.println("Contém: " + listausuario.contains(new Usuario("Juninho")));
		
		for(Usuario user: listausuario) {
			System.out.println(user.nome);
		}
	}
	
}
