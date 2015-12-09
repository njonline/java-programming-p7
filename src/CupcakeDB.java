
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CupcakeDB {
	
	protected ArrayList<String> cupcake = new ArrayList<String>();
	private HomeEmpFin homeEmp;
	private File file = new File("cupcakes.txt");

    private static ArrayList<Product> cupcakes;

    public CupcakeDB() {
        cupcakes = new ArrayList<Product>();
    }

    public void addCupcake(Product product) {
        cupcakes.add(product);
    }

    public void removeCupcake(Product product) {
        cupcakes.remove(product);
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
    	System.out.println(cupcake);
    }
    
    protected void addToOrder(JComboBox box, JTable table) {
    	
    	/**
    	 * Get selected item
    	 * Find info on item in text file
		 * Add info to text file
		 * Deduct from total in stock
		 * Rewrite to text file
    	 */
    	
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	String text;
    	String current = box.getSelectedItem().toString();
    	
    	Date date = Calendar.getInstance().getTime();
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	String reportDate = df.format(date);
    	
    	if(current.equals("Blueberry")) {
    		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    			text = br.readLine();
    			data = new Vector();
    			String[] ca = text.split(",");
    			data.addAll(Arrays.asList(ca[0], ca[1], "1", ca[4], reportDate));
    			model.addRow(data);
    			br.close();
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	} else if(current.equals("Chocolate")) {
    		int counter = 0;
    		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    			
    			while((text = br.readLine()) != null) {
    				counter++;
    				if(counter == 1) {
        				text = br.readLine();
            			data = new Vector();
            			String[] ca = text.split(",");
            			data.addAll(Arrays.asList(ca[0], ca[1], "1", ca[4], reportDate));
            			model.addRow(data);
        			}
    			}
    			br.close();
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	} else if(current.equals("Caramel")) {
    		int counter = 0;
    		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    			
    			while((text = br.readLine()) != null) {
    				counter++;
    				if(counter == 2) {
        				text = br.readLine();
            			data = new Vector();
            			String[] ca = text.split(",");
            			data.addAll(Arrays.asList(ca[0], ca[1], "1", ca[4], reportDate));
            			model.addRow(data);
        			}
    			}
    			br.close();
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	table.setModel(model);
    	}
    }
    
    /*
    protected void addCakesToOrderTable(JTable table) {
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector data;
    	String text = null;
    
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    		while((text = br.readLine()) != null) {
    			data = new Vector();
    			StringTokenizer str = new StringTokenizer(text, ",");
    			while(str.hasMoreTokens()) {
    				String next = str.nextToken();
    				data.add(next);
    				System.out.println(next); 				
    			} model.addRow(data);
    		} br.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	table.setModel(model);
    }
    */
}
