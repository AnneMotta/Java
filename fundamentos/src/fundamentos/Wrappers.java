package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		Byte b = 100;
		Short s =1000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.equals(b));
		
		Float f = 50.5F;
		System.out.println(f);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
	}
}
