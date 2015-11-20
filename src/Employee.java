
public class Employee extends Person {
	
	private double revenue;
	private int numOfSales;

	public Employee() {
		super();
	}
	
	/**
	 * Create an employee.
	 * Ask for employee name and set new ID.
	 * Set revenue and number of sales to 0.
	 */
	public void createEmployee() {
		this.nameInputEmployee(getName());
		this.id = newEmployeeId();
		this.setRevenue(0);
		this.setNumOfSales(0);
		
		this.credentials();
		
		employeedatabase.addEmployee(this);
		
		System.out.println("Employee succesfully created.");
	}
	
	public void removeEmployee() {
		employeedatabase.removeEmployee(this);
	}
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	public void setNumOfSales(int numOfSales) {
		this.numOfSales = numOfSales;
	}
	
	public double getRevenue() {
		return revenue;
	}
	
	public int getNumOfSales() {
		return numOfSales;
	}

}
