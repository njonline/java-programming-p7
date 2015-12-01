import java.util.Scanner;

@SuppressWarnings("resource")

public abstract class Person {

	protected String firstname;
	protected String lastname;
	protected String address;
	protected int telephone;
	
	protected int id = 0;
	
	protected String username;
	protected int password;
	
	private boolean loggedIn;
	
	protected static EmployeeDB employeedatabase = new EmployeeDB();
	protected static AdminDB admindatabase = new AdminDB();
	
	protected Scanner scanner = new Scanner(System.in);
	
	public Person() {

	}
	
	/**
	 * Method for creating username and password.
	 * Username is converted to all lowercase, so no mistype will prevent login.
	 * Password is entered twice, and if the two match - the password will be set.
	 */
	protected void credentials() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter new username: ");
		this.setUsername(scan.nextLine().toLowerCase());
		
		System.out.println("Enter new password: ");
		int pass1 = scan.nextInt();
		System.out.println("Repeat password: ");
		int pass2 = scan.nextInt();
		
		if(pass1 == pass2) {
			this.setPassword(pass1);
		} else {
			System.out.println("Passwords do not match.");
		}
	}
	
	/**
	 * Allows the employees and admin to login.
	 * Asks for username and password - and logs the user in, if they match the password and username
	 * given when employee was created.
	 */
	public void login(int index) {
		Employee employee = employeedatabase.lookAt(index);
		
		if(employee != null) {
			Scanner input = new Scanner(System.in);
			String usernameInput;
			int passwordInput;
			
			System.out.println("Enter username: ");
			usernameInput = input.nextLine();
			System.out.println("Enter password: ");
			passwordInput = input.nextInt();

			if(usernameInput.equals(employee.getUsername()) && passwordInput == employee.getPassword()) {
				System.out.println("Succesfully logged in.");
				loggedIn = true;
			} else {
				System.out.println("Username or password incorrect");
				loggedIn = false;
			}
		} else {
			throw new IllegalArgumentException("Employee ID does not exist");
		}
		
	}
	
	public static Employee findEmployee(int id) {
		return employeedatabase.searchFor(id);
	}
	
	public static Employee lookAt(int index) {
		return employeedatabase.lookAt(index);
	}
	
	/**
	 * Logs out user by setting boolean loggedIn to false.
	 */
	public void logout() {
		loggedIn = false;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getTelephone() {
		return telephone;
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
