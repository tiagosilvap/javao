package com.project.designpatterns.chainofresponsability.alura;
public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	
	private Desconto proximo;
	
	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double descontar(Orcamento orcamento) {
		
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		
		} else {
			return proximo.descontar(orcamento);
		
		}
	}

}
