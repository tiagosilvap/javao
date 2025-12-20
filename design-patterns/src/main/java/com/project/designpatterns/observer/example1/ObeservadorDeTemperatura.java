package com.project.designpatterns.observer.example1;

public class ObeservadorDeTemperatura implements Observador {
		
	private Temperatura temperatura;
	
	public ObeservadorDeTemperatura(Temperatura temp) {
		this.temperatura = temp;
		this.temperatura.addObservador(this);
	}

	@Override
	public void atualizar(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}
	
	public void exibeTemperatura() {
		System.out.println(temperatura.getTemperatura());
	}

}
