package Exercicios;

public class Ex001 {
	public static void main(String[]args) { 
		
		//DECLARANDO VARIAVEIS
		
		double A,B,C,D,RESULT1,RESULT2,RESULT3,RESULT4,RESULT5,RESULT6;
		
		A = 5;
		B = 1;
		C = 3;
		D = 8;
		
		//CALCULANDO 
		
		RESULT1 = A * B - C + D;
		RESULT2 = A * (B - C);
		RESULT3 = A - C * C + A;
		RESULT4 = D * (B / 2);
		RESULT5 = B * D * A - C;
		RESULT6 = (A + B + C) * D;
		
		//MOSTRANDO 
		
		System.out.println(RESULT1);
		System.out.println(RESULT2);
		System.out.println(RESULT3);
		System.out.println(RESULT4);
		System.out.println(RESULT5);
		System.out.println(RESULT6);
		
		
	}
}
