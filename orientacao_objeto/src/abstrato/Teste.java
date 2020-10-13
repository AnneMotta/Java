package abstrato;

public class Teste {
	
	public static void main(String[] args) {
		Mamifero maggie = new Cachorro();
		System.out.println(maggie.mover());
		System.out.println(maggie.respirar());
		System.out.println(maggie.mamar());
	}
	
}
