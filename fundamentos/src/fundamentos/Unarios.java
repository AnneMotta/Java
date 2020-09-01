package fundamentos;

public class Unarios {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		a++;
		System.out.println(a);
		b++;
		System.out.println(b);
		
		a--;
		System.out.println(a);
		b--;
		System.out.println(b);
		
		System.out.println(++a == b++);
		System.out.println(a-- == b--);
		
	}
}
