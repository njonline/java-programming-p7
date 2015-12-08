
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CupcakeDB {
	
	protected ArrayList<String> cupcake = new ArrayList<String>();
	private File file = new File("cupcakes.txt");
	private Vector data;
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
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    		while((text = br.readLine()) != null) {
    			String[] name = text.split(",");
    			cupcake.add(name.toString());
    		}
    		br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	System.out.println(cupcake);
    }
    
    protected void addCakesToOrderTable() {
    	HomeEmpFin homeEmployee = new HomeEmpFin();
    	String text = null;
    	DefaultTableModel dtm = (DefaultTableModel) homeEmployee.orderTable.getModel();
    	JTable table = homeEmployee.orderTable;
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    		while((text = br.readLine()) != null) {
    			data = new Vector();
    			StringTokenizer str = new StringTokenizer(text, ",");
    			while(str.hasMoreTokens()) {
    				String nextToken = str.nextToken();
    				data.add(nextToken);
    				System.out.println(nextToken);
    			}
    			dtm.addRow(data);
    		} br.close();
    	} catch (IOException e) {
			e.printStackTrace();
		}
    	table.setModel(dtm);
    }
}
