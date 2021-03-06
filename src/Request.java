
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * This is the class that represents the requests from the customers.
 * This class is responsible for adding/deleting products in the request.
 * @author Group 5
 *
 */
public class Request {

    private int id;
    private double value;
    private Date date;

    private RequestDB requestdatabase = new RequestDB(); //data structure for requests
    private ArrayList<Product> requestItems = new ArrayList<Product>(); //data structure for added items
       
    /**
     * Creates a new order. 
     * Assigns an ID. 
     * Sets the value of the order to 0.
     * Sets the date to now.
     */
    public Request() {
        this.setRequestId(newRequestId());
        this.setRequestValue(0.0);
        this.date = new Date();
    }

    /**
     * Asks the user for the number of cupcakes to add to the order. Everytime a
     * cupcake is added to the order, a cupcake is removed from the inventory.
     * Updates the order value everytime a cupcake is added.
     *
     * @param cupcake
     * @throws IllegalArgumentException if the amount to be added is less than
     * equal to 0.
     */
    public void addItems(Product product, JSpinner spinner, JLayeredPane pane, JTable table) throws IllegalArgumentException {
        int qty = (int) spinner.getValue(); //get the added quantity from table

        if (qty > 0) {
            if (qty <= product.getQuantity()) {
                for (int i = 0; i < qty; i++) {
                    this.setRequestValue(getRequestValue() + product.getPrice()); //update request value
                    requestItems.add(product);
                    product.setQuantity(product.getQuantity() - 1); //update product in stock
                }
            } else {
            	DefaultTableModel model = (DefaultTableModel) table.getModel();
                int rowCount = model.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                	model.removeRow(i);
                }
                table.setModel(model);
            	JOptionPane.showMessageDialog(pane, "There is not enough in stock.");
                throw new IllegalArgumentException("There is not enough in stock");
            }
        } else {
            throw new IllegalArgumentException("The amount has to be positive");
        }
    }

    /**
     * Asks the user for the number of cupcakes to remove from the order.
     * Everytime a cupcake is removed, a cupcake is added back to the inventory.
     *
     * @param cupcake
     * @throws IllegalArgumentException if the amount to be removed is less than
     * or equal to 0.
     */
    public void removeItems(Product product, int quantity) throws IllegalArgumentException {
        int qty = quantity;
        		
        if (qty > 0) {
            if (qty <= getNumOfRequestItems()) {
                for (int i = 0; i < qty; i++) {
                    this.setRequestValue(getRequestValue() - product.getPrice());
                    requestItems.remove(product);
                    product.setQuantity(product.getQuantity() + 1);
                }
            }
        } else {
            throw new IllegalArgumentException("The number has to be positive.");
        }
    }

    /**
     * Updates the employees' total revenue with the order value. Updates the
     * employees' number of sales. Add the order to the order db. Removes all
     * items from the order.
     * Clears the order table. 
     * @param employee
     */
    public void closeRequest(JTable table, JTextField textfield) throws IllegalArgumentException {
    	Employee employee = Employee.employeeLogin();

        employee.setRevenue(employee.getRevenue() + Double.parseDouble(textfield.getText()));
        employee.setNumOfSales(employee.getNumOfSales() + 1);
        
        this.setRequestValue(Double.parseDouble(textfield.getText()));
        requestdatabase.addRequest(this);            
        requestItems.clear();
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
        table.setModel(model);
    }

    /**
     * Removes all items from the order.
     * Clears the order table.
     * Returns the added products to stock.
     * @param table
     * @param col1
     * @param col2
     */
    public void cancelRequest(JTable table, int col1, int col2) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	int rowCount = model.getRowCount();
    	
    	for (int i = 0; i < rowCount; i++) {
        	Cupcake cupcake = Cupcake.findCupcake(model.getValueAt(i, col1).toString());
        	cupcake.setQuantity(cupcake.getQuantity() + Integer.parseInt(model.getValueAt(i, col2).toString()));
    	}
        requestItems.clear();
        
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
        table.setModel(model);
    }

    private int newRequestId() {
        this.id = requestdatabase.getNumOfRequests() + 1;
        return id;
    }

    public void setRequestId(int id) {
        this.id = id;
    }

    public void setRequestValue(double value) {
        this.value = value;
    }
    
    public void setDate(Date date) {
    	this.date = date;
    }

    public int getNumOfRequestItems() {
        return requestItems.size();
    }

    public int getRequestId() {
        return id;
    }
    
    public String getRequestIdToString() {
    	return Integer.toString(id);
    }

    public double getRequestValue() {
        return value;
    }
    
    public String getRequestValueToString() {
    	return Double.toString(value);
    }
    
    public String getDateToString() {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	return df.format(date);
    }
}
