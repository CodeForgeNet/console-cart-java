package Products;

public abstract class Items {
	
	private String name;
	private int id;
	private double price;
	private int quantity;
	
	
	public Items(String name, int id, double price, int quantity) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity=quantity;
	}
	
//	Getter
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
//	Setter
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
//	Abstract method
	public abstract double calculateTotal();
	

}
