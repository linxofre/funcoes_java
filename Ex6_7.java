package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_7 {

public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double dia= 0;
		double prestacao= 0;
		
		System.out.print("Digite o valor da prestacao: ");
		prestacao = entrada.nextDouble();
		
		System.out.print("Digite o número de dias em atraso: ");
		dia = entrada.nextDouble();
		
		entrada.close();
		valorPagamento(prestacao, dia);
		double total = valorPagamento(prestacao, dia)+ prestacao;
		System.out.println("valor total a pagar: "+ total);
	}
	public static double valorPagamento(double prestacao, double dia) {
		return  (prestacao * 0.03 + 0.01 * dia);
	}

}