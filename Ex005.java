package Exercicios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		//COLOCANDO VARIAVEIS
		
		double deposito,juros,valorRendimento,valorTotal;		
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES

		System.out.println("Ingresse o valor do depósito:");
		deposito = ler.nextDouble();
		
		System.out.println("Ingresse o valor da taxa de juros:");
		juros = ler.nextDouble();
		
		valorRendimento = (deposito * juros) / 100;
		valorTotal = deposito + valorRendimento;
		
		System.out.println("Seu rendimento é:");
		System.out.println(valorRendimento);
		
		// FIM
		
		System.out.println("Após o rendimento seu valor total é:");
		System.out.println(valorTotal);
		
		
	}

}
