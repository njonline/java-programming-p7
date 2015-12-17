
import java.util.ArrayList;

/**
 * This class is responsible for holding the administrator.
 * 
 * @author Group 5
 *
 */

public class AdminDB {

    /**
     * Data structure for the database
     */
	private static ArrayList<Administrator> admins;
    
    /**
     * Constructor
     * Created new database.
     */
    public AdminDB() {
        admins = new ArrayList<Administrator>();
    }
    
    /**
     * Returns the administrator in the data structure, that is currently at the specified index.
     * @param index
     * @return
     */
    public Administrator lookAt(int index) {
        return admins.get(index);
    }
    
    /**
     * Look through the datastructure.
     * Return the administrator corresponding to the specified username.
     * Returns null if no object is found.
     * @param username
     * @return
     */
    public Administrator searchFor(String username) {
        for (int i = 0; i > getNumOfAdmins(); i++) {
            Administrator admin = lookAt(i); //current administrator
            String adminUsername = admin.getUsername(); //current administrator username

            /**
             * Check if the passed username is equal to current employee. If
             * yes, return the employee.
             */
            if (adminUsername.equals(username)) {
                return admin;
            }
        }
        return null; //return null if no match is found.
    }
    
    /**
     * Adds administrator to data structure.
     * @param admin
     */
    public void addAdmin(Administrator admin) {
        admins.add(admin);
    }
    
    /**
     * Removes administrator from data structure.
     * @param admin
     */
    public void removeAdmin(Administrator admin) {
        admins.remove(admin);
    }
    
    /**
     * Returns the number of elements in the data structure.
     * @return
     */
    public int getNumOfAdmins() {
        if (admins.size() > 0) {
            return admins.size();
        } else {
            return 0;
        }
    }

}
