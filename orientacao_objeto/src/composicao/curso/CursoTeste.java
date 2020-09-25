package composicao.curso;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jamin");
		Aluno aluno2 = new Aluno("Jafar");
		Aluno aluno3 = new Aluno("Joshua");  
		Aluno aluno4 = new Aluno("Jaden");
		
		Disciplina disciplina1 = new Disciplina("Arquitetura e organização de computaores");
		Disciplina disciplina2= new Disciplina("Algortimo e alta performance");
		Disciplina disciplina3= new Disciplina("Cybersecurity");
		
		aluno1.adicionarDisciplina(disciplina1);
		aluno2.adicionarDisciplina(disciplina1);
		
		disciplina2.adicionarAluno(aluno1);
		disciplina2.adicionarAluno(aluno2);
		disciplina2.adicionarAluno(aluno3);
		disciplina2.adicionarAluno(aluno4);
		
		aluno3.adicionarDisciplina(disciplina3);
		aluno4.adicionarDisciplina(disciplina3);
		
		
		for(Aluno aluno: disciplina1.alunos) {
			System.out.print(aluno.nome);
			System.out.println(aluno.disciplinas);
		}
		System.out.println("===================================");
		System.out.println(disciplina1.alunos.get(0).disciplinas);
		System.out.println(aluno1.disciplinas.get(0).alunos);
		System.out.println(disciplina2.alunos.get(2).disciplinas);
		System.out.println(aluno1.disciplinas.get(1).alunos);	
		
		System.out.println("====================================");
		Disciplina disciplinaEncontrado = aluno1.obterDisciplinaPorNome("Algortimo e alta performance");
		if (disciplinaEncontrado != null) {
			System.out.println(disciplinaEncontrado.nome);
			System.out.println(disciplinaEncontrado.alunos);
		}
		
	
	}   
}
