package composicao.jogo;

public class TimeCasa extends Jogador{
	
	public TimeCasa(int x, int y) {
		super(x, y);
		
	}
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
}
