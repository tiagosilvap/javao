package com.project.estruturadedados.ordenacaoepesquisa.ordenacao;

public class BubbleSort {
	/**
	 * Tipo de Ordenação: Interna. 
	 * Complexidade: O(n^2). 
	 * Quantidade de dados: Poucos. 
	 * Especificidades: Complexidade fixa e código compacto. 
	 * Estabilidade: Sim. 
	 * Adaptabilidade: Não. 
	 * A implementação clássica realiza a mesma quantidade
	   de operações mesmo se as chaves já estiverem ordenadas.
	 */
	public static void bubbleSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = vetor.length - 1; j > i; j--)
				if (vetor[j] < vetor[j - 1]) {
					int temp;
					temp = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = temp;
				}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
