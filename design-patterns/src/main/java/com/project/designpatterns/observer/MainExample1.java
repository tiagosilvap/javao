package com.project.designpatterns.observer;

import com.project.designpatterns.observer.example1.ObeservadorDeTemperatura;
import com.project.designpatterns.observer.example1.Temperatura;

public class MainExample1 {

	public static void main(String[] args) {
		
		Temperatura temp = new Temperatura(30);
		ObeservadorDeTemperatura androidApp = new ObeservadorDeTemperatura(temp);

		androidApp.exibeTemperatura();
		
		temp.setTemperatura(50);
		
		androidApp.exibeTemperatura();
	}

}
