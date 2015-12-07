
public class CakeShop {

    public static void main(String[] args) throws Exception {

        /*EmployeeDB db = new EmployeeDB();
        Employee emp = new Employee();
        emp.setUsername("ilkcan");
        emp.setPassword("1234");
        db.addEmployee(emp);

        Employee foundEmp = db.searchFor("ilkcan");
        System.out.println(foundEmp.getUsername());
        emp.login("ilkcan");*/
    	
    	AdminDB db = new AdminDB();
    	Administrator admin = new Administrator();
    	Administrator found = Person.lookAtAdmin(0);
    	System.out.println(found.getUsername() + " " + found.getPassword());
    }

}
