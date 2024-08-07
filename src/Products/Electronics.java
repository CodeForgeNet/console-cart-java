package Products;

public class Electronics extends Products{
	
	private int launch;

	public Electronics(String name, int id, double price, int quantity, String brand, String type, int launch) {
		super(name, id, price, quantity, brand, type);
		this.launch = launch;
	}
	
	public int getLaunch() {
		return launch;
	}
	
}
