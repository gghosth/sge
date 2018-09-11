package br.edu.ifsp.spo.lg2a2.sge.repositories;

import br.edu.ifsp.spo.lg2a2.sge.repositories.CursosRepository;
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
	public void adicionarCurso() {
		
		CursosRepository klebin = new CursosRepository();
		Curso curso = new Curso("Oceano");
		Curso result = null;
		klebin.adicionarCurso(curso);
		 
		result = klebin.buscarPorCodigo("Oceano");
		
		Assert.assertNotNull(result);
	}
	
	@Test
	public void buscarCod() {
		Curso c = null ;
		CursosRepository ADS = new CursosRepository();
		ADS.adicionarCurso(new Curso("ADS"));
		c = ADS.buscarPorCodigo("ADS");
		
		Assert.assertNotNull(c);
	}
	
	
	
	
}
