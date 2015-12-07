
import java.util.*;

@SuppressWarnings("resource")

public abstract class Person extends Observable {

    protected String firstname;
    protected String lastname;
    protected String address;
    protected String telephone;

    protected int id = 0;

    protected String username;
    protected String password;

    private boolean loggedIn;

    protected static EmployeeDB employeedatabase = new EmployeeDB();
    protected static AdminDB admindatabase = new AdminDB();

    protected Scanner scanner = new Scanner(System.in);

    public Person() {

    }

    /**
     * Method for creating username and password. Username is converted to all
     * lowercase, so no mistype will prevent login. Password is entered twice,
     * and if the two match - the password will be set.
     */
    protected void credentials() {

        this.setUsername(HomeManFin.getEmployeeName());

        String pass1 = HomeManFin.getEmployeePassword();
        String pass2 = HomeManFin.getEmployeePasswordConfirmed();

        if (pass1 == pass2) {
            this.setPassword(pass1);
        } else {
            System.out.println("Passwords do not match.");
        }
    }

    /**
     * Allows the employees and admin to login. Asks for username and password -
     * and logs the user in, if they match the password and username given when
     * employee was created.
     */
    public void login(String username) throws IllegalArgumentException {
        Employee employee = findEmployee(username);

        if (employee != null) {
            String usernameInput;
            String passwordInput;

            usernameInput = LogEmpFin.usernameField.getText();
            passwordInput = LogEmpFin.passwordField.getText();

            if (usernameInput.equals(employee.getUsername()) && passwordInput.equals(employee.getPassword())) {
                System.out.println("Succesfully logged in.");
                loggedIn = true;
                this.inform();
            } else {
                System.out.println("Username or password incorrect");
                loggedIn = false;
                this.inform();
            }
        } else {
            throw new IllegalArgumentException("Employee ID does not exist");
        }

    }

    public void adminLogin() throws IllegalArgumentException {
        Administrator administrator = lookAtAdmin(0);

        if (administrator != null) {

            String usernameInput = LogManFin.getUsername();
            String passwordInput = LogManFin.getPassword();

            if (usernameInput.equals(administrator.getUsername()) && passwordInput.equals(administrator.getPassword())) {
                System.out.println("Succesfully logged in.");
                loggedIn = true;
                this.inform();
            } else {
                System.out.println("Username or password incorrect");
                loggedIn = false;
                this.inform();
            }
        } else {
            throw new IllegalArgumentException("Admin does not exist");
        }
    }

    public static Employee findEmployee(String username) {
        return employeedatabase.searchFor(username);
    }

    public static Administrator findAdmin(String username) {
        return admindatabase.searchFor(username);
    }

    public static Administrator lookAtAdmin(int index) {
        return admindatabase.lookAt(index);
    }

    /**
     * Logs out user by setting boolean loggedIn to false.
     */
    public void logout() {
        loggedIn = false;
    }

    protected void inform() {
        // Mark this Observable object as having been changed 
        this.setChanged();
        /* notify all of its observers and then call the clearChanged
		 * method to indicate that this object has no longer changed */
        this.notifyObservers();
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

    public void setPassword(String password) {
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

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }
}
