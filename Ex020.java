package Exercicios;

import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		
		int dias,horas,meses,trimes,semes,anos,decadas;
		
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		
		System.out.println("Ingresse o valor em dias: ");
		dias = ler.nextInt();

		horas = dias * 24;
		meses = dias / 30;
		trimes = meses / 3;
		semes = meses / 6;
		anos = meses / 12;
		decadas = anos / 10;
		
		//FIM
		System.out.println(dias+" dias equivalem a "+horas+"horas.");
		System.out.println(dias+" dias equivalem a "+meses+" meses.");
		System.out.println(dias+" dias equivalem a "+trimes+" trimestres.");
		System.out.println(dias+" dias equivalem a "+semes+" semestres.");
		System.out.println(dias+" dias equivalem a "+anos+" anos.");
		System.out.println(dias+" dias equivalem a "+decadas+" decadas.");

	
	}

}
