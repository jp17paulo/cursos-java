package exerciciosFixacao;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.AccountTratamentoExcecoes;
import model.exceptions.DomainException;

public class TratamentoExcecoes {
	
	public static void main(String[] args) throws ParseException {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account data");
	System.out.print("Number: ");
	int number = sc.nextInt();
	System.out.print("Holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Initial balance: ");
	double balance = sc.nextDouble();
	System.out.print("Withdraw limit: ");
	double withdrawLimit = sc.nextDouble();
	
	//Instanciando a classe Account e setando seus atriburos com as informações passadas pelo usuário
	AccountTratamentoExcecoes acc = new AccountTratamentoExcecoes(number, holder, balance, withdrawLimit);
	
	System.out.println();
	System.out.print("Enter amount for withdraw: ");
	
	//Valor do saque
	double amount = sc.nextDouble();
	try {
		
		//Passando o valor do saque para o método responsável
		acc.withdraw(amount);
		
		//Obtendo o saldo após o saque
		System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
	}
	catch (DomainException e) {
		//Obtendo a mensagem de erro especifica sendo tratada na classe Account
		System.out.println("Withdraw error: " + e.getMessage());
	}
	
	sc.close();

	}

}
