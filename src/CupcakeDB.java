
import java.util.ArrayList;

public class CupcakeDB {

    private static ArrayList<Product> cupcakes;

    public CupcakeDB() {
        cupcakes = new ArrayList<Product>();
    }

    public void addCupcake(Product product) {
        cupcakes.add(product);
    }

    public void removeCupcake(Product product) {
        cupcakes.remove(product);
    }

    public int getNumOfCupcakes() {
        return cupcakes.size();
    }
}
