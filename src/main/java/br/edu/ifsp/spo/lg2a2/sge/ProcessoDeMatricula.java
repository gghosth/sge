package br.edu.ifsp.spo.lg2a2.sge;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;

public class ProcessoDeMatricula {
	
	private Curso curso;
	
	private static Collection<Curso> cursos = new ArrayList<Curso>();
	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
	}

	public boolean verificarExistenciaAluno(String cpf) {
		Collection<Aluno> alunos = new ArrayList<>();
		for(Curso o : cursos) {
			for(Aluno u : o.sTurma()) {
				alunos.add(u);
				
			}
			
		}
		
		for(Aluno cont : alunos){
		    if(cont.getCpf().equals(cpf)){
		        return true;
            }
        }
		return false;
	}
	
	public ComprovanteMatricula processarMatricula(DadosAluno dados) {
		ComprovanteMatricula comprovante = new ComprovanteMatricula("Nome", "Turma");
		return null;
	}
	
	private String gerarProntuario() {
		Aluno aluno = new Aluno( "SP1" , "cpf", "nome", "email");
		return null;
	}
	
}
