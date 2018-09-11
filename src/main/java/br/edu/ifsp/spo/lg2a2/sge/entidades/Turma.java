package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Turma {
	
	private String codigoTurma;
	
	public Turma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
		
	}
	
	public String getTurma() {
		return codigoTurma;
	}
	
	
	private Collection<Aluno> alunos;
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}
}
