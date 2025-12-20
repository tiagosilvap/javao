package com.project.designpatterns.decorator.example2;
public class ICMS extends Imposto {
	
	public ICMS() {}
	
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	
	public double calcular(Orcamento orcamento) {
		Double valorImposto = orcamento.getValor() * 0.10; 
		return valorImposto += calcularProximoImposto(orcamento);
	}
	
}