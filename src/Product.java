
import javax.swing.JPanel;

public abstract class Product {

    protected String name;
    protected String flavor;
    protected double price;
    protected int quantity;
    protected int id;

    /**
     * Creates a new product. Sets the flavor and price.
     *
     * @param flavor
     * @param price
     * @param name
     */
    public abstract void createProduct(JPanel panel);
    
    public abstract void addProductOnStartup();

    protected String productNameInput() {
        name = HomeEmpFin.productName.getText();
        return name;
    }

    protected String productFlavorInput() {
        flavor = HomeEmpFin.productFlavor.getText();
        return flavor;
    }

    protected double productPriceInput() {
        price = Double.parseDouble(HomeEmpFin.productPrice.getText());
        return price;
    }

    protected int productQuantityInput() {
        quantity = Integer.parseInt(HomeEmpFin.productQuantity.getText());
        return quantity;
    }

    protected abstract int newProductId();
    
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
    
    public String getProductIdToString() {
    	return Integer.toString(id);
    }
    
    public String getProductQuantityToString() {
    	return Integer.toString(quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}
