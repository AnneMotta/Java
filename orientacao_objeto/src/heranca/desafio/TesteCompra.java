package heranca.desafio;

public class TesteCompra {
	public static void main(String[] args) {
		
		Compra compraum = new Compra();
		compraum.addItem("Blusa de moletão", 150.98, 2);
		compraum.addItem("Sapato", 360, 1);

		
		Compra compradois = new Compra();
		compradois.addItem("Shorts", 100, 3);
		compradois.addItem("Botas", 250, 4);		
		
		Cliente cliente = new Cliente("Julia");
		cliente.addCompra(compraum);
		cliente.addCompra(compradois);
		
		System.out.println(cliente.getValor());
	}
}
