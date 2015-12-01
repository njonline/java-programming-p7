import java.util.Scanner;

public class Cupcake extends Product {
	
	CupcakeDB cupcakedatabase = new CupcakeDB();
	
	Scanner scanner = new Scanner(System.in);
	
	public Cupcake() {
		super();
	}
	
	public void createProduct() {		
		this.setName(productNameInput());
		this.setFlavor(productFlavorInput());
		this.setPrice(productPriceInput());
		this.setQuantity(productQuantityInput());
		
		cupcakedatabase.addCupcake(this);
	}
	
	@Override
	public String toString() {
		return ("Product name: " + this.getName() + ". Product flavor: " + this.getFlavor() + ". Product price: " + this.getPrice() + ". Product quantity: " + this.getQuantity());
    }
}
