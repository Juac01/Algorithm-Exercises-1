package Exercicios;
import java.util.Scanner;
public class Ex002 {
	
	public static void main(String[] args) {

		// VARIAVEIS
	
		double n1,n2,n3,p1,p2,p3,media;
		Scanner Scanner = new Scanner(System.in);
	
		
		// VALORES DAS NOTAS
		
		System.out.println("Digite as 3 notas: ");
		n1 = Scanner.nextDouble();
		n2 = Scanner.nextDouble();
		n3 = Scanner.nextDouble();
		
		// VALORES DOS PESOS
		
		System.out.println("Digite os 3 pesos: ");
		p1 = Scanner.nextDouble();
		p2 = Scanner.nextDouble();
		p3 = Scanner.nextDouble();

		// CALCULANDO A MEDIA
		
		media = ((n1*p1)+(n2*p2)+(n3*p3)) / (p1+p2+p3);
		
		// FIM
		
		System.out.println("A media ponderada é: " + media);
		
		
	}

}
