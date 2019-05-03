package exerciciosFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class EstruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/********************Exercícios Resolvidos*********************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
		
			System.out.println("Higher = " + a);
		
		}
		
		else if (b > c) {
		
			System.out.println("Higher = " + b);
		}
		else {
		
			System.out.println("Higher = " + c);
		}
		
		sc.close();*/
		
		
		/*********************Exercício 1*********************/
		
		/*Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int verificaNum = num % 2;
		
		if (verificaNum > 0) {
			
			System.out.println("NEGATIVO");
			
		} else {
			
			System.out.println("NÃO NEGATIVO");

		}
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		

		/*Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();*/
		
		
		/*********************Exercício 2*********************/
		
		/*Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int verificaNum = num % 2;
		
		if (verificaNum != 0 ) {
			System.out.println("IMPAR");
		} else {
            System.out.println("PAR");
		}
		
		sc.close();*/
		
		
		/**************************Resolução do professor***********************/
		
		/*Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();*/
		
		
		/*********************Exercício 3*********************/
		
		/*Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int calc1 = a % b;
		int calc2 = b % a;
		
		if (calc1 == 0 || calc2 == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		
		/*Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();*/
		
		/*********************Exercício 4*********************/
		
		/*Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int horasJogadas = 0;
		
		if (horaInicial > horaFinal) {
			
			horasJogadas = (24 - horaInicial) + horaFinal;
		}
		
		else if(horaInicial < horaFinal){
           
			horasJogadas = horaFinal - horaInicial;
		}
		
		else {
			
			horasJogadas  = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", horasJogadas);
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		
		/*Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();*/
		
		
		/*********************Exercício 5*********************/
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produtos> produto  = new ArrayList<>();
		
		Produtos cachorroQuente = new Produtos();
		Produtos xSalada = new Produtos();
		Produtos xBacon = new Produtos();
		Produtos torradaSimples = new Produtos();
		Produtos refrigerante = new Produtos();
		
		cachorroQuente.setCodigo(1);
		cachorroQuente.setDescricao("Cachorro Quente");
		cachorroQuente.setPreco(4.00);
		produto.add(cachorroQuente);
		
		xSalada.setCodigo(2);
		xSalada.setDescricao("XSalada");
		xSalada.setPreco(4.50);
		produto.add(xSalada);
		
		
		xBacon.setCodigo(3);
		xBacon.setDescricao("XBacon");
		xBacon.setPreco(5.00);
		produto.add(xBacon);
		
		torradaSimples.setCodigo(4);
		torradaSimples.setDescricao("Torrada Simples");
		torradaSimples.setPreco(2.00);
		produto.add(torradaSimples);
		
		refrigerante.setCodigo(5);
		refrigerante.setDescricao("Refrigerante");
		refrigerante.setPreco(1.50);
		produto.add(refrigerante);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double result = 0;
		
		for (Produtos produtos : produto) {
			if (codigo == produtos.getCodigo()) {
				
				result = qtd * produtos.getPreco();
			}
		}
		
		System.out.printf("R$ %.2f", result);
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		
		/*Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();*/
		
		/*********************Exercício 6*********************/
		
		/*Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		if (num >= 0 && num <= 25) {
			
			System.out.println("Intervalo (0,25])");
			
		} else if(num > 25 && num <= 50) {

			System.out.println("Intervalo [25,50]");
		
		} else if(num > 50 && num <= 75){
			
			System.out.println("Intervalo [50,75]");
	    
		} else if(num > 75 && num <= 100) {
	    
			System.out.println("Intervalo [75,100])");
	    	
	    }
		
		else {
			
			System.out.println("Fora de intervalo");
		}
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
		
		/*********************Exercício 7*********************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0) {
			
			System.out.println("Origem");
			
		} else if(x > 0.0 && x < 2.0) {
            
			System.out.println("Q1");
		
		} else if(x > 1.0 && x < 3.0) {
			
			System.out.println("Q2");
			
		} else if(x > 2 && x < 4.0) {
			
			System.out.println("Q3");
		
		}else if(x > 3) {
		
		System.out.println("Q4");
	    
		}
		
		sc.close();*/
		
		
		/**************************Resolução do professor***********************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();*/
		
		/*********************Exercício 8*********************/
		
		/*Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		double salario = sc.nextDouble();
		double desconto = 0;
		
		if (salario >= 0.00 && salario <= 2000.00 ) {
			
			System.out.println("Isento");
			
		} else if(salario >= 2001.00 && salario <= 3000.00) {

			desconto += ((salario - 2000.00) * 8 ) / 100;	
			System.out.printf("R$  %.2f", desconto);
		
		} else if(salario >=3001.00 && salario <= 4500.00) {
			
			desconto += (1000.00 * 8) / 100;
			desconto += ((salario - 3000.00) * 18) / 100;
			System.out.printf("R$  %.2f", desconto);
			
		} else {
			
			desconto += (1000.00 * 8) / 100;
			desconto += (1500.00 * 18) / 100;
			desconto += ((salario - 4500.00) * 28) / 100;
			System.out.printf("R$  %.2f", desconto);
			
		}
		
		
		sc.close();*/
		
		/**************************Resolução do professor***********************/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
