
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Blueberry blueberry = new Blueberry();
		Order order = new Order();
		
		blueberry.createCupcake();
		order.createOrder();
		System.out.println("The order ID is: " + order.getOrderId());
		
		order.addItems(blueberry);
		System.out.println("The total value of the order is: " + order.getOrderValue());
	
	}

}
