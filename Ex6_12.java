package exercicio6_funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex6_12 {

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a palavra: ");
		String letras= entrada.next();
		System.out.println(shuffleString(letras)); 
	
	 }
	
	public static String shuffleString(String s) {
	    List<String> letras = new ArrayList<String>();
	    String temp = "";

	    for (int i = 0; i < s.length(); i++) {
	    	letras.add(String.valueOf(s.charAt(i)));
	    }
	    System.out.println("");

	    Collections.shuffle(letras);

	    for (int i = 0; i < s.length(); i++) {
	        temp += letras.get(i);
	    }
	    return temp;
	}

}
