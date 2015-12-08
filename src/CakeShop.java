
public class CakeShop {

    public static void main(String[] args) throws Exception {
    	
    	CupcakeDB db = new CupcakeDB();
        Cupcake cupcake = new Cupcake();
        db.addCakesToComboBox();
        db.addCakesToOrderTable();
    }

}
