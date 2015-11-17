import java.util.Scanner;

public abstract class Person {

	private String name;
	protected int id = 0;
	
	protected EmployeeDB employeedatabase = new EmployeeDB();
	protected CustomerDB customerdatabase = new CustomerDB();
	
	private Scanner scanner = new Scanner(System.in);
	
	public Person() {

	}
	
	public void createEmployee(String name, int id) {
		this.name = name;
		this.id = getId();
	}
	
	protected void nameInputEmployee(String name) {
		System.out.println("Employee name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	protected void nameInputCustomer(String name) {
		System.out.println("Customer name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	protected int newEmployeeId() {
		this.id = employeedatabase.getNumOfEmployees() + 1;
		return id;		
	}
	
	protected int newCustomerId() {
		this.id = customerdatabase.getCustomers() + 1;
		return id;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
