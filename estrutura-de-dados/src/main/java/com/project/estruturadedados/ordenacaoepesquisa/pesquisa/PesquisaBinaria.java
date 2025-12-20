package com.project.estruturadedados.ordenacaoepesquisa.pesquisa;

public class PesquisaBinaria {
	
	public static int pesquisaBinaria(int[] vetor, int k) {
		int esquerda = 0;
		int direita = vetor.length - 1;
		int meio;

		while (esquerda <= direita) {
			meio = (esquerda + direita) / 2;
			if (vetor[meio] == k)
				return meio;
			else if (k < vetor[meio])
				direita = meio - 1;
			else
				esquerda = meio + 1;
		}
		return -1;
	}

}
