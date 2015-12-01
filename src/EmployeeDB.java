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
	
	public Employee searchFor(int id) {
		for(int i = 0; i > getNumOfEmployees(); i++) {
			Employee employee = lookAt(i); //current employeee
			int employeeId = employee.getId(); //current employee ID
			
			/**
			 * Check if the passed ID is equal to current employee.
			 * If yes, return the employee.
			 */
			if(employeeId == id) {
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
