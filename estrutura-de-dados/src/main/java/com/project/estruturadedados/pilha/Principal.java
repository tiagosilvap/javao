package com.project.estruturadedados.pilha;

public class Principal {

	public static void main(String[] args) {	
		Pilha<String> pilha = new Pilha<String>();
		pilha.insere("Adalberto");
		pilha.insere("Maria");
		pilha.insere("Joao");
		String maria = pilha.remove();
		String adalberto = pilha.remove();
		System.out.println(maria + " removido");
		System.out.println(adalberto + " removido");
		System.out.println(pilha.vazia());
		pilha.imprimir();
	}

}
