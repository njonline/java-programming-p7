
import java.io.BufferedWriter;
import java.io.File;
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

        System.out.println("Succesfully created Administrator.");
        System.out.println("Username: " + this.getUsername() + ". Password: " + this.getPassword());
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
            writer.write(employee.getNumOfSales() + "");
            writer.write("\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Employee succesfully created.");

        this.inform();
        return employee;
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
