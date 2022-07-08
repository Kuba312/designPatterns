package observer3.notification;

import observer3.WeatherForecast;
import observer3.notification.Observer;

public class InternetNews implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: " + weatherForecast.getTemperature() + " cisnienie: " + weatherForecast.getPressure());

    }
}
