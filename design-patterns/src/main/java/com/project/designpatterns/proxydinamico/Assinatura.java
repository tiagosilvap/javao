package com.project.designpatterns.proxydinamico;

public class Assinatura implements Servico {

	@Override
	public void obtemDados(String nome) {
		System.out.println(nome + "obtemDados Implementacao original");
	}

	@Override
	public void gravaDados() {
		System.out.println("gravaDados Implementacao original");
	}

	@Override
	public void confirmaDados() {
		System.out.println("confirmaDados Implementacao original");
	}

}
