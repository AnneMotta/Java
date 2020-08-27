package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos= 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false;
		char status = 'A'; //Ativo
		
		System.out.println("O funcionario com o id: " + id);
		System.out.println("Com o status A|Ativo ou I|Inativo: " + status);
		System.out.println("Possui o salario no valor de " + salario);
		System.out.println("Trabalhou por " + anosDeEmpresa * 360 + " dias");
		System.out.println("Viajou certa de " + numeroDeVoos/2 + " vezes");
		System.out.println("Tem score de " + pontosAcumulados/vendasAcumuladas);
		System.out.println("Status de ferias: " + estaDeFerias);
		
	
		
	}
}
