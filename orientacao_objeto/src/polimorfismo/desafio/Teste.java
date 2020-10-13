package polimorfismo.desafio;

public class Teste {
	public static void main(String[] args) {
		Pessoa cliente = new Pessoa(51.00);
		System.out.println(cliente.getPeso());
		Arroz arroz = new Arroz(0.1);
		Feijao feijao = new Feijao(0.18);
		Salada salada =  new Salada(0.09);
		
		cliente.come(feijao);
		cliente.come(arroz);
		cliente.come(salada);
		
		System.out.println(cliente.getPeso());
	}
	
}
