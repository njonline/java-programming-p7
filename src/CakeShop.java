
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Employee employee = new Employee();
		Blueberry blueberry = new Blueberry();
		OrderDB orderdb = new OrderDB();
		Order order = new Order();
		
		employee.createEmployee();
		employee.login();
		System.out.println("Employee name is: " + employee.getName() + " and ID is: " + employee.getId() + ". Employee has sold for " + employee.getRevenue() + ". There is " + orderdb.getNumOfOrders() + " order in the database.");
		
		blueberry.createCupcake();
		System.out.println("We now have " + blueberry.getQuantity() + " in stock. The price for each blueberry cupcake is " + blueberry.getPrice());
		
		order.createOrder();
		System.out.println("New order created with ID of: " + order.getOrderId());
		
		order.addItems(blueberry);
		System.out.println("Order value is now " + order.getOrderValue() + ", and there is " + order.getNumOfOrderItems() + " items on the order");
		System.out.println("There is now " + blueberry.getQuantity() + " in stock.");
		
		order.removeItems(blueberry);
		System.out.println("Order value is now " + order.getOrderValue() + ", and there is " + order.getNumOfOrderItems() + " items on the order");
		System.out.println("There is now " + blueberry.getQuantity() + " in stock.");
		
		order.closeOrder(employee);
		System.out.println("Employee " + employee.getName() + " has now sold for " + employee.getRevenue() + ", making " + employee.getNumOfSales() + " sales. There is " + orderdb.getNumOfOrders() + " order in the database.");
		System.out.println("There is now " + order.getNumOfOrderItems() + " items on the order list.");
	}

}
