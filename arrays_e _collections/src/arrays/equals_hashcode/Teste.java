package arrays.equals_hashcode;

public class Teste {
	
	public static void main(String[] args) {
		Usuario pessoa_1 = new Usuario();
		pessoa_1.nome = "Machado de Asis";
		pessoa_1.email = "machadodeassis@email.com";
		
		
		Usuario pessoa_2 = new Usuario();
		pessoa_2.nome = "Machado de Asis";
		pessoa_2.email = "machadodeassis@email.com";
		
		System.out.println(pessoa_1 == pessoa_2);
		System.out.println(pessoa_1.equals(pessoa_2));
		
	}
}
