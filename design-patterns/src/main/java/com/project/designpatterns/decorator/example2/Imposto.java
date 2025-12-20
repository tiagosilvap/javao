package com.project.designpatterns.decorator.example2;

public abstract class Imposto {
	
	protected Imposto proximo;
	
	public Imposto(Imposto imposto) {
		this.proximo = imposto;
	}
	
	public Imposto() {}
	
	protected double calcularProximoImposto(Orcamento orcamento) {
		if(proximo == null) return 0;
		return proximo.calcular(orcamento);
	}
	
	public abstract double calcular(Orcamento orcamento);
   
}
