import java.util.Scanner;

public abstract class Cupcake {

	protected String flavor;
	protected double price;
	protected int quantity;
	
	CupcakeDB cupcakedatabase = new CupcakeDB();
	
	Scanner scanner = new Scanner(System.in);
	
	public Cupcake() {
		
	}
	
	public void createCupcake(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}
	
	protected void numOfCakes() {
		System.out.println("Enter quantity to be added: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			cupcakedatabase.addCupcake(this);
		}
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
