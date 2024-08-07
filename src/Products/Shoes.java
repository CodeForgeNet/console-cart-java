package Products;

public class Shoes extends Products {

	public Shoes(String name, int id, double price, int quantity, String brand, String type) {
		super(name, id, price, quantity, brand, type);
	}

	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , Id:"+getId()+" , Price:"+getPrice()+" , Quantity:"+getQuantity()+" , Brand:"+getBrand()+" , Type:"+getType() +" ]";
	}
	
}
