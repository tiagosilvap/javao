package com.project.designpatterns.observer.example2;

public class Main {
	
	public static void main(String[] args) {
		
		Clima clima = new Clima(25f);
		Temperatura temperatura = new Temperatura(clima);
		clima.setTemperatura(30f);
		
	}
}
