
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EmployeeDB {

    /*
	 * Data structure for  the employee database
     */
    private static ArrayList<Employee> employees;
    
    private BufferedWriter writer;
    private File file = new File("employees.txt");

    public EmployeeDB() {
        employees = new ArrayList<Employee>();
    }
    
    protected void saveEmployees() {
    	this.clearFile();
    	Employee employee;
    	
    	for (int i = 0; i < getNumOfEmployees(); i++) {
    		employee = lookAt(i);
    		try {
    			writer = new BufferedWriter(new FileWriter(file, true));
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
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
    	}
    }
    
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

    public Employee lookAt(int index) {
        return employees.get(index);
    }

    public Employee searchFor(String username) {
        for (int i = 0; i < getNumOfEmployees(); i++) {
            Employee employee = lookAt(i); //current employeee
            String employeeUsername = employee.getUsername(); //current employee username

            /**
             * Check if the passed username is equal to current employee. If
             * yes, return the employee.
             */
            if (employeeUsername.equals(username)) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getNumOfEmployees() {
        if (employees.size() > 0) {
            return employees.size();
        } else {
            return 0;
        }
    }
}
