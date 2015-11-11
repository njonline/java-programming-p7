public class Blueberry extends Cupcake {
	
	CupcakeDB cupcakedatabase = new CupcakeDB();

	public Blueberry() {
		super();
	}
	
	public void createCupcake() {
		this.setFlavor("Blueberry");
		this.setPrice(10.95);
		
		this.numOfCakes();
	}
	
}
