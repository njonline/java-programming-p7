
import java.util.Scanner;

public abstract class Product {

    protected String name;
    protected String flavor;
    protected double price;
    protected int quantity;
    protected int id;

    Scanner scanner = new Scanner(System.in);

    /**
     * Creates a new product. Sets the flavor and price.
     *
     * @param flavor
     * @param price
     * @param name
     */
    public abstract void createProduct();
    
    public abstract void addProductOnStartup();

    protected String productNameInput() {
        System.out.println("Product name: ");
        name = scanner.nextLine();
        return name;
    }

    protected String productFlavorInput() {
        System.out.println("Product flavor: ");
        flavor = scanner.nextLine();
        return flavor;
    }

    protected double productPriceInput() {
        System.out.println("Product price: ");
        price = scanner.nextDouble();
        return price;
    }

    protected int productQuantityInput() {
        System.out.println("Product qty in stock: ");
        quantity = scanner.nextInt();
        return quantity;
    }

    public int newProductId() {
    	this.id = id++;
    	return id;
    }
    
    public void setProductId(int id) {
    	this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public int getProductId() {
    	return id;
    }
    
    public String getProductIdToString() {
    	return Integer.toString(id);
    }

    public String getName() {
        return name;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }
    
    public String getProductPriceToString() {
    	return Double.toString(price);
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String getProductQuantityToString() {
    	return Integer.toString(quantity);
    }
}
