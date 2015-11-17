import java.util.ArrayDeque;
import java.util.Scanner;

public class Order {

	private int id;
	private int totalNumOfOrders = 0;
	private double value;
	
	private OrderDB orderdatabase = new OrderDB();
	private ArrayDeque<Cupcake> orderItems;
	private CupcakeDB cupcakedatabase = new CupcakeDB();
	
	private Scanner scanner = new Scanner(System.in);
	
	public Order() {
		
	}
	
	public void createOrder() {
		orderItems = new ArrayDeque<Cupcake>();
		this.id = newOrderId();
		this.value = 0;
	}
	
	public void addItems(Cupcake cupcake) throws IllegalArgumentException {
		System.out.println("Enter number of cupcakes to add to the order: ");
		int qty = scanner.nextInt();
		
		if(qty > 0) {
			if(qty < cupcake.getQuantity()) {
				for(int i = 0; i < qty; i++) {
					setOrderValue(value + cupcake.getPrice());
					orderItems.add(cupcake);
					cupcakedatabase.removeCupcake(cupcake);
				} 
			} else {
				throw new IllegalArgumentException("There is not enough in stock");
			}
		} else {
			throw new IllegalArgumentException("The amount has to be positive");
		}
	}
	
	public void removeItems(Cupcake cupcake) {
		System.out.println("Enter number of cupcakes to remove from the order: ");
		int qty = scanner.nextInt();
		
		if(qty > 0) {
			if(qty < getNumOfOrderItems()) {
				for(int i = 0; i < qty; i++) {
					setOrderValue(value - cupcake.getPrice());
					orderItems.remove(cupcake);
					cupcakedatabase.addCupcake(cupcake);
				}
			}
		}
	}
	
	public void closeOrder(Employee employee) throws IllegalArgumentException {
		if(employee.getLoggedIn()) {
			employee.setRevenue(getOrderValue());
			employee.setNumOfSales(employee.getNumOfSales() + 1);
			orderdatabase.addOrder(this);
			orderItems.removeAll(orderItems);
		} else {
			throw new IllegalArgumentException("Employee is not logged in.");
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
