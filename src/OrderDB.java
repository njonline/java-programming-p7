
import java.util.ArrayList;

public class OrderDB {

    private static ArrayList<Order> orders = new ArrayList<Order>();

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
}
