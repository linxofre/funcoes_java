package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_5 {

	public static void main (String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		double porcentagem = 0;
		double produto = 0;
		
		System.out.print("Digite o valor da porcentagem: ");
		porcentagem = entrada.nextDouble();
		
		System.out.print("Digite o valor do produto: ");
		produto = entrada.nextDouble();
		
		System.out.println("Valor com imposto: R$ " + somaImposto(porcentagem, produto));
		entrada.close();
	}
	
	public static double somaImposto(double porcentagem, double produto) {
		 return (1 + porcentagem / 100) * produto;	
	}
	

}
