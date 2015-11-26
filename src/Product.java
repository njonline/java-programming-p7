import java.util.Scanner;

public abstract class Product { 
			
	private String name; 
	private double price; 
	private String flavor;
	
	CupcakeDB cupcakedatabase = new CupcakeDB();
	
	Scanner scanner = new Scanner(System.in);
	
	
	public Product() {
	}
	
/**
* Creates a new product. Sets the flavor and price.
* @param flavor
* @param price
*/
	
public void createProduct(String flavor, double price) {
	this.flavor = flavor;
	this.price = price;
	}
	
/**
* Ask the user for input, and adds the specific number of cakes to the list.
* @throws IllegalArgumentException
*/
protected void addProduct() throws IllegalArgumentException {
	System.out.println("Enter quantity to be added: ");
	int n = scanner.nextInt();
	if(n > 0) {
		for(int i = 0; i < n; i++) {
			cupcakedatabase.addProduct(this);
		}
	} else {
		throw new IllegalArgumentException("The amount has to be positive");
	}
}
	
public void removeProduct(int qty) throws IllegalArgumentException {
	System.out.println("Enter quantity to be removed: ");
	int n = scanner.nextInt();
		
	if(n > 0) {
		for(int i = 0; i < n; i++) {
			cupcakedatabase.removeProduct(this);
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
	
/**
* @return the price
*/
	public double getPrice() {
		return price;
	}

/**
* @param price the price to set
*/
	public void setPrice(double price) {
		this.price = price;
	}

/**
* @return the name
*/
	public String getName() {
		return name;
	}

/**
* @param name the name to set
 */
	public void setName(String name) {
		this.name = name;
	}
}

