package Exercicios;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		
		double qtddeRacao,pesodoSaco,restodeRacao,qtdDiaria,qtdTotal;
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Ingresse o peso do saco em kg: ");
		pesodoSaco = ler.nextDouble();
		
		System.out.println("Ingresse a quantidade de ração para cada gato em gramas: ");
		qtddeRacao = ler.nextDouble();
		
		//QUANTIDADE TOTAL PARA AMBOS GATOS EM 1 DIA
		qtdDiaria = (2 * qtddeRacao) / 1000;
		
		//QUANTIDADE TOTAL PARA AMBOS GATOS EN 5 DIAS
		qtdTotal = qtdDiaria * 5;
		//QUANTIDADE DE RACAO APOS 5 DIAS
		restodeRacao = pesodoSaco - qtdTotal;
		
		System.out.println("A quantidade de racao após 5 dias é: ");
		System.out.println(restodeRacao+"kg");


	}

}
