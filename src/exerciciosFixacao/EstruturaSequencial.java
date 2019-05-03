package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;



public class EstruturaSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Exercício Resolvido
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área 
		 * do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
		 * conforme exemplo.
		 * ********Exemplo*********
		 * Entrada                             Saída
		 * 10.0                                AREA = 300.00
		 * 30.0                                PRECO = 60000.00
		 * 200.00
		 * */
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double largura = sc.nextDouble();
	    double comprimento = sc.nextDouble();
	    double valorMetro = sc.nextDouble();
	    
	    
	    double area = largura * comprimento;
	    double preco = area * valorMetro;
	    
	    
	    System.out.printf("AREA = %.2f\n",area);
	    System.out.printf("PRECO = %.2f",preco);
	    
	 
		sc.close();*/
		
		
		/********************Resolução do professor***********************/

		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double largura = sc.nextDouble();
	    double comprimento = sc.nextDouble();
	    double metroQuadrado = sc.nextDouble();
	    
	    
	    double area = largura * comprimento;
	    double preco = area * metroQuadrado;
	    
	    
	    System.out.printf("AREA = %.2f\n",area);
	    System.out.printf("PRECO = %.2f",preco);
	    
	 
		sc.close();*/
		
		/**************Exercício 1**************/
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a 
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 * 
		 * Exemplos:
		 * 
		 * Entrada:                            Saída:             
		 * 10                                  SOMA = 40
		 * 30
		 * 
		 * Entrada:                            Saída:
		 * -30                                 SOMA = -20
		 * 10
		 * 
		 * Entrada:                            Saída:
		 * 0                                   SOMA = 0
		 * 0                           
		 * */
		
		/*Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();*/
		
		/****************Resolução do professor****************/
		
		/*Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();*/
		
		
		/**************Exercício 2**************/
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área 
		 * deste círculo com quatro casas decimais conforme exemplos.
             Fórmula da área: area = π . raio * raio
             Considere o valor de π = 3.14159
         
         Exemplos:
         
         Entrada:                                 Saída:
         2.00                                     A=12.5664

         Entrada:                                 Saída:
         100.64                                   A=31819.3103

         Entrada:                                 Saída:
         150.00                                   A=70685.7750  
         */
		
		/*Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		//double valorArea = Math.PI * Math.pow(raio, 2);
		double valorArea = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f" , valorArea);
		
		
		sc.close();*/
		
		/**************Resolução do professor****************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();*/
		
		/**************Exercício 3**************/
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
		 *  a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Exemplos:
         
         Entrada:                                                  Saída:
         5                                                         DIFERENCA = -26
         6
         7
         8

         Entrada:                                                  Saída:
         5                                                         DIFERENCA = 86
         6
         -7
         8
		 * 
		 * */
		
		/*Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = a * b - c * d;
		
		
		System.out.println("DIFERENCA = " + diferenca);
		
		
		sc.close();*/
		
		/******************Resolução do professor*******************/
		
        /*Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();*/
		
		/**************Exercício 4 *************/
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f ", salario);
		
		
		sc.close();*/
		
		
		/**************Exercício 5 *************/
		
		/*Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int numPecas = sc.nextInt();
		
		
		sc.close();*/
		
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();*/
		
		
		/**************Exercício 6 *************/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
				
	}

}
