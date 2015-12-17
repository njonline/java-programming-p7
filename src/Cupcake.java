
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This class contains information of cupcakes of type product.
 * Extends the superclass product.
 * @author Group
 *
 */
public class Cupcake extends Product {

    private static CupcakeDB cupcakedatabase = new CupcakeDB(); //create new data structure
    private File file = new File("cupcakes.txt"); //specify text file
    private BufferedWriter writer; //new bufferedwriter

    public Cupcake() {
        super();
    }
    
    /**
     * Method for adding cupcakes to datastructure on system startup.
     */
    public void addProductOnStartup() {
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        	String text;
        	while((text = br.readLine()) != null) {
        		Cupcake cupcake = new Cupcake(); //create new cupcake
        		String[] ca = text.split(","); //split text by comma
        		cupcake.setProductId(Integer.parseInt(ca[0]));
        		cupcake.setName(ca[1]);
        		cupcake.setFlavor(ca[2]);
        		cupcake.setQuantity(Integer.parseInt(ca[4]));
        		cupcake.setPrice(Double.parseDouble(ca[3]));
        		cupcakedatabase.addCupcake(cupcake); //add to data structure
        	} br.close(); //close writer
        } catch(IOException e) {
        	e.printStackTrace();
        }
    }

    /**
     * Method for creating products in the system.
     * Upon creating a new product, the product is added to data structure,
     * and written to textfile.
     */
    public void createProduct(JPanel panel) {
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
        JOptionPane.showMessageDialog(panel, "Product succesfully created.");
        cupcakedatabase.addCupcake(this);
    }
    
    /**
     * Find and return cupcake by the entered name.
     * @param name
     * @return
     */
    public static Cupcake findCupcake(String name) {
    	return cupcakedatabase.searchFor(name);
    }
    
    /**
     * Create new product id.
     */
	protected int newProductId() {
		this.id = cupcakedatabase.getNumOfCupcakes() + 1;
		return id;
	}
}
