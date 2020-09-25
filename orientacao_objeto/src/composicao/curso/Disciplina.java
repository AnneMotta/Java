package composicao.curso;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Disciplina(String nome) {
		this.nome = nome;
	}
	

	public String toString() {
		return nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.disciplinas.add(this);
	}
}
