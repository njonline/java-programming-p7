/**
 * This class contains information about the employee.
 * Extends the abstract class Person.
 * @author Group 5
 *
 */

public class Employee extends Person {

    private double revenue; //revenue of employee
    private int numOfSales; //total number of sales for employee

    public Employee() {
        super();
    }
    
    /**
     * Find and return employee by username.
     * @param username
     * @return
     */
    public static Employee findEmployee(String username) {
        return employeedatabase.searchFor(username);
    }
    
    /**
     * Allows the employees login. Asks for username and password -
     * and logs the user in, if they match the password and username given when
     * employee was created.
     */
    public static Employee employeeLogin() throws IllegalArgumentException {
        Employee employee = Employee.findEmployee(LogEmpFin.usernameField.getText()); //get employee by username entered

        if (employee != null) {
            String usernameInput = employee.getUsername(); //set entered username
            String passwordInput = employee.getPassword(); //set entered password

            usernameInput = LogEmpFin.usernameField.getText();
            passwordInput = LogEmpFin.passwordField.getText();

            if (usernameInput.equals(employee.getUsername()) && passwordInput.equals(employee.getPassword())) { //compare
            	return employee; //return if username and password match
            } else {
                System.out.println("Username or password incorrect");
            }
        } else {
            throw new IllegalArgumentException("Employee username does not exist");
        }
        return null; //return null if no employee is found
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
}
