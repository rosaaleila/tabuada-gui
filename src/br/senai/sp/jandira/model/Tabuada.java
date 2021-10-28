package br.senai.sp.jandira.model;

public class Tabuada {
	
	private int multiplicando;
	private int multiplicador;
	
	public void setMultiplicando(String multiplicando) {
		//converter para int:
		this.multiplicando = Integer.parseInt(multiplicando);
	}
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(String multiplicador) {
		//converter para int:
		this.multiplicador = Integer.parseInt(multiplicador);
	}
	
	public int getMultiplicador() {
		return multiplicador;
	}
	
	public int calcular(int maxMultiplicador) {
		//retornar o resultado da operacao
		return multiplicando * maxMultiplicador;
	}
	
}