package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_4 {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			double numero= 0;
			System.out.print("Digite o valor de um n�mero:");
			numero = entrada.nextDouble();
			
			System.out.println(numero);	
			System.out.println(letras(numero));

			entrada.close();
			
			
		}
		public static double letras(double numero) {
			if (numero > 0){
				System.out.println("� positivo, portanto P");	
			} else {
				System.out.println("� negativo ou igual a zero, portanto N");
		    }
			
			return numero;	
		}

}

	
	


