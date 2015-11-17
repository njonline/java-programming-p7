
public class Customer extends Person {
	
	private int numOfOrders;
	private int cancelledOrders;

	public void createCustomer() {
		this.nameInputCustomer(getName());
		this.id = newCustomerId();
		this.setNumOfOrders(0);
		this.setCancelledOrders(0);
		
		customerdatabase.addCustomer(this);
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
