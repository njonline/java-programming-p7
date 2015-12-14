
import java.util.*;

public abstract class Person extends Observable {

    protected String firstname;
    protected String lastname;
    protected String address;
    protected String telephone;

    protected int id = 0;

    protected String username;
    protected String password;

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

        if (pass1.equals(pass2)) {
            this.setPassword(pass1);
        } else {
            System.out.println("Passwords do not match.");
        }
    }

    public static Administrator findAdmin(String username) {
        return admindatabase.searchFor(username);
    }

    public static Administrator lookAtAdmin(int index) {
        return admindatabase.lookAt(index);
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
}
