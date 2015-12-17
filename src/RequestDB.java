
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

/**
 * This class acts as database for all requests in the bakery.
 * @author Nicklas_b
 *
 */
public class RequestDB {

    private static ArrayList<Request> requests = new ArrayList<Request>(); //data structure
    
    private BufferedWriter writer; //new writer
    private File file = new File("requests.txt"); //new file
    
    public RequestDB() {

    }

    /**
     * Adds request to the data structure
     * @param request
     */
    public void addRequest(Request request) {
        requests.add(request);
    }

    /**
     * Removes request from data structure
     * @param request
     */
    public void removeRequest(Request request) {
        requests.remove(request);
    }

    /**
     * Returns the number of request elements in the data structure.
     * @return
     */
    public int getNumOfRequests() {
        if (requests.size() > 0) {
            return requests.size();
        } else {
            return 0;
        }
    }
    
    /**
     * Adds request from the textfile to data structure upon startup.
     * @param table
     * @throws ParseException
     */
    protected void addRequestsOnStartup(JTable table) throws ParseException {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //set date in nice format
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    		String text;
    		while((text = br.readLine()) != null) {
    			Request request = new Request();
    			String[] oa = text.split(","); //create string array and split by comma
    			request.setRequestId(Integer.parseInt(oa[0])); //set attributes
    			request.setRequestValue(Double.parseDouble(oa[1]));
    			request.setDate((Date) df.parse(oa[2]));
    			this.addRequest(request); //add request to data structure
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    /**
     * Adds all requests in the data structure to reqeuest table in the GUI.
     * @param table
     */
    protected void addRequestsToTable(JTable table) {
    	Request request;
    	DefaultTableModel model = (DefaultTableModel) table.getModel(); //get table model
    	Vector<String> data;
    	
    	int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) { //start by removing all rows
        	model.removeRow(i);
        }
    	
    	for(int i = 0; i < getNumOfRequests(); i++) { //then repopulate with requests in data structure
    		request = lookAt(i);
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(request.getRequestIdToString(), request.getRequestValueToString() + " DKK", request.getDateToString()));
    		model.addRow(data); //add row to table
    	}
    	table.setModel(model); //set model
    }
    
    /**
     * Save alle request to textfile.
     * This methods starts by clearing text file,
     * and the rewrite from data structure.
     */
    protected void saveRequests() {
    	this.clearFile(); // clear file
    	Request request;
    	
    	for (int i = 0; i < getNumOfRequests(); i++) { //loop through data structure
    		request = lookAt(i); //get request at index i
    		try {
        		writer = new BufferedWriter(new FileWriter(file, true));
        		writer.write(request.getRequestId() + ",");
        		writer.write(request.getRequestValueToString() + ",");
        		writer.write(request.getDateToString() + "");
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
     * Clear text file.
     */
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
    
    /**
     * Returns request at specified index of data structure.
     * @param index
     * @return
     */
    public Request lookAt(int index) {
    	return requests.get(index);
    }
}
