
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Order extends Observable {

    private int id;
    private int totalNumOfOrders;
    private double value;
    private Date date;

    private OrderDB orderdatabase = new OrderDB();
    private ArrayList<Product> orderItems = new ArrayList<Product>();
    
    private BufferedWriter writer;
    private File file = new File("requests.txt");
    
    /**
     * Creates a new order. Assigns an ID. Sets the value of the order to 0.
     */
    public Order() {
        this.id = newOrderId();
        this.setOrderValue(0.0);
        this.date = new Date();
    }
    
    private void saveOrder() {
    	try{
    		writer = new BufferedWriter(new FileWriter(file, true));
    		writer.write(getOrderId() + ",");
    		writer.write(getOrderValue() + ",");
    		writer.write(getDateToString() + "");
    		writer.write("\n");
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
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
    public void addItems(Product product, JSpinner spinner) throws IllegalArgumentException {
        int qty = (int) spinner.getValue();

        if (qty > 0) {
            if (qty <= product.getQuantity()) {
                for (int i = 0; i < qty; i++) {
                    setOrderValue(getOrderValue() + product.getPrice());
                    orderItems.add(product);
                    product.setQuantity(product.getQuantity() - 1);
                }
            } else {
                throw new IllegalArgumentException("There is not enough in stock");
            }
        } else {
            throw new IllegalArgumentException("The amount has to be positive");
        }
        this.inform();
        System.out.println("Order value is now: " + this.getOrderValue());
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
            if (qty <= getNumOfOrderItems()) {
                for (int i = 0; i < qty; i++) {
                    setOrderValue(getOrderValue() - product.getPrice());
                    orderItems.remove(product);
                    product.setQuantity(product.getQuantity() + 1);
                }
            }
        } else {
            throw new IllegalArgumentException("The number has to be positive.");
        }
        this.inform();
        System.out.println("Order value is now: " + this.getOrderValue());
    }

    /**
     * Updates the employees' total revenue with the order value. Updates the
     * employees' number of sales. Add the order to the order db. Removes all
     * items from the order.
     *
     * @param employee
     * @throws IllegalArgumentException if the employee is not logged in.
     */
    public void closeOrder(JTable table, JTextField textfield) throws IllegalArgumentException {
        Employee employee = Employee.lookAtLoggedIn(0);

        if (employee != null) {
            employee.setRevenue(employee.getRevenue() + Double.parseDouble(textfield.getText()));
            employee.setNumOfSales(employee.getNumOfSales() + 1);
            orderdatabase.addOrder(this);
            this.saveOrder();
            orderItems.clear();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
            	model.removeRow(i);
            }
            table.setModel(model);
        } else {
        	throw new IllegalArgumentException("Employee not logged in.");
        }
        this.inform();
    }

    public void cancelOrder(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        orderItems.clear();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
        this.inform();
    }
    
    protected void inform() {
        // Mark this Observable object as having been changed 
        this.setChanged();
        /* notify all of its observers and then call the clearChanged
		 * method to indicate that this object has no longer changed */
        this.notifyObservers();
    }

    /**
     * Create a new ID for the order. We start at 1 instead of zero. We use a
     * counter instead of the size of the ArrayList, so we do not get confused
     * when an order is deleted.
     *
     * @return
     */
    private int newOrderId() {
        totalNumOfOrders++;
        this.id = getTotalNumOfOrders();
        return id;
    }

    public void setOrderId(int id) {
        this.id = id;
    }

    public void setTotalNumOfOrders(int totalNumOfOrders) {
        this.totalNumOfOrders = totalNumOfOrders;
    }

    public void setOrderValue(double value) {
        this.value = value;
    }
    
    public void setDate(Date date) {
    	this.date = date;
    }

    public int getNumOfOrderItems() {
        return orderItems.size();
    }

    public int getOrderId() {
        return id;
    }

    public int getTotalNumOfOrders() {
        return totalNumOfOrders;
    }

    public double getOrderValue() {
        return value;
    }
    
    public String getDateToString() {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	return df.format(date);
    }
}
