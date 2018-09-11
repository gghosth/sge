package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Turma {
	
	private String codigoTurma;
	private String nomeAluno;
	
	public Turma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
		
	}
	
	public AlunoTurma(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		
	}
	
	public String addAluno(){
		return nomeAluno;
	}
	
	public String getTurma() {
		return codigoTurma;
	}
	
	
	public static Collection<Aluno> alunos;
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}
}
