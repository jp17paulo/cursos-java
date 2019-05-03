package exerciciosFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeList;

public class Construtores {

	public static void main(String[] args) {
	
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			//Sobrecarga
			account = new Account(number, holder, initialDeposit);
			
		}
		
		else {
			//Sobrecarga
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		//Despositar
		System.out.println();
		System.out.println("Enter a desposit value:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
        //Sacar
		System.out.println();
		System.out.println("Enter a desposit value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		sc.close();  */
		
		/*****************Vetores Tipo Referência, aula 69******************/
		/**************Exercício Resolvido******************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		//double sum = 0;
		
		for (int i = 0; i < n; i++) {
			
			vect[i] = sc.nextDouble();
		    //sum += vect[i];	
		}
		
		//Resolução do professor para a média
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			
			sum += vect[i];
			
		}
		
		double avg = sum /n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();*/
		
		/*****************Vetores Tipo Classe, aula 70******************/
		/**************Exercício Resolvido******************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetor[] vect = new ProductVetor[n];
		double sum = 0;
		
		//for (int i = 0; i < n; i++) {
		
		for (int i = 0; i < vect.length; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor(name, price);
		    sum += vect[i].getPrice();
		}
		
		//Resolução do professor 
		
		/*double sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}*/
		
		/*double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		sc.close();*/
		
		/*****************Vetores Tipo Classe, aluguel para estudantes, aula 70******************/
		/*********************************************Exercício**********************************/
		
		//Resolução do professor
		
		/*Scanner sc = new Scanner(System.in);
		StudentVetor[] vect = new StudentVetor[10];
		
		System.out.print("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
		
			System.out.println();
		
			System.out.println("Rent #" + i + ":");
		
			System.out.print("Name: ");
		
			sc.nextLine();
		
			String name = sc.nextLine();
		
			System.out.print("Email: ");
		
			String email = sc.nextLine();
		
			System.out.print("Room: ");
		
			int room = sc.nextInt();
		
			vect[room] = new StudentVetor(name, email);
		}
		
		System.out.println();
		
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
		
			if (vect[i] != null) {
		
				System.out.println(i + ": " + vect[i]);
		
			}
		}
		
		sc.close();*/
		
		/*****************Listas, aula 73******************/
		/***************Exercício de Fixação***************/
		
		/*Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		
		System.out.println(list.size());
		
		
		//For Each
		for (String x : list) {
			
			System.out.println(x);
			
		}
		
		//System.out.println("-----------Remover por posição--------------");
		
		//Removendo por posição
		//list.remove(1); 
		
		System.out.println("\n----------Remover por predicado---------------\n");
		
		//Removendo por predicado
		              //Função Lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		
        for (String x : list) {
			
			System.out.println(x);
			
		}
        
        System.out.println("\n----------Encontrar a posição---------------\n");
        
        //Encontrar a posição de um elemento
        
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        
        //No caso Marco não existe na lista, sendo assim será retornado -1
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        
        
        System.out.println("\n----------Filtrar---------------\n");
                                   /*Para aceitar Lambda
                                   (Não compativel com List)*/             //Converter o Stream para list                              
        /*List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : result) {
			
			System.out.println(x);
			
		}
        
        System.out.println("\n-Encontrar primeiro elemento que atenda a um predicado----------\n");
                                                                   /*Primeiro 
                                                                   elemento*/   // Se não encontrar apresenta null 
        /*String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
        System.out.println(name);
        
		sc.close();*/
		
		/*****************Listas, aula 76******************/
		/***************Exercício***************/
		
		/*Locale.setDefault(Locale.US);
		List<EmployeeList> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		String name;
		double salary;
		
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i);
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Name: ");
			name = sc.nextLine();
			
			System.out.println("Salary: ");
			salary = sc.nextDouble();
		
			list.add(new EmployeeList(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("This id does not exist!");
			
		} else {
			
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);

		}
		
		System.out.println();
		
		System.out.println("List of employees: ");
		
		for (EmployeeList obj : list) {
			
			System.out.println(obj);
			
		}
		
		sc.close();*/
		
		/*************Resolução do professor******************/
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeList> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			
			int id = sc.nextInt();
			System.out.print("Name: ");
			
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeList(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeList obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); */
		
		/*****************Arrays,77******************/
		/**************Exercício Resolvido******************/
		
		/*Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			               //Quantidade de colunas do array
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();*/
		
		/*****************Arrays,77******************/
		/**************Exercício de fixação******************/
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
						
		}
		
// **************Testando impressão do array***************
		
////		for (int i = 0; i < mat.length; i++) {
////			for (int j = 0; j < mat[i].length; j++) {
////				int count = j;
////				if (j < n && count < n) {
////
////					System.out.print(mat[i][j] + " ");
////					count++;
////
////					if (count == n) {
////						System.out.println("\n");
////					}
////
////				}
////
////			}
////			
//			
//		}
		
		int x = sc.nextInt();
		
		
		for (int i=0; i<mat.length; i++) {
			
			for (int j=0; j<mat[i].length; j++) {
				
				if (mat[i][j] == x) {
					
//					Acrescentei para testes
//					int line = i + 1;
//					
//					System.out.println("Line : " + line);
					
					System.out.println("Position " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
			
		
		
		
		sc.close();
		
		

	}

}
