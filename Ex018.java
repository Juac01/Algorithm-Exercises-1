package Exercicios;

import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		double salario, conta1,conta2, multa1,multa2,total1,total2,totalSalario,restadoSalario;
		
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		
		System.out.println("Coloque seu salario Joao: ");
		salario = ler.nextDouble();
		System.out.println("Coloque o valor da conta 1 a pagar: ");
		conta1 =ler.nextDouble();
		System.out.println("Coloque o valor da conta 2 a pagar: ");
		conta2 = ler.nextDouble();
		
		//CALCULANDO
		
		multa1 = conta1 * 0.02;
		total1 = conta1 + multa1;
		multa2 = conta2 * 0.035;
		total2 = conta2 + multa2;
		totalSalario = total1 + total2;
		restadoSalario = salario - totalSalario;
	
		//FIM
		System.out.println("Multa a apagar de 2% da primeira conta é: "+total1);
		System.out.println("Multa a pagar de 3.5% da segunda conta é: "+total2);
		System.out.println("Joao ficara com "+restadoSalario);
	

	}

}
