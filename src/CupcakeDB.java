import java.util.ArrayList;

public class CupcakeDB {
	
	private static ArrayList<Product> cupcakes;
	
	public CupcakeDB() {
		cupcakes = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		cupcakes.add(product);
	}
	
	public void removeProduct(Product product) {
		cupcakes.remove(product);
	}
	
	public int numOfProducts() {
		return cupcakes.size();
	}

	
}
