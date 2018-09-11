package br.edu.ifsp.spo.lg2a2.sge.repositories;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CursosRepositoryTest {

	private CursosRepository repository;
	
	@Before
	public void setUp() {
		Collection<Curso> cursosMock = new ArrayList<Curso>();
		cursosMock.add(
				new Curso("Oceanografia"));
		cursosMock.add(
				new Curso("Geografia"));
		cursosMock.add(
				new Curso("ADS"));	
		
		repository = new CursosRepository();
	}
	
	@Test
	public void buscarCursoCodigo() {
		
		
		String codigo = "Oceanografia";
		
		
		Curso curso = repository.buscarPorCodigo(codigo);
		
		
		Assert.assertNotNull(curso);
	}
	
	
	
	
	
	
}
