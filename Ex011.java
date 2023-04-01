package Exercicios;
import java.util.Scanner;
public class Ex011 {

	public static void main(String[] args) {

		//VARIAVEIS
		double valor,kws,quantidade,bonus,valorTotal,diasAtraso;
		Scanner ler = new Scanner(System.in);
	
		//COLOCANDO INFORMACOES
		System.out.println("Coloque o valor de referencia: ");
		valor = ler.nextDouble();
		
		System.out.println("Coloque a quantidade de kws consumida: ");
		quantidade = ler.nextDouble();
		
		//CALCULANDO INFORMACOES
		kws =  valor / 5;
		valorTotal = quantidade * kws;
		bonus = valorTotal * 0.83;  
		diasAtraso = valorTotal * (1+(10*0.005)); 
		
		//SE MOSTRA
		
		System.out.println("O valorde cada Kw:");
		System.out.println(kws);
		
		System.out.println("O valor a ser pago por essa residencia:");
		System.out.println(valorTotal);
		
		System.out.println("O valor a ser pago considerando um bonus de 17%:");
		System.out.println(bonus);

		System.out.println("O valor a ser pago com 10 dias de atraso: ");
		System.out.println(diasAtraso);

		

		
	}

}
