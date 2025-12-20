package com.project.estruturadedados.ordenacaoepesquisa.pesquisa;

public class PesquisaSequencial {

	public static int pesquisaSequencial(int[] vetor, int n) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == n) 
				return i;
		}
		return -1;
	}
}
