package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); -> Visivel apenas na Classe Ana
		//System.out.println(sogra.maniasCaseiras); -> Visivel a nivel de pacote
		//System.out.println(sogra.dialetica); -> Visível a nível de pacote e herança
		System.out.println(sogra.personalidade);

	}
}
