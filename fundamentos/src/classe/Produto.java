package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeIncial, double precoIncial,
			double descontoIncial){
		nome = nomeIncial;
		preco = precoIncial;
		desconto = descontoIncial;
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
}
