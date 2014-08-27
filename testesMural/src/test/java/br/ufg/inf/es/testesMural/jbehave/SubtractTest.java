package br.ufg.inf.es.testesMural.jbehave;

import junit.framework.TestCase;

public class SubtractTest extends TestCase{
	
	public void testSubtract() {
		int a = 1;
		int b = 3;
		
		int expectedResult = -2;
		
		int result = (new Subtract()).subtract(a, b);
		
		assertEquals(expectedResult, result);
	}

}
