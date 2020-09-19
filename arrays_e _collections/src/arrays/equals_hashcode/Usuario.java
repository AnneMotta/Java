package arrays.equals_hashcode;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if (objeto instanceof Usuario) {
			Usuario outro_usuario = (Usuario)objeto;
			
			boolean comparacao_nome = outro_usuario.nome.equals(this.nome);
			boolean comparacao_email = outro_usuario.email.equals(this.email);
			return comparacao_nome && comparacao_email;
			
		}return false;
	}
}
