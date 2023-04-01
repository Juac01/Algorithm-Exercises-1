package Exercicios;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		double polegadas,jardas,milhas,resultado,pes;
		
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Coloque uma medida em pés:");
		pes = ler.nextDouble();
		
		//CALCULANDO
		polegadas = pes * 12;
		jardas = pes /3;
		milhas = jardas / 1760;
		
		//FIM
		System.out.println("Medida em polegadas = "+polegadas);
		System.out.println("Medida em jardas = "+jardas);
		System.out.println("Medida em milhas = "+milhas);

		
	}

}
