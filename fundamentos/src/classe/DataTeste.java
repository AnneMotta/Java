package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data dt = new Data();
		dt.dia = 11;
		dt.mes = 9;
		dt.ano = 2020;
		
		System.out.printf("Dia %d/%d/%d", dt.dia, dt.mes, dt.ano);
	}

}
