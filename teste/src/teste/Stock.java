package teste;

public class Stock {
	
	private String name;
	private double price;
	private int quantity;
	
	public Stock() {
		
	}
	public Stock(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public double  value(){
		return price*quantity;
	}
	public void addProduct(int quantity) {
		this.quantity+=quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Product data: "+name+String.format(", $ %.2f,  ", price)+quantity+String.format(" units, Total: $ %.2f", value());
	}
	
}
