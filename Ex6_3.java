package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro n�mero: ");
		double num1 = entrada.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		double num2 = entrada.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		double num3 = entrada.nextInt();
		
		double t = soma(num1, num2, num3);
		System.out.println("a soma dos 3 n�meros �: "+t);	
	}
	public static double soma(double n1, double n2, double n3) { 
		return n1+n2+n3;
	}

}