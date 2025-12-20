package com.project.designpatterns.chainofresponsability.alura;


public class TesteDeDescontos {
	
	public static void main(String[] args) {
		obterDesconto(300.0);
		obterDesconto(250.0);
	}
	
	private static void obterDesconto(Double valor) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("CANETA", valor));
		orcamento.adicionaItem(new Item("LAPIS", valor));
		
		Desconto desconto =
				new DescontoPorMaisDeCincoItens(
				new DescontoPorMaisDeQuinhentosReais(
				new DescontoPorVendaCasada(
				new SemDesconto())));
		
		System.out.println(orcamento.calcularDesconto(desconto));
	}
	
	
}
