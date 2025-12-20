package com.project.designpatterns.chainofresponsability.alura;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximo;
	
	public DescontoPorMaisDeCincoItens(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double descontar(Orcamento orcamento) {
		
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		
		} else {
			return proximo.descontar(orcamento);
		
		}
	}
	
	
	
}
