package observer2.notifications;

import observer2.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("TEXT: Order number: " + order.getOrderNumber() + " changed status " + order.getOrderStatus());

    }
}
