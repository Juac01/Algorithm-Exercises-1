package Exercicios;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		int anoNascimento, anoAtual, idade,qtdvida,dias;
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Coloque o ano de seu nascimento: ");
		anoNascimento = ler.nextInt();
		
		System.out.println("Coloque o ano atual: ");
		anoAtual = ler.nextInt();
		
		//CALCULANDO INFORMACOES
		idade = anoAtual - anoNascimento;
		qtdvida = 2050 - anoNascimento;
		dias = 365 * qtdvida; //sem contar o ano bisiesto, calculamos os dias aproximados
		
		//MOSTRANDO 
		System.out.println("Sua idade é: ");
		System.out.println(idade);
		
		System.out.println("Até o 2050 voce tera vivido "+qtdvida+" anos, equivalente a "+dias+" dias aprox.");
		



		
				
		
	}

}
