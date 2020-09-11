package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();	
		p1.nome = "Notebook";
		p1.preco = 4700;
		p1.desconto = 0.30;
		
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1700;
		p2.desconto = 0.25;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto); 
		double precoFinal2 = p2.preco * (1 - p1.desconto); 
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}
}
