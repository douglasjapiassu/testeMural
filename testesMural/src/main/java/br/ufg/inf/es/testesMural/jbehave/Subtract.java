package br.ufg.inf.es.testesMural.jbehave;

public class Subtract {

	private int result;
	
	public int subtract(int a, int b) {
		result = a - b;
		return result;
	}

	public int getResult() {
		return result;
	}

}
