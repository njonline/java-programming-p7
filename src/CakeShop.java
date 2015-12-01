
public class CakeShop {
	
	public static void main(String[] args) throws Exception {	

		Employee employee = new Employee();
		Administrator admin = new Administrator();
		Cupcake cupcake = new Cupcake();
		Order order = new Order();
		
		admin.createEmployee();
		System.out.println(admin.lookAt(0));
		employee.login(0);
		cupcake.createProduct();
		order.createOrder();
		order.addItems(cupcake);
		order.closeOrder(0);
		System.out.println(admin.lookAt(0));
	}

}
