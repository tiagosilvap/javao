package com.project.estruturadedados.listaencadeada;

public class ListaEncadeada {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	/**
	 * Adiciona elemento ao final da lista
	 */
	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	/**
	 * Adiciona elemento no comeco da lista
	 */
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if (this.totalDeElementos == 0) {
			// caso especial da lista vazia
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	/**
	 * Adiciona elemento em um lugar especifico da lista
	 */
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		}
		else if(posicao == this.totalDeElementos){
			this.adiciona(elemento);
		}
		else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula nova = new Celula(anterior.getProxima(), elemento);
			anterior.setProxima(nova);
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao não existe");
		}
		Celula atual = this.primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	/**
	 * Retorna string com todos os elementos da lista
	 */
	public String toString() {
		// Verificando se a Lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		// último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
	
	
	//Metodos a serem implementados
	public Object pega(int posicao) {
		return null;
	}

	public void remove(int posicao) {
	}

	public int tamanho() {
		return 0;
	}

	public boolean contem(Object o) {
		return false;
	}

	public void removeDoComeco() {
	}

	public void removeDoFim() {
	}
}
