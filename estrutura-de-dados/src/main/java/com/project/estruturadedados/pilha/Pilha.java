package com.project.estruturadedados.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
	private List<T> lista = new LinkedList<T>();
	
	public void insere(T peca){
		lista.add(peca);
	}
	
	public T remove() {
		if(!vazia()) {
			return lista.remove(lista.size() - 1);
		}
		System.out.println("Lista vazia");
		return null;
	}
	
	public boolean vazia() {
		return lista.isEmpty();
	}
	
	public void imprimir() {
		System.out.println(lista);
	}
}
