package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		//Tabela AND
		System.out.println(true && true);
		System.out.println(true && false);

		//Tabela OR
		System.out.println(false|| true);
		System.out.println(false|| false);
		
		//Tabela XOR --> exclusivo
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println(true ^ true); 
		
		//Tabela 
		System.out.println(!true);
		System.out.println(!false);
		
		//Tabela NOT
		System.out.println(!!true);
	
	}
}
