
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This class acts as database for employees.
 * @author Group 5
 *
 */
public class EmployeeDB {

    /*
	 * Data structure for the employee database
     */
    private static ArrayList<Employee> employees;
    
    private BufferedWriter writer; //new writer
    private File file = new File("employees.txt"); //new file

    /**
     * Constructor.
     * Create new data structure.
     */
    public EmployeeDB() {
        employees = new ArrayList<Employee>();
    }
    
    /**
     * Saves employee to text file.
     * Clears the file, then rewrites with new and updates information.
     */
    protected void saveEmployees() {
    	this.clearFile(); //clear text file
    	Employee employee;
    	
    	for (int i = 0; i < getNumOfEmployees(); i++) { //loop through data structure
    		employee = lookAt(i); //get employee at index i
    		try {
    			writer = new BufferedWriter(new FileWriter(file, true)); //new writer
    			writer.write(employee.getFirstname() + ",");
                writer.write(employee.getLastname() + ",");
                writer.write(employee.getAddress() + ",");
                writer.write(employee.getTelephone() + ",");
                writer.write(employee.getId() + ",");
                writer.write(employee.getRevenueToString() + ",");
                writer.write(employee.getNumOfSalesToString() + ",");
                writer.write(employee.getPassword() + ",");
                writer.write(employee.getUsername() + "");
                writer.write("\n");
        	} catch(IOException e) {
        		e.printStackTrace();
        	} finally {
        		try {
					writer.close(); //close writer
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
    	}
    }
    
    /**
     * Method for clearing text file.
     */
    private void clearFile() {
    	try {
			FileWriter fw = new FileWriter("employees.txt", false);
			PrintWriter pw = new PrintWriter(fw, false);
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     * Returns employee at specified index of data structure.
     * @param index
     * @return
     */
    public Employee lookAt(int index) {
        return employees.get(index);
    }

    /**
     * Find employee by username.
     * @param username
     * @return
     */
    public Employee searchFor(String username) {
        for (int i = 0; i < getNumOfEmployees(); i++) {
            Employee employee = lookAt(i); //current employeee
            String employeeUsername = employee.getUsername(); //current employee username

            /**
             * Check if the passed username is equal to current employee. 
             * If yes, return the employee.
             */
            if (employeeUsername.equals(username)) {
                return employee;
            }
        }
        return null; //return null if none is found.
    }

    /**
     * Add employee to data structure.
     * @param employee
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Remove employee from data structure.
     * @param employee
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Get number of elements in data structure.
     * @return
     */
    public int getNumOfEmployees() {
        if (employees.size() > 0) {
            return employees.size();
        } else {
            return 0;
        }
    }
}
