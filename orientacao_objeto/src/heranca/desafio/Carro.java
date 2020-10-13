package heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(){
		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA ) {
			velocidadeAtual += delta;			
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		return "Velocidade Ferrari: " + velocidadeAtual + " km/h";
	}
}
