package Products;

public class Clothing extends Products{
	
	private String color;
	
	public Clothing(String name, int id, double price, int quantity, String brand, String type, String color) {
		super(name, id, price, quantity, brand, type);
		this.color=color;
		
	}

	public String getColor() {
		return color;
	}
	
	
	
}
