import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Person {

	protected String name;
	protected int id = 0;
	protected String username;
	protected int password;
	
	private String usernameEntered;
	private int passwordEntered;
	
	private boolean loggedIn;
	
	protected EmployeeDB employeedatabase = new EmployeeDB();
	protected CustomerDB customerdatabase = new CustomerDB();
	
	protected Scanner scanner = new Scanner(System.in);
	
	public Person() {

	}
	
	public void createEmployee(String name, int id, String username, int password) {
		this.name = name;
		this.id = getId();
		this.username = username;
		this.password = password;
	}
	
	protected void nameInputEmployee(String name) {
		System.out.println("Employee name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	protected void usernameInputEmployee(String username) {
		System.out.println("Employee username: ");
		username = scanner.nextLine();
		this.setUsername(username);
	}
	
	protected void passwordInputEmployee(int password) {
		System.out.println("Employee password: ");
		password = scanner.nextInt();
		this.setPassword(password);
	}
	
	protected void nameInputCustomer(String name) {
		System.out.println("Customer name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	private void username() {
		System.out.println("Employee username: ");
		usernameEntered = scanner.nextLine();
		this.setUsernameEntered(usernameEntered);
	}
	
	private void password() {
		System.out.println("Employee password: ");
		passwordEntered = scanner.nextInt();
		this.setPasswordEntered(passwordEntered);
	}
	
	public void login() throws InputMismatchException {
		this.username();
		this.password();
		
		if(getUsernameEntered().equals(getUsername()) && getPasswordEntered() == getPassword()) {
			loggedIn = true;
			System.out.println("User correctly logged in");
		} else {
			throw new InputMismatchException("The username or password in incorrect");
		}
	}
	
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
	
	public void setUsernameEntered(String usernameEntered) {
		this.usernameEntered = usernameEntered;
	}
	
	public void setPasswordEntered(int passwordEntered) {
		this.passwordEntered = passwordEntered;
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
	
	public String getUsernameEntered() {
		return usernameEntered;
	}
	
	public int getPasswordEntered() {
		return passwordEntered;
	}
}
