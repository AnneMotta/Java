package encapsulamento;

public class Teste {
	public static void main(String[] args) {
		Pessoa anne = new Pessoa("Anne", "Motta", 22);
		anne.setIdade(-23);
		System.out.println(anne.getIdade());
		System.out.println(anne);
		System.out.println(anne.getNomeCompleto());
	}
}
