/**
 * This abstract class hold information concerning employees, admins and possibly customers in the future.
 * This class is mostly creating getters and setters for attributes.
 * And creating the necessary data structures.
 * @author Group 5
 *
 */

public abstract class Person {

    protected String firstname;
    protected String lastname;
    protected String address;
    protected String telephone;

    protected int id = 0;

    protected String username;
    protected String password;

    protected static EmployeeDB employeedatabase = new EmployeeDB(); //new data structure for employees
    protected static AdminDB admindatabase = new AdminDB(); //new data structure for admins

    public Person() {

    }

    /**
     * Method for creating username and password. Username is set to the name of the employee.
     * Password is entered twice, and if the two match - the password will be set.
     */
    protected void credentials() {

        this.setUsername(HomeManFin.getEmployeeName()); //get name of employee

        String pass1 = HomeManFin.getEmployeePassword();
        String pass2 = HomeManFin.getEmployeePasswordConfirmed();

        if (pass1.equals(pass2)) {
            this.setPassword(pass1); //set password if the two match
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
