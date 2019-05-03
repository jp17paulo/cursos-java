package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;
import entities.Employee;

public class EstruturaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/************** Exercício 1 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * int senha = sc.nextIntInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha Inválida"); senha =
		 * sc.nextIntInt(); }
		 * 
		 * System.out.println("Acesso Permitido");
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int senha = sc.nextIntInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha Invalida"); senha =
		 * sc.nextIntInt(); }
		 * 
		 * System.out.println("Acesso Permitido");
		 * 
		 * sc.close();
		 */

		/************** Exercício 2 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * //String x = null; //String y = null;
		 * 
		 * //x = sc.nextInt(); //y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) {
		 * 
		 * if (x >= 0 && y >=0 ) {
		 * 
		 * System.out.println("1º Quadrante"); x = sc.nextInt(); y = sc.nextInt();
		 * 
		 * } else if(x < 0 && y >=0) {
		 * 
		 * System.out.println("2º Quadrante"); x = sc.nextInt(); y = sc.nextInt();
		 * 
		 * } else if(x < 0 && y < 0) {
		 * 
		 * System.out.println("3º Quadrante"); x = sc.nextInt(); y = sc.nextInt();
		 * 
		 * } else if(x >= 0 && y < 0) {
		 * 
		 * System.out.println("4º Quadrante"); x = sc.nextInt(); y = sc.nextInt(); }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { if (x > 0 && y > 0) {
		 * System.out.println("primeiro"); } else if (x < 0 && y > 0) {
		 * System.out.println("segundo"); } else if (x < 0 && y < 0) {
		 * System.out.println("terceiro"); } else { System.out.println("quarto"); } x =
		 * sc.nextInt(); y = sc.nextInt(); }
		 * 
		 * sc.close();
		 */

		/************** Exercício 1 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int cod = sc.nextInt();
		 * 
		 * int contAlcool = 0; int contGasolina = 0; int contDiesel = 0;
		 * 
		 * while (cod != 4) {
		 * 
		 * if (cod == 1 ) {
		 * 
		 * contAlcool++;
		 * 
		 * } else if(cod == 2) {
		 * 
		 * contGasolina++;
		 * 
		 * } else if(cod == 3) {
		 * 
		 * contDiesel++;
		 * 
		 * } else if(cod == 4) {
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * sc.nextInt();
		 * 
		 * }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int alcool = 0; int gasolina = 0; int diesel = 0;
		 * 
		 * int tipo = sc.nextInt();
		 * 
		 * while (tipo != 4) { if (tipo == 1) { alcool = alcool + 1; } else if (tipo ==
		 * 2) { gasolina = gasolina + 1; } else if (tipo == 3) { diesel = diesel + 1; }
		 * 
		 * tipo = sc.nextInt(); }
		 * 
		 * System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: " +
		 * alcool); System.out.println("Gasolina: " + gasolina);
		 * System.out.println("Diesel: " + diesel);
		 * 
		 * sc.close();
		 */

		/*********************** FOR **************************/

		/************** Exercício 1 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int num = sc.nextInt();
		 * 
		 * 
		 * if (num >= 1 && num <= 1000) {
		 * 
		 * for (int i = 0; i <= num; i++) {
		 * 
		 * if (i % 2 != 0 ) {
		 * 
		 * System.out.println(i); }
		 * 
		 * }
		 * 
		 * } else {
		 * 
		 * System.out.println("Favor digitar um número entre 1 e 1000");
		 * 
		 * }
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt();
		 * 
		 * for (int i=1; i<=x; i++) { if (i % 2 != 0) { System.out.println(i); } }
		 * 
		 * sc.close();
		 */

		/************** Exercício 2 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt(); int in = 0; int out = 0;
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * int digitado = sc.nextInt();
		 * 
		 * if (digitado >= 10 && digitado <= 20) {
		 * 
		 * in++;
		 * 
		 * } else {
		 * 
		 * out++; }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(in + " in"); System.out.println(out + " out");
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * int in = 0; int out = 0;
		 * 
		 * for (int i=0; i<n; i++) { int x = sc.nextInt(); if (x >= 10 && x <= 20) { in
		 * = in + 1; } else { out = out + 1; } }
		 * 
		 * System.out.println(in + " in"); System.out.println(out + " out");
		 * 
		 * sc.close();
		 */

		/************** Exercício 3 **************/

		/* Não terminado */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt(); double valores = 0; double result = 0;
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * for (int j = 0; j < n; j++) {
		 * 
		 * valores += sc.nextDouble(); sc.nextDouble();
		 * 
		 * }
		 * 
		 * result = valores/n;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i=0; i<n; i++) {
		 * 
		 * double a = sc.nextDouble(); double b = sc.nextDouble(); double c =
		 * sc.nextDouble();
		 * 
		 * double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		 * 
		 * System.out.printf("%.1f%n", media); }
		 * 
		 * sc.close();
		 */

		/************** Exercício 4 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * double a = sc.nextDouble(); double b = sc.nextDouble(); double result = 0;
		 * 
		 * if (b != 0) {
		 * 
		 * result = a/b; System.out.println(result);
		 * 
		 * } else {
		 * 
		 * System.out.println("divisão impossivel");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i=0; i<n; i++) {
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * if (y == 0) { System.out.println("divisao impossivel"); } else { double div =
		 * (double) x / y; System.out.printf("%.1f%n", div); } }
		 * 
		 * sc.close();
		 */

		/************** Exercício 5 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt(); int cont = 0;
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * 
		 * int fatorial = n; int result = 0;
		 * 
		 * while (fatorial != 0) {
		 * 
		 * result += n * (fatorial-1); fatorial--; }
		 * 
		 * System.out.println(result); }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * int fat = 1; for (int i=1; i<=n; i++) { fat = fat * i; }
		 * 
		 * System.out.println(fat);
		 * 
		 * sc.close();
		 */

		/************** Exercício 6 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt(); int result = 0;
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * if (n % i == 0) {
		 * 
		 * System.out.println(i); }
		 * 
		 * }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i=1; i<=n; i++) { if (n % i == 0) { System.out.println(i); } }
		 * 
		 * sc.close();
		 */

		/************** Exercício 7 **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * int quadrado = i * i; int cubo = i * i * i;
		 * 
		 * System.out.println(i + " " + quadrado + " " + cubo);
		 * 
		 * }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i=1; i<=n; i++) {
		 * 
		 * int primeiro = i; int segundo = i * i; int terceiro = i * i * i;
		 * System.out.printf("%d %d %d%n", primeiro, segundo, terceiro); }
		 * 
		 * sc.close();
		 */

		/************** Adicional **************/

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter N: ");
		 * 
		 * int n = sc.nextInt();
		 * 
		 * while (n <= 0) {
		 * 
		 * System.out.println("N must be positive! Try again:");
		 * 
		 * n = sc.nextInt(); }
		 * 
		 * int min = 0; int max = 0; int numDigitado = 0;
		 * 
		 * for (int j = 1; j <= n; j++) {
		 * 
		 * System.out.printf("Value #: ");
		 * 
		 * numDigitado = sc.nextInt();
		 * 
		 * if (j == 1) {
		 * 
		 * min = numDigitado; }
		 * 
		 * else if( j != 1 && numDigitado < min) {
		 * 
		 * min = numDigitado;
		 * 
		 * } else {
		 * 
		 * max = numDigitado;
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("Higher " + max);
		 * 
		 * 
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Enter N: ");
		 * 
		 * int n = sc.nextInt();
		 * 
		 * while (n <= 0) {
		 * 
		 * System.out.print("N must be positive! Try again: "); n = sc.nextInt(); }
		 * 
		 * int higher = Integer.MIN_VALUE;
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * System.out.print("Value #" + i + ": "); int x = sc.nextInt();
		 * 
		 * if (x > higher) {
		 * 
		 * higher = x;
		 * 
		 * } }
		 * 
		 * System.out.println("Higher = " + higher); sc.close();
		 */

		/************** Página 50 ******************************/

		/************** Exercício 1 ******************************/

		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * double width = 0; double height = 0; double area = 0; double perimetro = 0;
		 * 
		 * Triangle triangle = new Triangle();
		 * 
		 * System.out.println("Enter rectangle with and height:");
		 * 
		 * width = sc.nextDouble(); height = sc.nextDouble();
		 * 
		 * area = triangle.area(width,height); perimetro = triangle.perimetro(width,
		 * height);
		 * 
		 * System.out.printf("AREA = %.2f%n", area);
		 * System.out.printf("PERIMETRO = %.2f%n", perimetro);
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); Triangle
		 * rect = new Triangle();
		 * 
		 * System.out.println("Enter rectangle width and height:");
		 * 
		 * rect.width = sc.nextDouble(); rect.height = sc.nextDouble();
		 * 
		 * System.out.printf("AREA = %.2f%n", rect.area());
		 * System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		 * System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		 * 
		 * sc.close();
		 */

		/************** Exercício 2 ******************************/

		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Name: ");
		 * 
		 * String name = sc.nextLine();
		 * 
		 * System.out.println("Gross salary: "); double salary = sc.nextDouble();
		 * 
		 * System.out.println("Tax: "); double tax = sc.nextDouble();
		 * 
		 * double liquidSalary = salary - tax;
		 * 
		 * System.out.printf("Employee: %s, %.2f%n", name, liquidSalary);
		 * 
		 * System.out.println("Whitch percentage to increase salary? "); double
		 * percentage = sc.nextDouble(); double increase = (percentage * salary) / 100;
		 * double valorComAumento = liquidSalary + increase;
		 * 
		 * System.out.printf("Update data: %s, $ %.2f%n", name, valorComAumento);
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/************** Exercício 3 ******************************/

		/*
		 * Locale.setDefault(Locale.US);
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); Student student = new Student();
		 * 
		 * String name = sc.nextLine(); double n1 = sc.nextDouble(); double n2 =
		 * sc.nextDouble(); double n3 = sc.nextDouble();
		 * 
		 * double addNotes = student.finalGrade(n1, n2, n3);
		 * 
		 * System.out.printf("FINAL GRADE =  %.2f%n", addNotes);
		 * 
		 * if (addNotes >= 60.00) {
		 * 
		 * System.out.println("PASS");
		 * 
		 * } else {
		 * 
		 * double missingPoints = 60 - addNotes;
		 * 
		 * System.out.printf("MISSING =  %.2f POINTS%n", missingPoints); }
		 * 
		 * 
		 * sc.close();
		 */

		/**************** Resolução do professor ****************/

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); Employee
		 * emp = new Employee();
		 * 
		 * System.out.print("Name: "); emp.name = sc.nextLine();
		 * 
		 * System.out.print("Gross salary: "); emp.grossSalary = sc.nextDouble();
		 * 
		 * System.out.print("Tax: "); emp.tax = sc.nextDouble();
		 * 
		 * System.out.println(); System.out.println("Employee: " + emp);
		 * System.out.println();
		 * System.out.print("Which percentage to increase salary? ");
		 * 
		 * double percentage = sc.nextDouble();
		 * 
		 * emp.increaseSalary(percentage);
		 * 
		 * System.out.println(); System.out.println("Updated data: " + emp);
		 * 
		 * sc.close();
		 */

		/************** Exercício de fixação página 53 ******************************/

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		CurrencyConverter currencyConverter = new CurrencyConverter();

		System.out.println("What is the dollar price? ");
		double currentQuot = sc.nextDouble();

		System.out.println("How many dollars will be bought? ");
		double qtdBuy = sc.nextDouble();

		double amountTopay = currencyConverter.calculation(currentQuot, qtdBuy);

		System.out.printf("Amount to be paid in reais = R$ %.2f%n", amountTopay);

		sc.close();

		/**************** Resolução do professor ****************/

	}

}
