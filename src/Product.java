
public abstract class Product {

	protected String name;
	protected String flavor;
	protected double price;
	protected int quantity;
	
	/**
	 * Creates a new cupcake. Sets the flavor and price.
	 * @param flavor
	 * @param price
	 * @param name
	 */
	public void createProduct(String name, String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
		this.name = name;
	}
	
}
