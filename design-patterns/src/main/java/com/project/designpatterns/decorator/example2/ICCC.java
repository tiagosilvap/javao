package com.project.designpatterns.decorator.example2;
public class ICCC extends Imposto {

	public ICCC(Imposto imposto) {
		super(imposto);	
	}
	
	public ICCC() {}
	
	public double calcular(Orcamento orcamento) {
		Double valorImposto = orcamento.getValor() * 0.05; 
		return valorImposto += calcularProximoImposto(orcamento);
	}

}
