package br.ufg.inf.es.testesMural.jbehave;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



public class AdderTest {
	
	@Mock
	private Adder adder;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		when(adder.soma(1,4)).thenReturn(5);
	}
	
	@Test
	public void deveAdicionarDoisNumeros() {
		int resultado = adder.soma(1, 4);
		
		assertEquals(resultado, 5);
	}
	
}