package observer2;

import observer2.notifications.MailMessage;
import observer2.notifications.MobileAppMessage;
import observer2.notifications.TextMessage;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(11L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileAppMessage mobileApp = new MobileAppMessage();
        MailMessage mailMessage = new MailMessage();

        order.registerObserver(textMessage);
        order.registerObserver(mailMessage);
        order.registerObserver(mobileApp);

        order.notifyObserver();

        System.out.println("---------------------------------------------------------");

        order.changeOrderStatus(OrderStatus.SENT);


    }
}
