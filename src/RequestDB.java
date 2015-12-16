
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

public class RequestDB {

    private static ArrayList<Request> requests = new ArrayList<Request>();
    
    private BufferedWriter writer;
    private File file = new File("requests.txt");
    
    public RequestDB() {

    }

    public void addRequest(Request request) {
        requests.add(request);
    }

    public void removeRequest(Request request) {
        requests.remove(request);
    }

    public int getNumOfRequests() {
        if (requests.size() > 0) {
            return requests.size();
        } else {
            return 0;
        }
    }
    
    protected void addRequestsOnStartup(JTable table) throws ParseException {
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(file))) {
    		String text;
    		while((text = br.readLine()) != null) {
    			Request request = new Request();
    			String[] oa = text.split(",");
    			request.setRequestId(Integer.parseInt(oa[0]));
    			request.setRequestValue(Double.parseDouble(oa[1]));
    			request.setDate((Date) df.parse(oa[2]));
    			this.addRequest(request);
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
    
    protected void addRequestsToTable(JTable table) {
    	Request request;
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	Vector<String> data;
    	
    	int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
    	
    	for(int i = 0; i < getNumOfRequests(); i++) {
    		request = lookAt(i);
    		data = new Vector<String>();
    		data.addAll(Arrays.asList(request.getRequestIdToString(), request.getRequestValueToString() + " DKK", request.getDateToString()));
    		model.addRow(data);
    	}
    	table.setModel(model);
    }
    
    protected void saveRequests() {
    	this.clearFile();
    	Request request;
    	
    	for (int i = 0; i < getNumOfRequests(); i++) {
    		request = lookAt(i);
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
    
    public Request lookAt(int index) {
    	return requests.get(index);
    }
}
