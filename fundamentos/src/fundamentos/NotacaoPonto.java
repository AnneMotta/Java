package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String exemplo1 = "Ol�";
		exemplo1 = exemplo1.concat(", como vai?");
		exemplo1 =  exemplo1.replace("Ol�", "E a�");
		exemplo1 = exemplo1.toUpperCase();
		System.out.println(exemplo1);
		
		System.out.println("E a�".concat(", tudo bem?").replace("E a�", "Ol�").toUpperCase());
		
		
	}
}
