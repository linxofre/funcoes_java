package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		double num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		double num2 = entrada.nextInt();
		System.out.print("Informe o terceiro número: ");
		double num3 = entrada.nextInt();
		
		double t = soma(num1, num2, num3);
		System.out.println("a soma dos 3 números é: "+t);	
	}
	public static double soma(double n1, double n2, double n3) { 
		return n1+n2+n3;
	}

}