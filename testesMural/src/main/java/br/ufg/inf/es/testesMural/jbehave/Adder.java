package br.ufg.inf.es.testesMural.jbehave;

public class Adder {

	private int result;
	
	public void add(int a, int b) {
		result = a + b;
	}
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int getResult() {
		return result;
	}

}
