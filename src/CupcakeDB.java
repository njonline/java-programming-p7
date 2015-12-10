
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
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CupcakeDB {
	
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
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	}else if(current.equals("Chocolate")) {
    		Cupcake cupcake = searchFor("Chocolate");
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	} else if(current.equals("Caramel")) {
    		Cupcake cupcake = searchFor("Caramel");
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getPriceToString(), reportDate));
    		model.addRow(data);
    		order.addItems(cupcake, spinner);
    	}
    	table.setModel(model);
    }
    
    protected void removeFromOrder(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	model.removeRow(table.getSelectedRow());
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
}
