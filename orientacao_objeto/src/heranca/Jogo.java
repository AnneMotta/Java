package heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador jg = new Jogador();
//		jg.x = 1;
//		jg.y = 1;
		
		jg.andar(Direcao.NORTE);
		jg.andar(Direcao.LESTE);
		jg.andar(Direcao.LESTE);
		jg.andar(Direcao.LESTE);
		jg.andar(Direcao.OESTE);
		jg.andar(Direcao.SUL);
		jg.andar(Direcao.SUL);
		
		System.out.println(jg.x);
		System.out.println(jg.y);
	}
}
