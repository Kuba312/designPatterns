package observer2.notifications;

import observer2.Order;

public interface Observer {

    void update(Order order);
}
