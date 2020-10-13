package encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobrenome;
	

	public Pessoa(String nome, String sobrenome,int idade) {
		this.nome =  nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Olá, sou " + getNome() + " e tenho " + getIdade() +
				" anos.";
	}
	
	public String getNomeCompleto() {
		return getNome() +  " " + getSobrenome();
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <= 120) {
			this.idade = idade;			
		}
	}
}
