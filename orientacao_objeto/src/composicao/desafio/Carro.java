package composicao.desafio;

public class Carro {
	int velocidadeAtual;
	
	void acelerar(){
		if (velocidadeAtual < 200 ) {
			velocidadeAtual += 5;			
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
