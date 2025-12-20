package com.project.designpatterns.observer.example1;

public class Main {

	public static void main(String[] args) {
		
		Temperatura temp = new Temperatura(30);
		ObeservadorDeTemperatura androidApp = new ObeservadorDeTemperatura(temp);

		androidApp.exibeTemperatura();
		
		temp.setTemperatura(50);
		
		androidApp.exibeTemperatura();
	}

}
