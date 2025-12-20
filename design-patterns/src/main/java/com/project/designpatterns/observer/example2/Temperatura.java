package com.project.designpatterns.observer.example2;

import java.util.Observable;
import java.util.Observer;

public class Temperatura implements Observer{

	private Clima climaObservable;
	
	public Temperatura(Clima climaObservable) {
		super();
		this.climaObservable = climaObservable;
		this.climaObservable.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Temperatura atual: " + this.climaObservable.getTemperatura());
	}
}
