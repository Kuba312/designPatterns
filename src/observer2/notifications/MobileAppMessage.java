package observer2.notifications;

import observer2.Order;

public class MobileAppMessage implements Observer {


    public void update(Order order) {
        System.out.println("MOBILE-APP: Order number: " + order.getOrderNumber() + " changed status " + order.getOrderStatus());

    }
}
