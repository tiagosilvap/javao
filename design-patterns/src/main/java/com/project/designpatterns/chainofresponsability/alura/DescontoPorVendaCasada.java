package com.project.designpatterns.chainofresponsability.alura;
public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;
	
	public DescontoPorVendaCasada(Desconto proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public double descontar(Orcamento orcamento) {
		
		if(aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		
		} else {
			return proximo.descontar(orcamento);
		
		}
	}
	
	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

}
