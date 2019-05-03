package entities;

public class CurrencyConverter {
	
	public double currentQuot;
	public double qtdBuy;
	
	public double calculation(double currentQuot, double qtdBuy) {
		
		double calculationBuy = currentQuot * qtdBuy;
		
		return calculationBuy += calculationBuy * 6 / 100 ;
		
	}

}
