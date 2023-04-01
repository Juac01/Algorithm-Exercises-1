package Exercicios;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		
		double base, altura, area;
		Scanner ler =  new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		
		System.out.println("Coloque a base do triangulo:");
		base = ler.nextDouble();
		
		System.out.println("Coloque a altura do triangulo");
		altura = ler.nextDouble();
		
		area = (base * altura) / 2;
		
		// FIM 
		
		System.out.println("A area do triangulo de base "+ base + " e altura "+ altura + " é:");
		System.out.println(area);
		

		

	}

}
