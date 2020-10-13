package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	void testeAcessos() {
		//System.out.println(segredo); -> Visivel apenas na Classe Ana
		//System.out.println(maniasCaseiras); -> Visivel a nivel de pacote
		System.out.println(dialetica);
		System.out.println(personalidade);

	}
}
