import java.util.Scanner;

public abstract class Person {

	private String name;
	private int id;
	
	Scanner scanner = new Scanner(System.in);
	
	public Person() {

	}
	
	public void createEmployee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	protected void nameInput(String name) {
		System.out.println("Employee name: ");
		name = scanner.nextLine();
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
