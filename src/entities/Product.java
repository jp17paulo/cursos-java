package entities;

public class Product {
//	public String name;
//	public double price;
//	public int quantity;
	
    private String name;
    private double price;
    private int quantity;
   	
	//Construtor
	
	//Construtor padrão
	public Product() {

	} 
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//Poderia fazer porém por padrão irá iniciar com 0
		//quantity = 0;
	}
	
	
	
	// Métodos para os atributos por convenção vem após os construtores
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public double getPrice() {
		return price;
	}
	
	public double setPrice(double price) {
		return this.price = price;
	}
	
	public double getQuantity(double quatity) {
		return quatity;
	}
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ "
	                + String.format("%.2f", price)
                    + ", " 
	                + quantity + " units, Total: $ "
				    + String.format("%.2f", totalValueInStock());
	}
}