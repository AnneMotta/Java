package classe.desafio;

public class Jantar {	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ana", 73);
		Comida prato_1 = new Comida("salada", 0.136);
		Comida prato_2 = new Comida("lasanha", 0.25);
		
		System.out.println(p1.apresentar());
		p1.comer(prato_1);
		System.out.println(p1.apresentar());
		p1.comer(prato_2);
		System.out.println(p1.apresentar());
	}
}
