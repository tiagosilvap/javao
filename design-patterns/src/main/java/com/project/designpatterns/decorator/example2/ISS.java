package com.project.designpatterns.decorator.example2;
public class ISS extends Imposto {

	public ISS() {}
	
	public ISS(Imposto imposto) {
		super(imposto);
	}
	
	public double calcular(Orcamento orcamento) {
		Double valorImposto = orcamento.getValor() * 0.20; 
		return valorImposto += calcularProximoImposto(orcamento);
	}

}