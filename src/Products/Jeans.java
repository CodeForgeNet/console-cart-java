package Products;

public class Jeans extends Clothing{

	
	public Jeans(String name, int id, double price, int quantity, String brand, String type, String color) {
		super(name, id, price, quantity, brand, type, color);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , Id:"+getId()+" , Price:"+getPrice()+" , Quantity:"+getQuantity()+" , Brand:"+getBrand()+" , Type:"+getType()+" , Color:"+getColor() +" ]" ;
	}
	
}
