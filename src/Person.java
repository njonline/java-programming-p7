import java.util.Scanner;

@SuppressWarnings("resource")

public abstract class Person {

	protected String name;
	protected int id = 0;
	
	protected String username;
	protected int password;
	
	private boolean loggedIn;
	
	protected EmployeeDB employeedatabase = new EmployeeDB();
	protected CustomerDB customerdatabase = new CustomerDB();
	
	protected Scanner scanner = new Scanner(System.in);
	
	public Person() {

	}
	
	public void createEmployee(String name, int id) {
		this.name = name;
		this.id = getId();
	}
	
	/**
	 * Sets the entered name to the name of the employee.
	 * @param name
	 */
	protected void nameInputEmployee(String name) {
		System.out.println("Employee name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	/**
	 * Sets the entered name to the name of the customer.
	 * @param name
	 */
	protected void nameInputCustomer(String name) {
		System.out.println("Customer name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	/**
	 * Method for creating username and password.
	 * Username is converted to all lowercase, so no mistype will prevent login.
	 * Password is entered twice, and if the two match - the password will be set.
	 */
	protected void credentials() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter new username: ");
		setUsername(scan.nextLine().toLowerCase());
		
		System.out.println("Enter new password: ");
		int pass1 = scan.nextInt();
		System.out.println("Repeat password: ");
		int pass2 = scan.nextInt();
		
		if(pass1 == pass2) {
			setPassword(pass1);
		} else {
			System.out.println("Passwords do not match.");
		}
	}
	
	/**
	 * Allows the employees to login.
	 * Asks for username and password - and logs the user in, if they match the password and username
	 * given when employee was created.
	 */
	public void login() {
		Scanner input = new Scanner(System.in);
		String usernameInput;
		int passwordInput;
		
		System.out.println("Enter username: ");
		usernameInput = input.nextLine();
		System.out.println("Enter password: ");
		passwordInput = input.nextInt();

		if(usernameInput.equals(getUsername()) && passwordInput == getPassword()) {
			System.out.println("Succesfully logged in.");
			loggedIn = true;
		} else {
			System.out.println("Username or password incorrect");
			loggedIn = false;
		}
	}
	
	/**
	 * Logs out user by setting boolean loggedIn to false.
	 */
	public void logout() {
		loggedIn = false;
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
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getPassword() {
		return password;
	}
	
	public boolean getLoggedIn() {
		return loggedIn;
	}
}
