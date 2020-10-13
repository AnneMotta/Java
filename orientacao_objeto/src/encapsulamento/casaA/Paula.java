package encapsulamento.casaA;

public class Paula {
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); -> Visivel apenas na Classe Ana
		System.out.println(esposa.maniasCaseiras);
		System.out.println(esposa.dialetica);
		System.out.println(esposa.personalidade);

	}
}
