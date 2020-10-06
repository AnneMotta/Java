package heranca;

public class Jogo {
	public static void main(String[] args) {
		Visitantes jogador = new Visitantes();
		jogador.x = 10;
		jogador.y = 11;
		
		TimeCasa oponente = new TimeCasa();
		oponente.x = 10;
		oponente.y = 10;
		
//		jg.andar(Direcao.NORTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.OESTE);
//		jg.andar(Direcao.SUL);
//		jg.andar(Direcao.SUL);
		
		System.out.println(oponente.vida);
		System.out.println(jogador.vida);
		
		jogador.atacar(oponente);
		
		System.out.println(oponente.vida);
		System.out.println(jogador.vida);
		
	}
}
