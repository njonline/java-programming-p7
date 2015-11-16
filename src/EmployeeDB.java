import java.util.ArrayList;

public class EmployeeDB {
	
	/*
	 * Data structure for  the employee database
	 */
	private static ArrayList<Employee> employees;
	
	public EmployeeDB() {
		new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public int getEmployees() {
		return employees.size();
	}
}
