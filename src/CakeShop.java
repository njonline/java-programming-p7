
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Employee employee = new Employee();
		Administrator admin = new Administrator();
		Cupcake cupcake = new Cupcake();
		Order order = new Order();
		
		cupcake.createProduct();
		System.out.println(cupcake);
		
		order.createOrder();
		order.addItems(cupcake);
		//order.closeOrder(employee);
		
		System.out.println("The total order value is: " + order.getOrderValue() + ". Containing " + order.getNumOfOrderItems() + " items.");
		
		order.removeItems(cupcake);
		System.out.println("The total order value is: " + order.getOrderValue() + ". Containing " + order.getNumOfOrderItems() + " items.");
		
		System.out.println(cupcake);
	}

}
