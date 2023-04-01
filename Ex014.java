package Exercicios;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		double salario,cheque1,cheque2,CPMF1,CPMF2,saldoTotal;
		
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Ingresse seu salario: ");
		salario = ler.nextDouble();
		
		System.out.println("Ingresse o valor do primeiro cheque: ");
		cheque1 = ler.nextDouble();
		
		System.out.println("Ingresse o valor do segundo cheque: ");
		cheque2 = ler.nextDouble();
		
		//CALCULANDO 
		CPMF1 = cheque1 * 0.0038;
		CPMF2 = cheque2 * 0.0038;
		saldoTotal = salario - cheque1 - cheque2 - CPMF1 - CPMF2;
		
		//fim
		System.out.println("O valor do saldo atual é: " + saldoTotal);

		
		
		
		

		
		
	}

}
