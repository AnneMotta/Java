package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		var numeradorA= Math.pow(6*(3+2), 2);
		var DenominadorA = 3*2;
		var superiorA = numeradorA/DenominadorA;
		System.out.println(superiorA);
		
		var numeradorB =((1-5)*(2-7));
		var  DenominadorB = 2;
		var superiorB = Math.pow(numeradorB/DenominadorB, 2);
		System.out.println(superiorB );
		
		var superior =Math.pow(superiorA - superiorB, 3);
		var inferior = (Math.pow(10, 3));
		
		var total = superior/inferior;
		System.out.println( total);
	
	}
}
