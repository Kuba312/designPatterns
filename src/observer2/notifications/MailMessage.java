package observer2.notifications;

import observer2.Order;

public class MailMessage implements Observer {

    public void update(Order order) {
        System.out.println("MAIL:  Order number: " + order.getOrderNumber() + " changed status " + order.getOrderStatus());

    }
}
