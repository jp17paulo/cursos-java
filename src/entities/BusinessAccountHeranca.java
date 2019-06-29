package entities;

//Conta Empresarial
public class BusinessAccountHeranca extends AccountHeranca {

	private Double loanLimit;
	
	public BusinessAccountHeranca() {
		super();
	}

	public BusinessAccountHeranca(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	

}
