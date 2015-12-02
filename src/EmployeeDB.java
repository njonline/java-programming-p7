import java.util.ArrayList;

public class EmployeeDB {
	
	/*
	 * Data structure for  the employee database
	 */
	private static ArrayList<Employee> employees;
	
	public EmployeeDB() {
		employees = new ArrayList<Employee>();
	}
	
	public Employee lookAt(int index) {
		return employees.get(index);
	}
	
	public Employee searchFor(String username) {
		for(int i = 0; i > getNumOfEmployees(); i++) {
			Employee employee = lookAt(i); //current employeee
			String employeeUsername = employee.getUsername(); //current employee username
			
			/**
			 * Check if the passed username is equal to current employee.
			 * If yes, return the employee.
			 */
			if(employeeUsername.equals(username)) {
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
		if(employees.size() > 0) {
			return employees.size();
		} else {
			return 0;
		}
	}
}
