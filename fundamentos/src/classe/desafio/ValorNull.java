package classe.desafio;

public class ValorNull {
	public static void main(String[] args) {
		
		Data dt1 = Math.random() > 0.5 ? new Data() : null;
		if (dt1 != null) {
			dt1.mes = 3;
			System.out.println(dt1.obterDataFormatada() );
		}
		
		String st = Math.random() > 0.5 ? "Opa" : null;
		if (st != null) {
			System.out.println(st.concat("!!!"));
		}
	
	}
}
