import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public static Employee employeeLogin() throws IllegalArgumentException {
        Employee employee = Employee.findEmployee(LogEmpFin.usernameField.getText());

        if (employee != null) {
            String usernameInput = employee.getUsername();
            String passwordInput = employee.getPassword();

            usernameInput = LogEmpFin.usernameField.getText();
            passwordInput = LogEmpFin.passwordField.getText();

            if (usernameInput.equals(employee.getUsername()) && passwordInput.equals(employee.getPassword())) {
            	return employee;
            } else {
                System.out.println("Username or password incorrect");
            }
        } else {
            throw new IllegalArgumentException("Employee username does not exist");
        }
        return null;
    }
    
    /*
    public void employeeLogout() {
    	Employee employee = lookAtLoggedIn(0);
    	
    	if(employee != null) {
    		loggedIn.remove(employee);
    	}
    }
    */
    
    /*
    public static Employee lookAtLoggedIn(int index) {
    	return loggedIn.get(index);
    }
    */
    
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
    
    public String getRevenueToString() {
    	return Double.toString(revenue);
    }

    public int getNumOfSales() {
        return numOfSales;
    }
    
    public String getNumOfSalesToString() {
    	return Integer.toString(numOfSales);
    }

    @Override
    public String toString() {
        return ("Employee name: " + this.getFirstname() + " " + this.getLastname() + ". Employee ID: " + this.getId() + ". Employee revenue: " + this.getRevenue() + ". Employee no. sales: " + this.getNumOfSales() + ". Employee username: " + this.getUsername() + ". Employee password: " + this.getPassword());
    }
}
