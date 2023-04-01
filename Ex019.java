package Exercicios;

import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		int segundos,horas,minutos,milissegundos,duracaoEvento;
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Coloque o tempo de duracao do evento em segundos: ");
		duracaoEvento = ler.nextInt();
		
		//CALCULANDO
		
		horas = duracaoEvento / 3600;
		minutos = (duracaoEvento % 3600) / 60;
		segundos = duracaoEvento % 60;
		milissegundos = duracaoEvento * 1000;
		
		
		//FIM
		System.out.println("A duracao do evento sera em "+horas+"H "+minutos+"MIN "+segundos+"SEG E "+milissegundos+"MS");
	}

}
