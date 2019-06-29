package exemplos;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class Heranca {

	public static void main(String[] args) {

		AccountHeranca acc = new AccountHeranca(1001, "Alex", 0.0);
		BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		// Atribuir BusinessAccount(sub classe) para Account(super classe)
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Bob", 0.0, 200.0);
		
		// Atribuir SavingsAccount(sub classe) para Account(super classe)
		AccountHeranca acc3 = new SavingsAccountHeranca(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		// Atribuir Account(super classe) para BusinessAccount(sub classe)
		BusinessAccountHeranca acc4 = (BusinessAccountHeranca)acc2;
		acc4.loan(100.0);
		
		// BusinessAccountHeranca acc5 = (BusinessAccountHeranca)acc3;
		/*Verificando se a instancia do objeto é do tipo BusinessAccountHeranca
		  e se caso for verdadeiro efetuar a conversão
		  Obs: Verificação efetuada para evitar erro em tempo de execução. */
		if (acc3 instanceof BusinessAccountHeranca) {
			BusinessAccountHeranca acc5 = (BusinessAccountHeranca)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccountHeranca) {
			SavingsAccountHeranca acc5 = (SavingsAccountHeranca)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
