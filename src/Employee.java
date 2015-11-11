
public class Employee extends Person {
	
	private int revenue;
	private int numOfSales;

	public Employee(int id, String name, CakeShop cakeshop) {
		super(id, name);
		revenue = 0; // revenue is 0, when employee is created
		numOfSales = 0;
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
