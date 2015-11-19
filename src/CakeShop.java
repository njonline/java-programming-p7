
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Employee employee = new Employee();
		Blueberry blueberry = new Blueberry();
		OrderDB orderdb = new OrderDB();
		Order order = new Order();
		
		employee.createEmployee();
		employee.login();
	}

}
