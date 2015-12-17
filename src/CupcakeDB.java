
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * This class represents the database for all cupcakes in the system.
 * This class is also responsible for adding cakes to the GUI.
 * @author Group 5
 *
 */

public class CupcakeDB {
	
	protected ArrayList<String> cupcake = new ArrayList<String>(); //data structure for the db
	private Request request = new Request();
	
	private BufferedWriter writer; //new bufferedwriter
	private File file = new File("cupcakes.txt"); //specify text file

    private static ArrayList<Cupcake> cupcakes;
    
    /**
     * Constructor.
     * Create new arraylist.
     */
    public CupcakeDB() {
        cupcakes = new ArrayList<Cupcake>();
    }
    
    /**
     * Add cupcake to data structure.
     * @param cupcake
     */
    public void addCupcake(Cupcake cupcake) {
        cupcakes.add(cupcake);
    }

    /**
     * Remove cupcake from data structure.
     * @param cupcake
     */
    public void removeCupcake(Cupcake cupcake) {
        cupcakes.remove(cupcake);
    }

    /**
     * Return the number of elements in data structure.
     * @return
     */
    public int getNumOfCupcakes() {
        return cupcakes.size();
    }
    
    /**
     * Method for adding cakes to the inventory table in the GUI.
     * @param table
     */
    protected void addCakesToInventory(JTable table) {
    	Cupcake cupcake;
    	DefaultTableModel model = (DefaultTableModel) table.getModel(); //get table model
    	Vector<String> data; 
    	
    	for(int i = 0; i < getNumOfCupcakes(); i++) { //loop through all elements in data structure
    		cupcake = lookAt(i); //look at the specific object at index i
    		data = new Vector<String>(); //create new vector of type string
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), cupcake.getProductQuantityToString(), cupcake.getProductPriceToString())); //add product att. to vector
    		model.addRow(data); //add vector to table row
    	}    	
    	table.setModel(model); //set the new table model
    }
    
    /**
     * Method for adding cakes to dropdown list in the GUI.
     */
    protected void addCakesToComboBox() {
    	String text = null;
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) { //new bufferedreader
    		while((text = br.readLine()) != null) {
    			String[] name = text.split(","); //create new string array
    			cupcake.add(name[1]); //populate array with string at index 1
    		}
    		br.close(); //close reader
		} catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Method for adding products to a new request
     * @param box
     * @param table
     * @param spinner
     * @param pane
     */
    protected void addToRequest(JComboBox<String> box, JTable table, JSpinner spinner, JLayeredPane pane) {
     	DefaultTableModel model = (DefaultTableModel) table.getModel(); //get table model
    	Vector<String> data;
    	Cupcake cupcake = Cupcake.findCupcake(box.getSelectedItem().toString()); //find highlighted cupcake in dropdown list
    	
    	Date date = Calendar.getInstance().getTime(); // create new date
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //set date format
    	String reportDate = df.format(date);
    	
    	data = new Vector<String>();
		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getProductPriceToString(), reportDate)); //add product att. to vector
		model.addRow(data); //add vector to table row
		request.addItems(cupcake, spinner, pane, table); //add selected items to request
    	
    	table.setModel(model); //set the new table model
    }
    
    /**
     * Method for removing items from request.
     * @param table
     */
    protected void removeFromRequest(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel(); //get table model
    	Cupcake cupcake = Cupcake.findCupcake(table.getValueAt(table.getSelectedRow(), 1).toString()); //find highlighted cupcake in table
    	int currentValue = Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 2)); //find number of items to remove from table
    	
    	request.removeItems(cupcake, currentValue); //remove the items from request object.
    	model.removeRow(table.getSelectedRow()); //delete row from table
    	
    	table.setModel(model); //set the new table model
    }
    
    /**
     * Method for saving cupcakes to textfile.
     * This methods clears the textfile and populates the file with new and updated information.
     */
    protected void saveCupcakes() {
    	this.clearFile(); //clear file
    	Cupcake cupcake;
    	
    	for (int i = 0; i < getNumOfCupcakes(); i++) { //loop through data structure
    		cupcake = lookAt(i); //find cupcake at index i
    		try {
        		writer = new BufferedWriter(new FileWriter(file, true)); //write to file
        		writer.write(cupcake.getProductIdToString() + ",");
        		writer.write(cupcake.getName() + ",");
        		writer.write(cupcake.getFlavor() + ",");
        		writer.write(cupcake.getProductPriceToString() + ",");
        		writer.write(cupcake.getProductQuantityToString() + "");
        		writer.write("\n");
        	} catch(IOException e) {
        		e.printStackTrace();
        	} finally {
        		try {
					writer.close(); //close writer
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
    	}
    }
    
    /**
     * Method for clearing text file.
     */
    private void clearFile() {
    	try {
			FileWriter fw = new FileWriter("cupcakes.txt", false);
			PrintWriter pw = new PrintWriter(fw, false);
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * Returns cupcake at specified index in the data structure.
     * @param index
     * @return
     */
    public Cupcake lookAt(int index) {
        return cupcakes.get(index);
    }
    
    /**
     * Find and return cupcake by specifying name.
     * @param name
     * @return
     */
    public Cupcake searchFor(String name) {
        for (int i = 0; i < getNumOfCupcakes(); i++) {
            Cupcake cupcake = lookAt(i);
            String cupcakeName = cupcake.getName();

            if (cupcakeName.equals(name)) {
                return cupcake;
            }
        }
        return null;
    }
}
