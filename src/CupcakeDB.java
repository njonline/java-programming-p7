
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

public class CupcakeDB {
	
	protected ArrayList<String> cupcake = new ArrayList<String>();
	private Request request = new Request();
	
	private BufferedWriter writer;
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
    		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), cupcake.getProductQuantityToString(), cupcake.getProductPriceToString()));
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
    
    protected void addToRequest(JComboBox<String> box, JTable table, JSpinner spinner, JLayeredPane pane) {
     	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	Cupcake cupcake = Cupcake.findCupcake(box.getSelectedItem().toString());
    	
    	Date date = Calendar.getInstance().getTime();
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	String reportDate = df.format(date);
    	
    	data = new Vector<String>();
		data.addAll(Arrays.asList(cupcake.getProductIdToString(), cupcake.getName(), spinner.getValue().toString(), cupcake.getProductPriceToString(), reportDate));
		model.addRow(data);
		request.addItems(cupcake, spinner, pane, table);
    	
    	table.setModel(model);
    }
    
    protected void removeFromRequest(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Cupcake cupcake = Cupcake.findCupcake(table.getValueAt(table.getSelectedRow(), 1).toString());
    	int currentValue = Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 2));
    	
    	request.removeItems(cupcake, currentValue);
    	model.removeRow(table.getSelectedRow());
    	
    	table.setModel(model);
    }
    
    protected void saveCupcakes() {
    	this.clearFile();
    	Cupcake cupcake;
    	
    	for (int i = 0; i < getNumOfCupcakes(); i++) {
    		cupcake = lookAt(i);
    		try {
        		writer = new BufferedWriter(new FileWriter(file, true));
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
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
    	}
    }
    
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
