package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String exemplo1 = "Olá";
		exemplo1 = exemplo1.concat(", como vai?");
		exemplo1 =  exemplo1.replace("Olá", "E aí");
		exemplo1 = exemplo1.toUpperCase();
		System.out.println(exemplo1);
		
		System.out.println("E aí".concat(", tudo bem?").replace("E aí", "Olá").toUpperCase());
		
		
	}
}
