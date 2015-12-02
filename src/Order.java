import java.util.ArrayDeque;
import java.util.Scanner;

public class Order {

	private int id;
	private int totalNumOfOrders = 0;
	private double value;
	
	private EmployeeDB employeedatabase = new EmployeeDB();
	
	private OrderDB orderdatabase = new OrderDB();
	private ArrayDeque<Product> orderItems;
	
	private Scanner scanner = new Scanner(System.in);
	
	public Order() {
		
	}
	
	/**
	 * Creates a new order.
	 * Assigns an ID.
	 * Sets the value of the order to 0.
	 */
	public void createOrder() {
		orderItems = new ArrayDeque<Product>();
		this.id = newOrderId();
		this.value = 0;
	}
	
	/**
	 * Asks the user for the number of cupcakes to add to the order.
	 * Everytime a cupcake is added to the order, a cupcake is removed from the inventory.
	 * Updates the order value everytime a cupcake is added.
	 * @param cupcake
	 * @throws IllegalArgumentException if the amount to be added is less than equal to 0.
	 */
	public void addItems(Product product) throws IllegalArgumentException {
		System.out.println("Enter number of cupcakes to add to the order: ");
		int qty = scanner.nextInt();
		
		if(qty > 0) {
			if(qty <= product.getQuantity()) {
				for(int i = 0; i < qty; i++) {
					setOrderValue(value + product.getPrice());
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
	 * @param cupcake
	 * @throws IllegalArgumentException if the amount to be removed is less than or equal to 0.
	 */
	public void removeItems(Product product) throws IllegalArgumentException {
		System.out.println("Enter number of cupcakes to remove from the order: ");
		int qty = scanner.nextInt();
		
		if(qty > 0) {
			if(qty <= getNumOfOrderItems()) {
				for(int i = 0; i < qty; i++) {
					setOrderValue(value - product.getPrice());
					orderItems.remove(product);
					product.setQuantity(product.getQuantity() + 1);
				}
			}
		} else {
			throw new IllegalArgumentException("The number has to be positive.");
		}
	}
	
	/**
	 * Updates the employees' total revenue with the order value.
	 * Updates the employees' number of sales.
	 * Add the order to the order db.
	 * Removes all items from the order.
	 * @param employee
	 * @throws IllegalArgumentException if the employee is not logged in.
	 */
	public void closeOrder(int index) throws IllegalArgumentException {
		Employee employee = Person.lookAt(index);
		
		if(employee.getLoggedIn()) {
			employee.setRevenue(getOrderValue());
			employee.setNumOfSales(employee.getNumOfSales() + 1);
			orderdatabase.addOrder(this);
			orderItems.removeAll(orderItems);
		}
	}
	
	public void cancelOrder(Cupcake cupcake) {
		orderItems.removeAll(orderItems);
	}
	
	/**
	 * Create a new ID for the order. We start at 1 instead of zero.
	 * We use a counter instead of the size of the ArrayList, so we do not get confused when an order is deleted.
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
}
