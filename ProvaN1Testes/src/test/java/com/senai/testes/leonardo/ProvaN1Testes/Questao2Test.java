package com.senai.testes.leonardo.ProvaN1Testes;

import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;

import org.junit.Test;
import java.util.Date;

import com.senai.testes.leonardo.entities.Questao2;

public class Questao2Test {

	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
	
	@Test
	public void testePrincipal() {
		assertNotEquals(d.format(new Date()), new Questao2().getHorario(), 0.1);
	}
	
}
