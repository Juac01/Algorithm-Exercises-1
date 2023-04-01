package Exercicios;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		
		double	cateto1,cateto2,hipotenusa;
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		
		System.out.println("Ingresse o valor do primeiro cateto: ");
		cateto1 = ler.nextDouble();
		System.out.println("Ingresse o valor do segudo cateto: ");
		cateto2 = ler.nextDouble();
		
		//CALCULANDO
		
		hipotenusa = Math.hypot(cateto1,cateto2);
		
		//FIM
		
		System.out.println("O valor da hipotenusa é: "+hipotenusa);

	}


}
