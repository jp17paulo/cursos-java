package entities;

//Conta Poupança
public class SavingsAccountHeranca extends AccountHeranca {
	
	//Taixa de Juros
	private Double interestRate;
	
	//Poderia usar o construtor da própria classe porém por padrão recomenda-se usar o da classe super
	public SavingsAccountHeranca() {
		super();
	}

	public SavingsAccountHeranca(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

}
