package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
	
	private static Collection<Curso> cursos = new ArrayList<Curso>();
	
	
	public Curso buscarPorCodigo(String codigo) {
		Curso resultado = null;
		
		for(Curso curso : CursosRepository.cursos) {
			if(curso.getCodigo().equals(codigo)) {
				resultado = curso;
				break;
			}
		}
		return resultado;
	}
	
	
	public void adicionarCurso(Curso curso) {
		CursosRepository.cursos.add(curso);
	}
	
	
	public Collection<Turma> buscarTurmas(String codigoCurso){
		Collection<Turma> turmas = new ArrayList<>();
		for(Curso i : cursos) {
			if(i.getCodigo().equals(codigoCurso)) {
				turmas.addAll(i.getTurmas());
			}
			
		}
		
		return turmas;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		
		return false;
	}
	
	public void adicionarAluno(Aluno aluno) {
		
	}
	
	
	}