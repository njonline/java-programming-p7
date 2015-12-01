import java.util.ArrayList;

public class AdminDB {

	private static ArrayList<Administrator> admins;
	
	public AdminDB() {
		admins = new ArrayList<Administrator>();
	}
	
	public void addAdmin(Administrator admin) {
		admins.add(admin);
	}
	
	public void removeAdmin(Administrator admin) {
		admins.remove(admin);
	}
	
}
