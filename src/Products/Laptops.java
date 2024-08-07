package Products;

public class Laptops extends Electronics {

	public Laptops(String name, int id, double price, int quantity, String brand, String type, int launch) {
		super(name, id, price, quantity, brand, type, launch);
	}

	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , "+"Id:"+getId()+" , "+"Price:"+getPrice()+" , "+"Quantity:"+getQuantity()+" , "+"Brand:"+getBrand()+" , "+"Type:"+getType()+" , "+"Launched:"+getLaunch() ;
	}
	

}
