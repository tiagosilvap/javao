package com.project.designpatterns.decorator.example2;

public class Orcamento {

	private double valor;

	public Orcamento(double valor){
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public Double calcularImposto(Imposto imposto) {
		double valorImposto = imposto.calcular(this);
		this.valor -= valorImposto;
		return valorImposto;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
