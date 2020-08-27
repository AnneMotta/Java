package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	 public static void main(String[] args) {
		double d = 5; //implicito
		float f = (float) 50.5; //explicito
		int i = 80000;
		byte b = (byte) i; //explicito | Perda de informação
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(i);
		System.out.println(b);
		
	}
}
