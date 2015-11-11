import java.util.ArrayList;

@SuppressWarnings("static-access")

public class EmployeeDB {
	
	/*
	 * Data structure for  the employee database
	 */
	private static ArrayList<Employee> employees;
	
	public EmployeeDB() {
		setEmployees(new ArrayList<Employee>());
	}
	
	public void addEmployee(Employee employee) {
		getEmployees().add(employee);
	}
	
	public int numOfEmployees() {
		return getEmployees().size();
	}
	
	public Employee getIndex(int index) {
		return getEmployees().get(index);
	}

	public static ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

}
