package controle.desafio;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "*";
		for(int i = 1; i<=10; i++) {
			System.out.println(valor);
			valor += "*";
		}
		
		System.out.println();
		
		for(String j = "#"; !j.equalsIgnoreCase("##########"); j += "#") {
			System.out.println(j);;
		}
	}
}
