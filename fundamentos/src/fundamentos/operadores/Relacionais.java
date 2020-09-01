package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		//CURIOSIDADE
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		System.out.println('\u0061');
		//FIM CURIOSIDADE
		
		System.out.println(37 == 0);
		System.out.println(9 >= 8);
		System.out.println(80 < 81);
		System.out.println(90 <= 81);
		System.out.println(71 != 72);
		
		double nota = 9.9;
		boolean comportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = comportamento && passouPorMedia;
		System.out.println("\nOlune, tem desconto: " + temDesconto);
	}
}
