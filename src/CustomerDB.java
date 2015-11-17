import java.util.ArrayList;

public class CustomerDB {

	/*
	 * Data structure for  the employee database
	 */
	private static ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public CustomerDB() {

	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public int getCustomers() {
		if(customers.size() > 0) {
			return customers.size();
		} else {
			return 0;
		}
	}
}
