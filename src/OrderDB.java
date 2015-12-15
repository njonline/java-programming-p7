
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderDB {

    private static ArrayList<Order> orders = new ArrayList<Order>();
    
    BufferedWriter writer;
    File file = new File("requests.txt");
    
    public OrderDB() {

    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public int getNumOfOrders() {
        if (orders.size() > 0) {
            return orders.size();
        } else {
            return 0;
        }
    }
    
    protected void addRequestsOnStartup(JTable table) throws ParseException {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    		String text;
    		while((text = br.readLine()) != null) {
    			Order order = new Order();
    			String[] oa = text.split(",");
    			order.setOrderId(Integer.parseInt(oa[0]));
    			order.setOrderValue(Double.parseDouble(oa[1]));
    			order.setDate((Date) df.parse(oa[2]));
    			this.addOrder(order);
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    protected void addRequestsToTable(JTable table) {
    	Order order;
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	
    	int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
    	
    	for(int i = 0; i < getNumOfOrders(); i++) {
    		order = lookAt(i);
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(order.getOrderIdToString(), order.getOrderValueToString(), order.getDateToString()));
    		model.addRow(data);
    	}
    	table.setModel(model);
    }
    
    protected void saveRequests() {
    	this.clearFile();
    	Order order;
    	
    	for (int i = 0; i < getNumOfOrders(); i++) {
    		order = lookAt(i);
    		try {
        		writer = new BufferedWriter(new FileWriter(file, true));
        		writer.write(order.getOrderId() + ",");
        		writer.write(order.getOrderValueToString() + ",");
        		writer.write(order.getDateToString() + "");
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
			FileWriter fw = new FileWriter("requests.txt", false);
			PrintWriter pw = new PrintWriter(fw, false);
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public Order lookAt(int index) {
    	return orders.get(index);
    }
}
