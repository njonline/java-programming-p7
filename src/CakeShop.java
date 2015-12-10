import java.io.File;

public class CakeShop {

    public static void main(String[] args) throws Exception {
    	
    	//CupcakeDB db = new CupcakeDB();
        //Cupcake cupcake = new Cupcake();
        File file = new File("cupcakes.txt");
        Administrator admin = new Administrator();
        
        
        admin.addEmployeeOnStartup();
        Employee employee = Employee.findEmployee("Nicklas");
        employee.employeeLogin();
    }

}
