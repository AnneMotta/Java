package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
		public static void main(String[] args) {
			Map<Integer, String> usuarios = new HashMap<>();
			usuarios.put(1, "Carla");
			usuarios.put(2, "Ricardo");
			usuarios.put(3, "Luana");
			usuarios.put(4, "Fernando");
			usuarios.put(5, "Lorena");
			
			usuarios.put(2, "Denis");
			
			System.out.println(usuarios.size());
			System.out.println(usuarios.isEmpty());
			System.out.println(usuarios.keySet());
			System.out.println(usuarios.values());
			System.out.println(usuarios.entrySet());
			System.out.println(usuarios.containsKey(6));
			System.out.println(usuarios.containsValue("Fernanda"));
			System.out.println(usuarios.get(5));
			
			for(int chave: usuarios.keySet()) {
				System.out.println(chave);
			}
			for(String nome: usuarios.values()) {
				System.out.println(nome);
			}
			for(Entry<Integer, String> registro: usuarios.entrySet()) {
				System.out.println(registro);
			}
			
		}
}
