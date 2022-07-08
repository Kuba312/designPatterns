package observer3.notification;

import observer3.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("TV - nowa prognoza pogody: " + weatherForecast.getTemperature() + " cisnienie: " + weatherForecast.getPressure());

    }
}
