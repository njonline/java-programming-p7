
public class Customer extends Person {
	
	private int numOfOrders;
	private int cancelledOrders;
	
	private CustomerDB customerdatabase = new CustomerDB();
	
	public Customer() {
		super();
	}

	public void createCustomer() {
		this.firstnameInput(getFirstname());
		this.lastnameInput(getLastname());
		this.id = newCustomerId();
		this.setNumOfOrders(0);
		this.setCancelledOrders(0);
		
		customerdatabase.addCustomer(this);
	}
	
	/**
	 * Sets the entered name to the name of the customer.
	 * @param name
	 */
	private void firstnameInput(String firstname) {
		System.out.println("Customer firstname: ");
		firstname = scanner.nextLine();
		this.setFirstname(firstname);
	}
	
	private void lastnameInput(String lastname) {
		System.out.println("Customer firstname: ");
		lastname = scanner.nextLine();
		this.setFirstname(lastname);
	}
	
	protected int newCustomerId() {
		this.id = customerdatabase.getCustomers() + 1;
		return id;
	}
	
	public void deleteCustomer() {
		customerdatabase.removeCustomer(this);
	}

	public int getNumOfOrders() {
		return numOfOrders;
	}

	public void setNumOfOrders(int numOfOrders) {
		this.numOfOrders = numOfOrders;
	}

	public int getCancelledOrders() {
		return cancelledOrders;
	}

	public void setCancelledOrders(int cancelledOrders) {
		this.cancelledOrders = cancelledOrders;
	}
}
