package exercicio6_funcao;

import java.util.Scanner;
import java.text.*;

public class Ex6_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();

		entrada.close();
		contador(numero);
	}
	
	//Função 
	public static String contador(int numero) {
		String contador =  Integer.toString(numero);
		System.out.print("A quantidade de dígitos:" + contador.length());
		return contador;
	}

}
