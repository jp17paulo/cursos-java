package exerciciosFixacao;

import java.util.Locale;

public class SaidaDadosJava {

	/*Saída de dados em Java
	 * Seção: 2 
	 * Aula 14
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println("Computer, whiche price is " + price1);
		System.out.println("Office desk, which price is " + price2);
		System.out.printf("\nRecord: %d years old, code %d and gender: %c%n%n", age, code, gender);
		System.out.printf("Meause with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", measure);
		

	}

}
