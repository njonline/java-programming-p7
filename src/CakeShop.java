
public class CakeShop {
	
	public static void main(String[] args) {	
		
		Blueberry blueberry = new Blueberry();
		Employee employee = new Employee();
		
		employee.createEmployee();
		System.out.println("The name of the employee is: " + employee.getName() + " and the id is: " + employee.getId());
				
	}

}
