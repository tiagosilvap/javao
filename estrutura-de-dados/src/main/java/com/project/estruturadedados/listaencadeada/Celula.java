package com.project.estruturadedados.listaencadeada;

public class Celula {
	
	private Celula proxima;
	private Object elemento;
	
	//------Construtores
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	
	//------Getters e Setters
	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	
}
