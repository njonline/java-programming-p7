
import java.util.ArrayList;

public class AdminDB {

    private static ArrayList<Administrator> admins;

    public AdminDB() {
        admins = new ArrayList<Administrator>();
    }

    public Administrator lookAt(int index) {
        return admins.get(index);
    }

    public Administrator searchFor(String username) {
        for (int i = 0; i > getNumOfAdmins(); i++) {
            Administrator admin = lookAt(i); //current employeee
            String adminUsername = admin.getUsername(); //current employee username

            /**
             * Check if the passed username is equal to current employee. If
             * yes, return the employee.
             */
            if (adminUsername.equals(username)) {
                return admin;
            }
        }
        return null;
    }

    public void addAdmin(Administrator admin) {
        admins.add(admin);
    }

    public void removeAdmin(Administrator admin) {
        admins.remove(admin);
    }

    public int getNumOfAdmins() {
        if (admins.size() > 0) {
            return admins.size();
        } else {
            return 0;
        }
    }

}
