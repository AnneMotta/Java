package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); -> Visivel apenas na Classe Ana
		//System.out.println(sogra.maniasCaseiras); -> Visivel a nivel de pacote
		//System.out.println(sogra.dialetica); -> Vis�vel a n�vel de pacote e heran�a
		System.out.println(sogra.personalidade);

	}
}
