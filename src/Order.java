import java.util.ArrayDeque;
import java.util.Scanner;

public class Order {

	private int id;
	private int totalNumOfOrders = 0;
	private double value;
	
	OrderDB orderdatabase = new OrderDB();
	ArrayDeque<Cupcake> orderItems;
	
	Scanner scanner = new Scanner(System.in);
	
	public Order() {
		
	}
	
	public void createOrder() {
		orderItems = new ArrayDeque<Cupcake>();
		this.id = newOrderId();
		this.value = 0;
	}
	
	public void addItems(Cupcake cupcake) {
		System.out.println("Enter number of cupcakes: ");
		int qty = scanner.nextInt();
		
		if(qty > 0) {
			for(int i = 0; i < qty; i++) {
				orderItems.add(cupcake);
				setOrderValue(cupcake.getPrice());
			}
		} else {
			throw new IllegalArgumentException("The amount has to be positive");
		}
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
