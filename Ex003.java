package Exercicios;
import java.util.Scanner;
public class Ex003 {
	public static void main (String[]arg) {
		
		//DECLARANDO VARIAVEIS
		
		String nome;
		double salario, aumento,novoSalario; 
		Scanner Scanner = new Scanner(System.in);
				
		//INFORMACOES
		
		System.out.println("Escreva seu nome:");
		nome = Scanner.nextLine();
		
		System.out.println(nome + " agora coloque seu salario:");
		salario = Scanner.nextDouble();
		
		aumento = salario * 0.25;
		novoSalario = salario + aumento;
		
		//FIM
		
		System.out.println("Seu " + nome + " voce recebeu um aumento de " + aumento + " reais.");
		System.out.println("E seu novo salario será de "  + novoSalario +  " reais");
		
	
	}
	}


	
	

