package Exercicios;

import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		
		//DECLARAMOS VARIAVEIS INCLUIDO X1 E X2 DA OPERACAO DE DELTA
		
		double	 a,b,c,x1,x2,delta;
		
		
		Scanner ler = new Scanner(System.in);
		
		//RECEBA OS VALORES
		
		System.out.println("Coloque o valor de A: ");
		a = ler.nextDouble();
		
		//ENQUANTO O VALOR DE A FOR IGUAL A 0, PEDE OUTRO VALOR
		while (a==0) {
		System.out.println("O valor de A não pode ser zero!, digite outro valor.");
		}

		System.out.println("Coloque o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Coloque o valor de C: ");
		c = ler.nextDouble();

		//FORMULA PARA CALCULAR OS VALORES
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		//QUANDO A EQUACAO POSSUI UMA RAIZ IGUAL X1=X2 OU DUAS RAIZES REAIS DIFERENTES
		if (delta>=0) {
			x1 = (-b + Math.sqrt(delta)) / (2*a); 
			x2 = (-b - Math.sqrt(delta)) / (2*a); 
			//VALORES a,b,c
			System.out.println("Tendo em conta os valores: a= "+a+" b= "+b+" c= "+c);
			//DELTA
			System.out.println("Delta vale :"+ delta);
			//FORMULA DE BHASKARA
			System.out.println("\nA seguir implementamos a formula de Bhaskara,para encontrar as raizes da equacao:\n" );
			//X1,X2
			System.out.println("A resolução da equação X1 é: "+ x1);
			System.out.println("A resolução da equação X2 é: "+ x2);
			
		}
		
		//QUANDO A EQUACAO NAO POSSUI RAIZES REAIS
		else  {
			System.out.println("Com esses valores a discriminante é menor que 0, porém");
			System.out.println("Nao existe valor Real!");

		}
		
	
	}

}
