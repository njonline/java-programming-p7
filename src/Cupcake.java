import java.util.Scanner;

public abstract class Cupcake {

	protected String flavor;
	protected double price;
	protected int quantity;
	
	CupcakeDB cupcakedatabase = new CupcakeDB();
	
	Scanner scanner = new Scanner(System.in);
	
	public Cupcake() {
		
	}
	
	/**
	 * Creates a new cupcake. Sets the flavor and price.
	 * @param flavor
	 * @param price
	 */
	public void createCupcake(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}
	
	/**
	 * Ask the user for input, and adds the specific number of cakes to the list.
	 * @throws IllegalArgumentException
	 */
	protected void addCakes() throws IllegalArgumentException {
		System.out.println("Enter quantity to be added: ");
		int n = scanner.nextInt();
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				cupcakedatabase.addCupcake(this);
			}
		} else {
			throw new IllegalArgumentException("The amount has to be positive");
		}
	}
	
	public void removeCakes(int qty) throws IllegalArgumentException {
		System.out.println("Enter quantity to be removed: ");
		int n = scanner.nextInt();
		
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				cupcakedatabase.removeCupcake(this);
			}
		} else {
			throw new IllegalArgumentException("The amount has to be positive");
		}
	}
	
	public void changePrice(double price) {
		this.setPrice(price);
	}
	
	public void changeFlavor(String flavor) {
		this.setFlavor(flavor);
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return cupcakedatabase.numOfCupcakes();
	}
}
