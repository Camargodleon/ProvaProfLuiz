package com.senai.testes.leonardo.ProvaN1Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.senai.testes.leonardo.entities.Triangulo;

public class TrianguloTeste {
	
	Triangulo triangulo;
	
	public void validoEscaleno() {
		triangulo = new Triangulo(3,4,5);
	}
	public void invalid0Esc() {
		triangulo = new Triangulo(3,0,1);
	}
	public void invalidNegEsc() {
		triangulo = new Triangulo(-1,0,1);
	}
	public void validoIsosceles() {
		triangulo = new Triangulo(5,5,10);
	}
	public void invalid0Isos() {
		triangulo = new Triangulo(0,0,5);
	}
	public void invalidNegIsos() {
		triangulo = new Triangulo(-3,-3,5);
	}
	public void validoEquilatero(){
		triangulo = new Triangulo(6,6,6);
	}
	
	public void invalid0Equ() {
		triangulo = new Triangulo(0,0,0);
	}
	
	public void invalidNegEqu() {
		triangulo = new Triangulo(-1,-1,-1);
	}
	
	@Test
	public void escaleno() {
		validoEscaleno();
		assertTrue(triangulo.eTriangulo());
		assertTrue(triangulo.eEscaleno());
		assertFalse(triangulo.eEquilatero());
		assertFalse(triangulo.eIsosceles());
		
		invalid0Esc();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eEscaleno());
		
		invalidNegEsc();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eEscaleno());
	}
	
	@Test
	public void isosceles() {
		validoIsosceles();
		assertTrue(triangulo.eTriangulo());
		assertTrue(triangulo.eIsosceles());
		assertFalse(triangulo.eEscaleno());
		assertFalse(triangulo.eEquilatero());
		
		invalid0Isos();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eIsosceles());
		
		invalidNegIsos();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eIsosceles());
	}
	
	@Test
	public void equilatero() {
		validoEquilatero();
		assertTrue(triangulo.eTriangulo());
		assertTrue(triangulo.eEquilatero());
		assertFalse(triangulo.eEscaleno());
		assertFalse(triangulo.eIsosceles());
		
		invalid0Equ();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eEquilatero());
		
		invalidNegEqu();
		assertFalse(triangulo.eTriangulo());
		assertFalse(triangulo.eEquilatero());
	}

}
