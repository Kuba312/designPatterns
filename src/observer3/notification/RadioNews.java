package observer3.notification;

import observer3.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: " + weatherForecast.getTemperature() + " cisnienie: " + weatherForecast.getPressure());
    }
}
