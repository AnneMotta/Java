package composicao.curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Disciplina> disciplinas = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		disciplina.alunos.add(this);
	}
	
	Disciplina obterDisciplinaPorNome (String nome) {
		for (Disciplina disciplina : this.disciplinas) {
			if (disciplina.nome.equalsIgnoreCase(nome)) {
				return disciplina;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}
}


