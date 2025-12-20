package com.project.estruturadedados.listaencadeada;

public class Principal {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.adiciona("1");
		lista.adiciona("2");
		lista.adicionaNoComeco("3");
		lista.adiciona(1, "10");
		System.out.println(lista.toString());
	}
}
