
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cupcake extends Product {

    private static CupcakeDB cupcakedatabase = new CupcakeDB();
    private File file = new File("cupcakes.txt");
    private BufferedWriter writer;

    public Cupcake() {
        super();
    }
    
    public void addProductOnStartup() {
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        	String text;
        	while((text = br.readLine()) != null) {
        		Cupcake cupcake = new Cupcake();
        		String[] ca = text.split(",");
        		cupcake.setProductId(Integer.parseInt(ca[0]));
        		cupcake.setName(ca[1]);
        		cupcake.setFlavor(ca[2]);
        		cupcake.setQuantity(Integer.parseInt(ca[3]));
        		cupcake.setPrice(Double.parseDouble(ca[4]));
        		cupcakedatabase.addCupcake(cupcake);
        	} br.close();
        } catch(IOException e) {
        	e.printStackTrace();
        }
    }

    public void createProduct() {
    	this.setProductId(newProductId());
        this.setName(productNameInput());
        this.setFlavor(productFlavorInput());
        this.setPrice(productPriceInput());
        this.setQuantity(productQuantityInput());
        
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(this.getProductId() + ",");
            writer.write(this.getName() + ",");
            writer.write(this.getFlavor() + ",");
            writer.write(this.getPrice() + ",");
            writer.write(this.getQuantity() + "");
            writer.write("\n");

            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        cupcakedatabase.addCupcake(this);
    }
    
    public static Cupcake findCupcake(String name) {
    	return cupcakedatabase.searchFor(name);
    }

    @Override
    public String toString() {
        return ("Product name: " + this.getName() + ". Product flavor: " + this.getFlavor() + ". Product price: " + this.getPrice() + ". Product quantity: " + this.getQuantity());
    }
}
