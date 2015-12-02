
public class CakeShop {
	
	public static void main(String[] args) throws Exception {	

		Employee employee = new Employee();
		Administrator admin = new Administrator();
		Cupcake cupcake = new Cupcake();
		Order order = new Order();
		
		admin.createEmployee();
		System.out.println(Person.lookAt(0));
	}

}
