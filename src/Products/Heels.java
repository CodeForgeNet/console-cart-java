package Products;

public class Heels extends Products{
	public Heels(String name, int id, double price, int quantity, String brand, String type) {
		super(name, id, price, quantity, brand, type);
	}

	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , Id:"+getId()+" , Price:"+getPrice()+" , Quantity:"+getQuantity()+" , Brand:"+getBrand()+" , Type:"+getType() +" ]";
	}
}
