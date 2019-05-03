package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Entrada de dados em Java - Parte 2
		 * Seção: 2
		 * Aula 18
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine(); // Alex Green
		
		System.out.println("How many bedrrons are there in your house");
		int qtdQuartos = sc.nextInt(); // 3
		
		System.out.println("Enter product price");
		double preco = sc.nextDouble(); // 500.50
		
		System.out.println("Enter your last name, age and height (same line)");
		String lastName = sc.next(); // Green
		int age = sc.nextInt();// 21
		double height = sc.nextDouble(); // 1.73
		
		System.out.println(name);
		System.out.println(qtdQuartos);
		System.out.printf("%.2f\n",preco);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		
		sc.close();

	}

}
