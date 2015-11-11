import java.util.ArrayList;

public class CupcakeDB {
	
	private static ArrayList<Cupcake> cupcakes;
	
	public CupcakeDB() {
		cupcakes = new ArrayList<Cupcake>();
	}
	
	public void addCupcake(Cupcake cupcake) {
		cupcakes.add(cupcake);
	}
	
	public void removeCupcake(Cupcake cupcake) {
		cupcakes.remove(cupcake);
	}
	
	public int numOfCupcakes() {
		return cupcakes.size();
	}

}
