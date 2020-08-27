package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String exemplo1 = "Mais um exemplo";
		
		System.out.println(exemplo1.startsWith("Ma"));
		System.out.println(exemplo1.charAt(5));
		System.out.println(exemplo1.toLowerCase());
		System.out.println(exemplo1.equalsIgnoreCase("Mais um exemplo"));
		System.out.println(exemplo1.contains("8"));
		
		
		String d = "desempenho";
		float c = 3000;
		System.out.printf("Viagem nos codigos para... \n Melhorar o %s e ganhar %.2f"
				+ " de satisfação pessoal", d, c);
		//========================================================================
		String frase = String.format("\n \nViagem nos codigos para... \n Melhorar o %s e ganhar %.2f"
				+ " de satisfação pessoal", d, c);
		System.out.println(frase);
	}
}
