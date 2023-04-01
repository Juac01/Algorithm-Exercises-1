package Exercicios;
		import java.util.Scanner;

		public class Ex004{

			public static void main(String[] args) {

			//DECLARANDO VARIAVEIS
			
			 double salarioGratifi, salarioLiquido, salarioBruto,desconto,salariocomGratifi;
			 Scanner ler = new Scanner(System.in);
			 
			 //INFORMACOES
			 
			 System.out.println("Informe seu salario: ");
			 salarioBruto = ler.nextDouble();
			 
			 salarioGratifi = salarioBruto * 0.1;
			 salariocomGratifi = salarioBruto + salarioGratifi;
			 desconto = salariocomGratifi * 0.15;
			 salarioLiquido = salariocomGratifi - desconto;
			 
			 //FIM
			 
			 System.out.println("Seu salario de " + salarioBruto + " mais o 10% de gratificacao é:");
			 System.out.println(salariocomGratifi);
			
			 System.out.println("Seu salario Liquido de " + salariocomGratifi + " menos o 15% de desconto é: ");
			 System.out.println(salarioLiquido);



	}

}
