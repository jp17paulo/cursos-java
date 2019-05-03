package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Entrada de Dados java - Parte 1
		 * Seção: 1
		 * Aula 18
		 * */
		
		/*Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		/*Também serve para ler na mesma linha*/
		/*System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
        
		
		/* Entrada de Dados java - Parte 2
		 * Seção: 1
		 * Aula 18
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); //35
		/*Limpeza de stream de entrada(flush)*/
		sc.nextLine();
		String name = sc.nextLine();// Bob Brown
		char gender = sc.next().charAt(0); // F
		
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		// 4.32
		double n2 = sc.nextDouble();
		
		//Maria F 23 1.68
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(height);
		
		sc.close();
		

	}

}
