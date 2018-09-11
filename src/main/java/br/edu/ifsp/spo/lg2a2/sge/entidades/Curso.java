package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	private String codigo;
	
	public Curso(String codigo) {
		this.codigo = codigo;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	
	
	
	private Collection<Turma> turmas;
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}

}
