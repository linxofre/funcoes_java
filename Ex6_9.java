package exercicio6_funcao;

import java.util.Scanner;

public class Ex6_9 {

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		
		int numero= 0;
		
		System.out.print("Digite o valor de um número inteiro: ");
		numero = entrada.nextInt();
		
		entrada.close();
		inverso(numero);
	 }
	
	public static String inverso (int numero) {
		String inverso =  Integer.toString(numero);
		
		char[] ch = new char[inverso.length()];
		
        for (int i = 0; i < inverso.length(); i++) {
            ch[i] = inverso.charAt(i);
        }
  
        for (int i = inverso.length()-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        return inverso;
	}

}
