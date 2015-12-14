import java.util.ArrayList;

public class Employee extends Person {

    private double revenue;
    private int numOfSales;
    private static ArrayList<Employee> loggedIn = new ArrayList<Employee>();

    public Employee() {
        super();
    }
    
    public static Employee findEmployee(String username) {
        return employeedatabase.searchFor(username);
    }
    
    /**
     * Allows the employees and admin to login. Asks for username and password -
     * and logs the user in, if they match the password and username given when
     * employee was created.
     */
    public void employeeLogin() throws IllegalArgumentException {
        Employee employee = Employee.findEmployee(LogEmpFin.usernameField.getText());

        if (employee != null) {
            String usernameInput = employee.getUsername();
            String passwordInput = employee.getPassword();

            usernameInput = LogEmpFin.usernameField.getText();
            passwordInput = LogEmpFin.passwordField.getText();

            if (usernameInput.equals(employee.getUsername()) && passwordInput.equals(employee.getPassword())) {
                System.out.println("Succesfully logged in.");
                loggedIn.add(employee);
                this.inform();
            } else {
                System.out.println("Username or password incorrect");
                this.inform();
                loggedIn.remove(employee);
            }
        } else {
            throw new IllegalArgumentException("Employee username does not exist");
        }

    }
    
    public static Employee lookAtLoggedIn(int index) {
    	return loggedIn.get(index);
    }
    
    public static int getNumOfLoggedIn() {
    	return loggedIn.size();
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
        return ("Employee name: " + this.getFirstname() + " " + this.getLastname() + ". Employee ID: " + this.getId() + ". Employee revenue: " + this.getRevenue() + ". Employee no. sales: " + this.getNumOfSales() + ". Employee username: " + this.getUsername() + ". Employee password: " + this.getPassword());
    }
}
