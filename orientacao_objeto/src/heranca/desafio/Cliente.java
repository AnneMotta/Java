package heranca.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double getValor() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.getValorTotalItem();
		}
		return total;
	}
}
