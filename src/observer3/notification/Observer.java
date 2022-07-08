package observer3.notification;

import observer3.WeatherForecast;

public interface Observer {

    void update(WeatherForecast weatherForecast);
}
