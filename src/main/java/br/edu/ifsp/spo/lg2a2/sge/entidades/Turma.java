package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;


public class Turma {
	
	private String codigoTurma;
	
	
	public Turma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
		
	}
	
//	public AlunoTurma(String nomeAluno) {
//		this.nomeAluno = nomeAluno;
//		
//	}
	
    public void addAluno(Aluno a){
		alunos.add(a);
	}

	public String getTurma() {
		return codigoTurma;
	}
	
	
	private static Collection<Aluno> alunos;
	public Collection<Aluno> getAlunos(){
		return alunos;
	}
}
