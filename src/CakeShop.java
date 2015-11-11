
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Blueberry blueberry = new Blueberry();
		Employee employee = new Employee();
		
		blueberry.createCupcake();
		employee.createEmployee();
		System.out.println("The current quantity is: " + blueberry.getQuantity() + ". The name of the employee is: " + employee.getName());
				
	}

}
