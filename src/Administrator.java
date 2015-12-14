
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Administrator extends Person {
	
    private Employee employee;

    private File file = new File("employees.txt");
    private BufferedWriter writer;

    public Administrator() {
        super();

        this.setUsername("admin");
        this.setPassword("admin");
        admindatabase.addAdmin(this);

        //System.out.println("Succesfully created Administrator.");
        //System.out.println("Username: " + this.getUsername() + ". Password: " + this.getPassword());
        this.inform();
    }

    /**
     * Create an employee. Ask for employee name and set new ID. Set revenue and
     * number of sales to 0. Run method for creating username and password. Add
     * to employee db.
     *
     * @return
     */
    public Employee createEmployee() {
        employee = new Employee();
        employee.setFirstname(firstnameInputEmployee());
        employee.setLastname(surnameInputEmployee());
        employee.setAddress(addressInputEmployee());
        employee.setTelephone(telephoneInputEmployee());
        employee.setId(newEmployeeId());
        employee.setRevenue(0);
        employee.setNumOfSales(0);

        employee.credentials();
        employeedatabase.addEmployee(employee);

        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(employee.getFirstname() + ",");
            writer.write(employee.getLastname() + ",");
            writer.write(employee.getAddress() + ",");
            writer.write(employee.getTelephone() + ",");
            writer.write(employee.getId() + ",");
            writer.write(employee.getRevenue() + ",");
            writer.write(employee.getNumOfSales() + ",");
            writer.write(employee.getPassword() + ",");
            writer.write(employee.getUsername() + "");
            writer.write("\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Employee succesfully created.");

        this.inform();
        return employee;
    }
    
    public void addEmployeeOnStartup() {
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        	String text;
        	while((text = br.readLine()) != null) {
        		Employee employee = new Employee();
        		String[] ea = text.split(",");
        		employee.setFirstname(ea[0]);
        		employee.setLastname(ea[1]);
        		employee.setAddress(ea[2]);
        		employee.setTelephone(ea[3]);
        		employee.setId(Integer.parseInt(ea[4]));
        		employee.setRevenue(Double.parseDouble(ea[5]));
        		employee.setNumOfSales(Integer.parseInt(ea[6]));
        		employee.setPassword(ea[7]);
        		employee.setUsername(ea[8]);
        		employeedatabase.addEmployee(employee);
        	} br.close();
        } catch(IOException e) {
        	e.printStackTrace();
        }
    }
    
    public void adminLogin() throws IllegalArgumentException {
        Administrator administrator = lookAtAdmin(0);

        if (administrator != null) {

            String usernameInput = LogManFin.getUsername();
            String passwordInput = LogManFin.getPassword();

            if (usernameInput.equals(administrator.getUsername()) && passwordInput.equals(administrator.getPassword())) {
                System.out.println("Succesfully logged in.");
                this.inform();
            } else {
                System.out.println("Username or password incorrect");
                this.inform();
            }
        } else {
            throw new IllegalArgumentException("Admin does not exist");
        }
    }

    /**
     * Sets the entered name to the name of the employee.
     *
     * @param name
     */
    private String firstnameInputEmployee() {
        firstname = HomeManFin.getEmployeeName();
        return firstname;
    }

    private String surnameInputEmployee() {
        lastname = HomeManFin.getEmployeeSurname();
        return lastname;
    }

    private String addressInputEmployee() {
        address = HomeManFin.getEmployeeAddress();
        return address;
    }

    private String telephoneInputEmployee() {
        telephone = HomeManFin.getEmployeePhone();
        return telephone;
    }

    protected int newEmployeeId() {
        this.id = employeedatabase.getNumOfEmployees() + 1;
        return id;
    }

}
