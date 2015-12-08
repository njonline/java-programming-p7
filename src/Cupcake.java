
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cupcake extends Product {

    CupcakeDB cupcakedatabase = new CupcakeDB();
    private File file = new File("cupcakes.txt");
    private BufferedWriter writer;

    public Cupcake() {
        super();
    }

    public void createProduct() {
        this.setName(productNameInput());
        this.setFlavor(productFlavorInput());
        this.setPrice(productPriceInput());
        this.setQuantity(productQuantityInput());
        
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(this.getName() + ",");
            writer.write(this.getFlavor() + ",");
            writer.write(this.getPrice() + ",");
            writer.write(this.getQuantity() + "");
            writer.write("\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        cupcakedatabase.addCupcake(this);
    }

    @Override
    public String toString() {
        return ("Product name: " + this.getName() + ". Product flavor: " + this.getFlavor() + ". Product price: " + this.getPrice() + ". Product quantity: " + this.getQuantity());
    }
}
