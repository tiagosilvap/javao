package com.project.designpatterns.observer.example1;
import java.util.ArrayList;
import java.util.List;

public class Temperatura implements Observavel {
	
	private List<Observador> observadores;
	private double temperatura;
	
	
	public Temperatura(double temp) {
		this.observadores = new ArrayList<Observador>();
		this.temperatura = temp;
	}
	
	@Override
	public void notificar() {
		if(observadores.isEmpty()) {
			return;
		}
		observadores.parallelStream().forEach((o) -> {
			o.atualizar(this);		
	    });
	}

	public List<Observador> getObservadores() {
		return observadores;
	}

	public void setObservadores(List<Observador> observadores) {
		this.observadores = observadores;
	}
	
	public void addObservador(Observador observador) {
		this.observadores.add(observador);
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notificar();
	}
	
	
	
}
