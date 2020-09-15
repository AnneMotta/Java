package classe.desafio;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data( int diaIncial, int mesIncial, int anoIncial){
		dia = diaIncial;
		mes = mesIncial;
		ano = anoIncial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
