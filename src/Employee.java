
public class Employee extends Person {
	
	private int revenue;
	private int numOfSales;

	public Employee() {
		super();
	}
	
	public void createEmployee() {
		this.nameInput(getName());
	}
	
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	public void setNumOfSales(int numOfSales) {
		this.numOfSales = numOfSales;
	}
	
	public int getRevenue() {
		return revenue;
	}
	
	public int getNumOfSales() {
		return numOfSales;
	}

}
