package Exercicios;
import java.util.Scanner;
public class Ex007 {

	public static void main(String[] args) {

		//DECLARANDO VARIAVEIS
		
		double raio,area,perimetro;
		Scanner ler = new Scanner(System.in);
		
		//INFORMACOES
		
		System.out.println("Coloque o raio do circulo:"); 
		raio = ler .nextDouble(); 
		
		perimetro = raio * Math.PI * 2;
		area = Math.PI * raio * raio;
		
		System.out.println("\n A área de um circulo é: "+ area);
		System.out.println("\n e o perimetro do circulo é: "+ perimetro);

		
		
	}

}
