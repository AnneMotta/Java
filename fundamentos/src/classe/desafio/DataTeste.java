package classe.desafio;

public class DataTeste {

	public static void main(String[] args) {
	
		Data dt_1 = new Data();		
		Data dt_2 = new Data(14, 9, 2021);
		
		System.out.println(dt_1.obterDataFormatada());
		System.out.println(dt_2.obterDataFormatada());
	}

}
