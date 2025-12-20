package com.project.designpatterns.proxydinamico;

public class Main {
	public static void main(String[] args) {
		
		Servico s = (Servico) LoggerProxy.criarProxy(new Assinatura());
		s.obtemDados("Obtendo dados");
		
//		Servico s = LoggerProxy.criarProxy(new Assinatura());
//		s.confirmaDados();
		
		
	}
}
