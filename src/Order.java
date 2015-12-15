
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Order {

    private int id;
    private int totalNumOfOrders = 0;
    private double value;
    private Date date;

    private OrderDB orderdatabase = new OrderDB();
    private ArrayList<Product> orderItems = new ArrayList<Product>();
       
    /**
     * Creates a new order. Assigns an ID. Sets the value of the order to 0.
     */
    public Order() {
        this.setOrderId(newOrderId());
        this.setOrderValue(0.0);
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
    public void addItems(Product product, JSpinner spinner) throws IllegalArgumentException {
        int qty = (int) spinner.getValue();

        if (qty > 0) {
            if (qty <= product.getQuantity()) {
                for (int i = 0; i < qty; i++) {
                    this.setOrderValue(getOrderValue() + product.getPrice());
                    orderItems.add(product);
                    product.setQuantity(product.getQuantity() - 1);
                }
            } else {
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
            if (qty <= getNumOfOrderItems()) {
                for (int i = 0; i < qty; i++) {
                    this.setOrderValue(getOrderValue() - product.getPrice());
                    orderItems.remove(product);
                    product.setQuantity(product.getQuantity() + 1);
                }
            }
        } else {
            throw new IllegalArgumentException("The number has to be positive.");
        }
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
        } else {
        	throw new IllegalArgumentException("Employee not logged in.");
        }
        
        this.setOrderValue(Double.parseDouble(textfield.getText()));
        orderdatabase.addOrder(this);            
        orderItems.clear();
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
        table.setModel(model);
    }

    public void cancelOrder(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        orderItems.clear();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
    }

    private int newOrderId() {
        this.id = orderdatabase.getNumOfOrders() + 1;
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
    
    public String getOrderIdToString() {
    	return Integer.toString(id);
    }

    public int getTotalNumOfOrders() {
        return totalNumOfOrders;
    }

    public double getOrderValue() {
        return value;
    }
    
    public String getOrderValueToString() {
    	return Double.toString(value);
    }
    
    public String getDateToString() {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	return df.format(date);
    }
}
