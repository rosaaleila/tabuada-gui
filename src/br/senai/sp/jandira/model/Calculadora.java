package br.senai.sp.jandira.model;

public class Calculadora {
	
	private int multiplicando;
	private int multiplicador;
	private int resultado;
	
	public void calcular(int contagem) {
			resultado = multiplicando * contagem;
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}

	public int getResultado() {
		return resultado;
	}

}