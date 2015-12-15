import java.io.File;

public class CakeShop {

    public static void main(String[] args) throws Exception {

        Administrator admin = new Administrator();
        EmployeeDB db = new EmployeeDB();
        
        
        admin.addEmployeeOnStartup();

        for (int i = 0; i < db.getNumOfEmployees(); i++) {
        	Employee employee = db.lookAt(i);
        	System.out.println(employee.getFirstname() + " " + employee.getRevenue());
        }
        
    }

}
