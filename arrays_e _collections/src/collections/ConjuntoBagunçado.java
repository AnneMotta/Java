package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1);
		conjunto.add("valores");
		conjunto.add(2.8);
		conjunto.add(false);
		System.out.println(conjunto.size());
		
		conjunto.add(1);
		System.out.println(conjunto.size());
		
		conjunto.remove(true);
		conjunto.remove(2.8);
		System.out.println(conjunto.size());
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(conjunto);
		System.out.println(num);		
		
//		System.out.println(num.retainAll(conjunto));
//		System.out.println(num);
		
		System.out.println(conjunto.addAll(num));
		System.out.println(conjunto);
		conjunto.clear();
		
		
		
		
		
		
		
		
	}
	
}
