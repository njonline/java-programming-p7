
public class Employee extends Person {
	
	private double revenue;
	private int numOfSales;

	public Employee() {
		super();
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
	
	@Override
	 public String toString() {
		 return ("Employee name: " + this.getFirstname() + " " + this.getLastname() + ". Employee ID: " + this.getId() + ". Employee revenue: " + this.getRevenue()) + ". Employee username: " + this.getUsername() + ". Employee password: " + this.getPassword();
	}
}
