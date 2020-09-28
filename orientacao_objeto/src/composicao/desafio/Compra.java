package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	Cliente cliente;
	final List<Item> itens = new ArrayList<>();
	

	void addItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	double getValorTotalItem() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade_produto * item.produto.preco;
		}
		return total;	
	}
	
}
