package com.project.designpatterns.decorator.example2;
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(100);
		
		Imposto imposto = new ICMS(new ISS());
		
		System.out.println("R$ " + orcamento.calcularImposto(imposto));
		System.out.println("R$ " + orcamento.getValor());
	}
}