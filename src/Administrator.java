
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 * This class holds information about the administrator in the system.
 * This class is resposible for creating employees,
 * and adding them on startup of the system.
 * 
 * @author Group 5
 *
 */

public class Administrator extends Person {
	
    private Employee employee;

    private File file = new File("employees.txt"); //specify file to write to
    private BufferedWriter writer; // new bufferedwriter
    
    /**
     * Contructor.
     * Sets attributes of the administrator and adds to database.
     */
    public Administrator() {
        super();
        
        this.setFirstname("Peter");
        this.setLastname("Petersen");
        this.setAddress("Vesterbro 22");
        this.setTelephone("22334455");
        this.setUsername("admin");
        this.setPassword("admin");
        admindatabase.addAdmin(this);
    }

    /**
     * Create an employee. 
     * Set new ID. Set revenue and number of sales to 0. 
     * Run method for creating username and password. 
     * Add to employee db.
     * Return the employee upon creation.
     * @return
     */
    public Employee createEmployee(JLayeredPane pane) {
        employee = new Employee();
        employee.setFirstname(firstnameInputEmployee());
        employee.setLastname(surnameInputEmployee());
        employee.setAddress(addressInputEmployee());
        employee.setTelephone(telephoneInputEmployee());
        employee.setId(newEmployeeId());
        employee.setRevenue(0);
        employee.setNumOfSales(0);

        employee.credentials();
        employeedatabase.addEmployee(employee);

        try {
            writer = new BufferedWriter(new FileWriter(file, true)); //write employee information to text file
            writer.write(employee.getFirstname() + ",");
            writer.write(employee.getLastname() + ",");
            writer.write(employee.getAddress() + ",");
            writer.write(employee.getTelephone() + ",");
            writer.write(employee.getId() + ",");
            writer.write(employee.getRevenue() + ",");
            writer.write(employee.getNumOfSales() + ",");
            writer.write(employee.getPassword() + ",");
            writer.write(employee.getUsername() + "");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	try {
				writer.close(); //close writer after finishing.
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        JOptionPane.showMessageDialog(pane, "Employee succesfully created.");
        return employee; //return the newly created employee.
    }
    
    /**
     * Method for adding the employees in the textfile to data structure upon
     * starting the system.
     */
    
    public void addEmployeeOnStartup() {
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        	String text;
        	while((text = br.readLine()) != null) {
        		Employee employee = new Employee(); //create new employee
        		String[] ea = text.split(","); //split text file into elements separated by comma
        		employee.setFirstname(ea[0]);
        		employee.setLastname(ea[1]);
        		employee.setAddress(ea[2]);
        		employee.setTelephone(ea[3]);
        		employee.setId(Integer.parseInt(ea[4]));
        		employee.setRevenue(Double.parseDouble(ea[5]));
        		employee.setNumOfSales(Integer.parseInt(ea[6]));
        		employee.setPassword(ea[7]);
        		employee.setUsername(ea[8]);
        		employeedatabase.addEmployee(employee); //add to data structure
        	} br.close();
        } catch(IOException e) {
        	e.printStackTrace();
        }
    }
    
    /**
     * Method for loggin in admin.
     * Checks if username and password of the admin,
     * is the same as the ones entered in the textfields.
     * @throws IllegalArgumentException
     */
    
    public void adminLogin() throws IllegalArgumentException {
        Administrator administrator = lookAtAdmin(0); //there is only one admin in the datastructure, so we look at index 0

        if (administrator != null) { //if the administrator actually exists

            String usernameInput = LogManFin.getUsername(); //get admin username
            String passwordInput = LogManFin.getPassword(); //get admin password

            if (usernameInput.equals(administrator.getUsername()) && passwordInput.equals(administrator.getPassword())) { //check if strings match
                System.out.println("Succesfully logged in."); //logged in
            } else {
                System.out.println("Username or password incorrect"); //not loggged in
            }
        } else {
            throw new IllegalArgumentException("Admin does not exist");
        }
    }

    /**
     * Returns employee first name from field
     * @return
     */
    private String firstnameInputEmployee() {
        firstname = HomeManFin.getEmployeeName();
        return firstname;
    }
     /**
      * Returns employee last name from field
      * @return
      */
    private String surnameInputEmployee() {
        lastname = HomeManFin.getEmployeeSurname();
        return lastname;
    }
    
    /**
     * Returns employee address from field
     * @return
     */
    private String addressInputEmployee() {
        address = HomeManFin.getEmployeeAddress();
        return address;
    }
    
    /**
     * Returns employee phone number from field
     * @return
     */
    private String telephoneInputEmployee() {
        telephone = HomeManFin.getEmployeePhone();
        return telephone;
    }

    /**
     * Returns a new ID for employee
     * @return
     */
    protected int newEmployeeId() {
        this.id = employeedatabase.getNumOfEmployees() + 1;
        return id;
    }
    
    /**
     * Find employee by username
     * @param username
     * @return
     */
    public Employee search(String username) {
    	return employeedatabase.searchFor(username);
    }

}
