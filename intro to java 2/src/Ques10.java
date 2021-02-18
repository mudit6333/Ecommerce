class Customer {
    String cname;
    int cid;
    int phone_number;
    Order order;

    public void place_order() {
    }
}

class Cashier {
    String name;
    Order order;
    Customer customer;

    public void create_order() {
    }
}

class Order {
    boolean status;
    int order_id;

    public Order() {
    }

    public boolean orderStatus() {
        return false;//default
    }
}

class Barista {
    Order order;

    public void createOrder() {
    }

    public Order getOrder() {
        return new Order();
    }

    public void updateOrder() {
    }
}

public class Ques10 {
    public static void main(String[] args) {

    }

}