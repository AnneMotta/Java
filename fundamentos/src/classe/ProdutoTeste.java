package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4700);	
		Produto p2 = new Produto("Celular", 1700);
		//Produto.desconto = 0.50; 
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double carrinho = (precoFinal1 + precoFinal2);

		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		System.out.printf("Média do carrinho = R$%.2f.",carrinho);
		
	}
}
