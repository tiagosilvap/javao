package com.project.designpatterns.observer;

import com.project.designpatterns.observer.example2.Clima;
import com.project.designpatterns.observer.example2.Temperatura;

public class MainExample2 {
	
	public static void main(String[] args) {
		
		Clima clima = new Clima(25f);
		Temperatura temperatura = new Temperatura(clima);
		clima.setTemperatura(30f);
		
	}
}
