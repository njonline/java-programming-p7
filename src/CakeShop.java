import java.util.Scanner;

public class CakeShop {
	
	private static EmployeeDB employees = new EmployeeDB();
	Scanner employeeName = new Scanner(System.in);

	public Employee createEmployee() {
		int id = newId();
		String name = newName();
		Employee employee = new Employee(id, name, this);
		CakeShop.employees.addEmployee(employee);
		return employee;
	}
	
	private int newId() {
		return CakeShop.employees.numOfEmployees() + 1;
	}
	
	public int getId() {
		return newId();
	}
	
	private String newName() {
		String name;
		
		System.out.println("Enter the name of the employee");
		name = employeeName.next();
		
		return name;
	}
	
	public static void main(String[] args) {
		
		CakeShop cakeshop = new CakeShop();		
		
		Blueberry blueberry = new Blueberry();
		
		blueberry.createCupcake();
		System.out.println("The current quantity is: " + blueberry.getQuantity());
		
		blueberry.createCupcake();
		System.out.println("The current quantity is now: " + blueberry.getQuantity());
				
	}

}
