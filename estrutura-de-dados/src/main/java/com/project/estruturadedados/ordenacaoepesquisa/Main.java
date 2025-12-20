package com.project.estruturadedados.ordenacaoepesquisa;

import com.project.estruturadedados.ordenacaoepesquisa.ordenacao.QuickSort;
import com.project.estruturadedados.ordenacaoepesquisa.pesquisa.PesquisaBinaria;
import com.project.estruturadedados.ordenacaoepesquisa.pesquisa.PesquisaSequencial;

public class Main {
	public static void main(String[] args) {
//		int quantidade = 5000;
//		int[] vetor = new int[quantidade];
//		
//		for (int i = 0; i < vetor.length; i++) {
//			vetor[i] = (int) (Math.random() * quantidade);
//		}
		
		int[] vetor = {5, 6, 8, 1, 4, 4, 8, 7, 16, 14, 1, 7, 14, 7, 0, 15, 16, 15, 6, 4};
		
		//---------Ordenando vetor com o algoritmo BubbleSort
//		long tempInicial = System.currentTimeMillis();
//		BubbleSort.bubbleSort(vetor);
//		long tempFinal = System.currentTimeMillis();
//		System.out.println("BubbleSort executado em = " + (tempFinal - tempInicial) + " ms");
		
		//---------Ordenando vetor com o algoritmo QuickSort
		long tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(vetor, 0, vetor.length - 1);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("QuickSort executado em = " + (tempoFinal - tempoInicial) + " ms");
		
		
		System.out.print("\nVetor ordenado:\n");
		for(int i : vetor) System.out.print(i + " ");
		System.out.println("\n");
		
		int j = PesquisaBinaria.pesquisaBinaria(vetor, 16);
		int i = PesquisaSequencial.pesquisaSequencial(vetor, 16);
		
		System.out.println("Pesquisa binária: " + j + "\n" 
						  + "Pesquia Sequencial: " + i);
		
	}
}
