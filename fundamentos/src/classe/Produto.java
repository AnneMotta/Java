package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeIncial, double precoIncial){
		nome = nomeIncial;
		preco = precoIncial;
		
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
}
