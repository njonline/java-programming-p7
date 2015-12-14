
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CupcakeDB extends Observable {
	
	protected ArrayList<String> cupcake = new ArrayList<String>();
	private Order order = new Order();
	private File file = new File("cupcakes.txt");

    private static ArrayList<Cupcake> cupcakes;

    public CupcakeDB() {
        cupcakes = new ArrayList<Cupcake>();
    }

    public void addCupcake(Cupcake cupcake) {
        cupcakes.add(cupcake);
    }

    public void removeCupcake(Cupcake cupcake) {
        cupcakes.remove(cupcake);
    }

    public int getNumOfCupcakes() {
        return cupcakes.size();
    }
    
    protected void addCakesToInventory(JTable table) {
    	Cupcake cupcake;
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	
    	for(int i = 0; i < getNumOfCupcakes(); i++) {
    		cupcake = lookAt(i);
    		data = new Vector<String>();
<<<<<<< HEAD
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), cupcake.getProductQuantityToString(), cupcake.getProductPriceToString()));
=======
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), cupcake.getProductQuantityToString(), cupcake.getPriceToString()));
>>>>>>> d1744071f7c118e59ce28f43dfc0a2e7b3cd760c
    		model.addRow(data);
    	}    	
    	table.setModel(model);
    }
    
    protected void addCakesToComboBox() {
    	String text = null;
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    		while((text = br.readLine()) != null) {
    			String[] name = text.split(",");
    			cupcake.add(name[1]);
    		}
    		br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    protected void addToOrder(JComboBox<String> box, JTable table, JSpinner spinner) {
     	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	String current = box.getSelectedItem().toString();
    	
    	Date date = Calendar.getInstance().getTime();
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	String reportDate = df.format(date);
    	
    	if(current.equals("Blueberry")) {
    		Cupcake cupcake = searchFor("Blueberry");
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getProductPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	}else if(current.equals("Chocolate")) {
    		Cupcake cupcake = searchFor("Chocolate");
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getProductPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	} else if(current.equals("Caramel")) {
    		Cupcake cupcake = searchFor("Caramel");
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getProductPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	}
    	table.setModel(model);
    }
    
    protected void removeFromOrder(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	String current = table.getValueAt(table.getSelectedRow(), 1).toString();
    	int currentValue = Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 2));
    	
    	if(current.equals("Blueberry")) {
    		Cupcake cupcake = searchFor("Blueberry");
    		order.removeItems(cupcake, currentValue);
    		model.removeRow(table.getSelectedRow());
    	} else if(current.equals("Chocolate")) {
    		Cupcake cupcake = searchFor("Chocolate");
    		order.removeItems(cupcake, currentValue);
    		model.removeRow(table.getSelectedRow());
    	} else if(current.equals("Caramel")) {
    		Cupcake cupcake = searchFor("Caramel");
    		order.removeItems(cupcake, currentValue);
    		model.removeRow(table.getSelectedRow());
    	}
    	table.setModel(model);
    }
    
    public Cupcake lookAt(int index) {
        return cupcakes.get(index);
    }

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
    
    protected void inform() {
        // Mark this Observable object as having been changed 
        this.setChanged();
        /* notify all of its observers and then call the clearChanged
		 * method to indicate that this object has no longer changed */
        this.notifyObservers();
    }
}
