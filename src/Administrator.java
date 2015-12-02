import java.io.*;
import java.util.Scanner;

public class Administrator extends Person {
	
	private Employee employee;

	public Administrator() {
		super();
	}
	
	public void createAdmin() {
		this.credentials();
		
		admindatabase.addAdmin(this);
		
		System.out.println("Succesfully created Administrator.");
	}
	
	/**
	 * Create an employee.
	 * Ask for employee name and set new ID.
	 * Set revenue and number of sales to 0.
	 * Run method for creating username and password.
	 * Add to employee db.
	 * @return 
	 */
	public Employee createEmployee() {
		employee = new Employee();
		employee.setFirstname(firstnameInputEmployee());
		employee.setLastname(lastnameInputEmployee());
		//employee.setAddress(addressInputEmployee());
		//employee.setTelephone(telephoneInputEmployee());
		employee.setId(newEmployeeId());
		employee.setRevenue(0);
		employee.setNumOfSales(0);
		
		employee.credentials();
		
		employeedatabase.addEmployee(employee);
		
		System.out.println("Employee succesfully created.");
		
		return employee;
	}
	
	/**
	 * Sets the entered name to the name of the employee.
	 * @param name
	 */
	private String firstnameInputEmployee() {
		System.out.println("Employee firstname: ");
		firstname = scanner.nextLine();
		return firstname;
	}
	
	private String lastnameInputEmployee() {
		System.out.println("Employee lastname: ");
		lastname = scanner.nextLine();
		return lastname;
	}
	
	private String addressInputEmployee() {
		System.out.println("Employee address: ");
		address = scanner.nextLine();
		return address;
	}
	
	private int telephoneInputEmployee() {
		System.out.println("Employee telephone number: ");
		telephone = scanner.nextInt();
		return telephone;
	}

	protected int newEmployeeId() {
		this.id = employeedatabase.getNumOfEmployees() + 1;
		return id;
	}
	
}