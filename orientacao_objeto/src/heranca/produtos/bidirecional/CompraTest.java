package heranca.produtos.bidirecional;

public class CompraTest {
		
	public static void main(String[] args) {
	
		Compra compra_um = new Compra();
		compra_um.cliente = "Anne Motta";
		compra_um.adicionarItem("Livro", 2, 89.50);
		compra_um.adicionarItem("Caderno", 3, 50.98);
		compra_um.adicionarItem(new Item ("Caneta", 5, 23.74));
		
		System.out.println(compra_um.getValorTotal());
	}
}
