package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		String a = "2";
		System.out.println(a == "2");
		
		String b = new String("2");
		System.out.println( a == b );
		System.out.println(a.equals(b));
		
		Scanner input = new Scanner(System.in);
		String c = input.next();
		System.out.println(b.equals(c));
		
		String d = input.next();
		System.out.println(c.equals(d.trim()));
		input.close();

	}

}
