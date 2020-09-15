package classe;

public class AreaCircTeste {
	 public static void main(String[] args) {
		 
		 AreaCirc area_1 = new AreaCirc(5);
		 System.out.println(area_1.calculo());
		 
		 AreaCirc area_2 = new AreaCirc(5);
		 area_2.raio = 10;
		 System.out.println(area_2.calculo());
		 
		 
		 System.out.println(AreaCirc.calculo(5));
	}
}
