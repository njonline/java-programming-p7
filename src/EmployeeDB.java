import java.util.ArrayList;

public class EmployeeDB {
	
	/*
	 * Data structure for  the employee database
	 */
	private static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public EmployeeDB() {

	}
	
	public Employee lookAt(int index) {
		return employees.get(index);
	}
	
	public Employee searchFor(int id) {
		for(int i = 0; i > getNumOfEmployees(); i++) {
			Employee employee = lookAt(i);
			int employeeId = employee.getId();
			
			if(employee.equals(employeeId)) {
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
