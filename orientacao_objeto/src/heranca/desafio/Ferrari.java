package heranca.desafio;

public class Ferrari extends Carro{
	
	public Ferrari() {
		this(320);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
}
