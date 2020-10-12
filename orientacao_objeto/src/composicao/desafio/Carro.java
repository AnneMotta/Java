package composicao.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar(){
		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA ) {
			velocidadeAtual += delta;			
		}
	}
	
	void frear() {
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
