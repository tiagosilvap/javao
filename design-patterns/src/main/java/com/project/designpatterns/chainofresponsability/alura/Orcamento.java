package com.project.designpatterns.chainofresponsability.alura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public Orcamento() {
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
		this.valor += item.getValor();
	}
	
	public Double calcularDesconto(Desconto desconto) {
		return desconto.descontar(this);

	}

}
