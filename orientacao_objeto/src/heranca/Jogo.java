package heranca;

public class Jogo {
	public static void main(String[] args) {
		Visitantes oponente = new Visitantes();
		oponente.x = 10;
		oponente.y = 10;
		
		TimeCasa  jogador= new TimeCasa();
		jogador.x = 10;
		jogador.y = 11;
		
//		jg.andar(Direcao.NORTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.LESTE);
//		jg.andar(Direcao.OESTE);
//		jg.andar(Direcao.SUL);
//		jg.andar(Direcao.SUL);
		
		System.out.println(jogador.vida);
		System.out.println(oponente.vida);
		
		jogador.atacar(oponente);
		oponente.atacar(jogador);
		jogador.atacar(oponente);
		
		System.out.println(jogador.vida);
		System.out.println(oponente.vida);
		
	}
}
