package Products;

public class Products extends Items{
	
	private String brand;
	private String type;
	
	public Products(String name, int id, double price, int quantity, String brand, String type) {
		super(name, id, price, quantity);
		this.brand=brand;
		this.type=type;
		
	}
	
//	Getter
	
	public String getBrand() {
		return this.brand;
	}
	
	
	public String getType() {
		return this.type;
	}
	
	
	public double calculateTotal() {
		return getPrice() * getQuantity();
	}
	

}
