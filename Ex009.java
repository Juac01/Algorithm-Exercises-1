package Exercicios;

public class Ex009 {

	public static void main(String[] args) {

		//DECLARANDO VARIAVEIS
		
		double a = 1;
		double b = -5;
		double c = 6;
		double delta;
		double x1;
		double x2;
				
		//COLOCANDO INFORMACOES
				
		System.out.println("A equação x² - 5x + 6 = 0 , é: \n" );
				
		//RESOLVENDO A EQUACAO
	
		delta = Math.pow(b,2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		//VALORES A,B,C
		System.out.println("Tendo em conta os valores: a= "+a+" b= "+b+" c="+c);
		
		//DELTA
		System.out.println("Calculamos o delta = "+delta);
		
		//BHASKARA
		System.out.println("\nA seguir implementamos a formula de Bhaskara,para encontrar as raizes da equacao:\n" );

		//X1,X2
		System.out.println("A resolução da equação X1 é: " + x1);
		System.out.println("A resolução da equação X2 é: " + x2);
		
		
		
	}

}
