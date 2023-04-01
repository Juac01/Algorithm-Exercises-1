package Exercicios;
import java.util.Scanner;
public class Ex012 {

	public static void main(String[] args) {

		//COLOCANDO VARIAVEIS
		double alturaDegrau,alturaUsuario;
		int qtd;
		Scanner ler = new Scanner(System.in);
		
		//COLOCANDO INFORMACOES
		System.out.println("Ingresse a altura do degrau em metros: ");
		alturaDegrau  = ler.nextDouble();
		
		System.out.println("Ingresse a altura que deseja alcançar em metros: ");
		alturaUsuario = ler.nextDouble();
		
		qtd = (int) Math.ceil (alturaUsuario / alturaDegrau);
		
		System.out.println("Debera subir "+qtd+" degraus para alcaçar o objetivo.");

		
		
		

	}

}
